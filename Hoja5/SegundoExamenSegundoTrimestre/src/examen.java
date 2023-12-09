import java.io.BufferedReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarea3();
	}
	
	public static void tarea1() {
		ArrayList<Municipio> listaMunicipios=new ArrayList<>();
		String ruta="C:\\Users\\Pablo\\OneDrive\\Escritorio\\municipios.txt";
		String lineaLeida="";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(ruta));
			while((lineaLeida=reader.readLine())!=null) {
				
				String [] partesLinea=lineaLeida.split(";");
				String nombre=partesLinea[0];
				int poblacion=Integer.parseInt(partesLinea[1]);
				String provincia=partesLinea[2];
				Municipio municipio=new Municipio(nombre, poblacion, provincia);
				listaMunicipios.add(municipio);
			}
			Collections.sort(listaMunicipios, new ComparadorProvincia().thenComparing(new comparadorNombre()).reversed());
				for(Municipio pueblo:listaMunicipios) {
					System.out.println(pueblo.toString());
				}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public static void tarea2() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduce una frase por teclado: ");
		String frase=sc.nextLine().toLowerCase().trim(),fraseFinal="";
	
		String[] palabras = frase.split(" ");
		
			//System.out.print(Arrays.toString(palabras));
		for(String palabra:palabras) {
			int longitud=palabra.length();
			if(longitud%2==0) {
				fraseFinal+=palabra.toUpperCase()+" ";
			}else {
				fraseFinal+=palabra+" ";
			}
		}
		System.out.println(fraseFinal);
	}
	
	
	public static void tarea3() {
		int opcion=0;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase por teclado: ");
		String frase = sc.nextLine();
		
		System.out.println("¿Que quieres hacer?\n");
		System.out.println("1.Calcular el numero medio de letras por palabra.");
		System.out.println("2.Calcular cual es la palabra mas larga y su longitud.");
		System.out.println("3.Calcular que porcentaje de palabras tienen tres letras o mas.");
		System.out.println("4.Salir");
		opcion = sc.nextInt();
		
		switch(opcion) {
		case 1:
			calcularNletras(frase);
			break;
		case 2:
			calcularPalabraLarga(frase);
			break;
		case 3:
			calcularPalabra3(frase);
			break;
		case 4:
			break;
		default:
			System.out.println("Introduce una opcion correcta por favor");
			break;
		}
		
		}while(opcion!=4);
		
		
		
	}
	
	public static void calcularNletras(String frase) {
		String [] palabras=frase.split(" ");
		
		int nPalabras=0,nLetras=0;
		
		for(String palabra:palabras) {
			nPalabras++;
		char [] letras=palabra.toCharArray();
		for(char letra:letras) {
			if (Character.isLetter(letra)) {
				nLetras++;
			}
		}
		}
		double mediaLetras=((double)nLetras/nPalabras);
		System.out.println("Hay "+nPalabras+" palabras y "+nLetras+" letras y hay una media de "+mediaLetras+" letras por palabra.");
	}

	public static void calcularPalabraLarga(String frase) {
		String [] palabras=frase.split(" ");
		
		int longitud=0,longitudMax=0;
		String palabraMax="";
		
		for(String palabra:palabras) {
			longitud=palabra.length();
			if(longitud>longitudMax) {
				longitudMax=longitud;
				palabraMax=palabra;
			}
		}
		System.out.println("La palabra mas larga es "+palabraMax+" y tiene "+longitudMax+" letras.");
	}
	
	
	public static void calcularPalabra3(String frase) {
		
	}
}
