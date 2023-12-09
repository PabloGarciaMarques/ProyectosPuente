import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarea1();
	}
	
	public static void tarea2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase por teclado per favore");
		String frase = sc.nextLine().toLowerCase().trim();
		String fraseFinal="";
		String [] partesLinea=frase.split(" ");
		for(String palabra:partesLinea) {
			int longitud=palabra.length();
			if(longitud%2==0) {
				fraseFinal+=palabra.toUpperCase()+" ";
			}else {
				fraseFinal+=palabra.toLowerCase()+" ";
			}
		}
		System.out.println(fraseFinal);
	}
	
	public static void tarea3() {
		Scanner sc = new Scanner(System.in);
		int opcion=0;
		System.out.println("Introduce una frase por teclado y elige una opcion: ");
		String frase=sc.nextLine();
		do {
		System.out.println("1.Calcular el numero medio de letras por palabra.");
		System.out.println("2.Cual es la palabra mas larga y su longitud.");
		System.out.println("3.¿Que porcentaje de palabras tiene 3 letras o mas.");
		System.out.println("4.Salir.");
		 opcion=sc.nextInt();
		
		
		switch(opcion){
		case 1:
			nMedio(frase);
			break;
			
		case 2:
			palabraLarga(frase);
			break;
			
		case 3:
			porcentaje(frase);
			break;
			
		case 4:
			System.out.println("Adios ah");
			break;
		}
		}while(opcion!=4);
	}
	public static void nMedio(String frase) {
		String [] palabras=frase.split(" ");
		int nPalabras=0,nLetras=0;
		for(String palabra:palabras) {
			nPalabras++;
		char[] letras=palabra.toCharArray();
		for(char letra:letras) {
		if(Character.isLetter(letra)) {
			nLetras++;
		}
		
		}
		}
		double media=((double) nLetras/nPalabras);
		System.out.println("Hay "+nPalabras+" y tienen "+nLetras+" letras en total, y hay una media de "+media+" letras por palabra." );
	}
	
	public static void palabraLarga(String frase) {
		String [] palabras=frase.split(" ");
		int longitud=0,longitudMax=0;
		String palabraA="",palabraLarga="";
		for(String palabra:palabras) {
			longitud=palabra.length();
			if(longitud>longitudMax) {
				palabraLarga=palabra;
				longitudMax=longitud;
			}
		}
		
		System.out.println(palabraLarga+" y tiene "+longitudMax);
	}
	
	public static void porcentaje(String frase) {
		String [] palabras=frase.split(" ");
		int cantidadLetras=0,palabras3omas=0,palabrasT=0;
		for(String palabra:palabras) {
			int longitud=palabra.length();
			if(longitud>=3) {
				palabras3omas++;
				palabrasT++;
			}else {
				palabrasT++;
			}
		}
		double porcentaje=((double) palabras3omas/palabrasT)*100;
		System.out.println(porcentaje);

	}
	
	public static void tarea1() {
		Scanner sc = new Scanner(System.in);
		String ruta="C:\\Users\\Pablo\\OneDrive\\Escritorio\\municipios.txt";
		ArrayList<Municipio> listaMunicipios=new ArrayList<>();
		String linea="";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(ruta));
			while((linea=reader.readLine())!=null) {
				String [] partesLinea=linea.split(";");
				String nombre=partesLinea[0];
				int poblacion= Integer.parseInt(partesLinea[1]);
				String provincia=partesLinea[2];
				Municipio municipio=new Municipio(nombre, poblacion, provincia);
				listaMunicipios.add(municipio);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("¿Que quieres hacer con los datos?");
		System.out.println("1.Listar municipios por poblacion decreciente.");
		System.out.println("2.Listar municipios alfabeticamente.");
		System.out.println("3.Listar municipios ordenados alfabeticamente por provincia.");
		System.out.println("4.Salir.");
		int opcion=sc.nextInt();
		
		
		switch(opcion) {
		
		case 1:
			listarPoblacion(listaMunicipios);
			break;
		case 2:
			listarAlf(listaMunicipios);
			break;
		case 3:
			listarProv(listaMunicipios);
			break;
		
		case 4:
			System.out.println("Gracias por usar nuestros servicios");
			break;
		}
		
	}
	
	public static void listarPoblacion(ArrayList<Municipio> listaMunicipios) {
		Collections.sort(listaMunicipios,Collections.reverseOrder());
		for(Municipio pueblo:listaMunicipios) {
			System.out.println(pueblo.toString());
		}
	}
	
	public static void listarAlf(ArrayList<Municipio> listaMunicipios) {
		Collections.sort(listaMunicipios,new comparadorAlfabetico());
		for(Municipio pueblo:listaMunicipios) {
			System.out.println(pueblo.toString());
		}
	}
	public static void listarProv(ArrayList<Municipio> listaMunicipios) {
	Collections.sort(listaMunicipios,new comparadorProvincia().thenComparing(new comparadorAlfabetico()));
		for(Municipio pueblo:listaMunicipios) {
			System.out.println(pueblo.toString());
		}
	
}
}
