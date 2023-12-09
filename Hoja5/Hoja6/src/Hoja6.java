import java.util.Arrays;
import java.util.Scanner;

public class Hoja6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarea56();
	}

	public static void tarea1() {
		String frase="Patatas Melendez son 4 gitanos y 3 robaperas";
		int contadorLetras=0;
		int espacios=0;
		int numeros=0;
		int conteo=0;
		
		for(int i=0;i<frase.length();i++) {
			if(Character.isLetter(frase.charAt(i))) {
				contadorLetras++;
			}else if(Character.isDigit(frase.charAt(i))) {
				numeros++;
			}else if(Character.isWhitespace(frase.charAt(i))) {
				espacios++;
			}
			
		}
		
		System.out.println("Hay "+contadorLetras+" letras, "+numeros+" numeros y "+espacios+" espacios en blanco");
		
	}
	
	
	
	public static void tarea2() {
		capitalizar("la mama de la mama de la mama");
	}	
		public static String capitalizar(String frase) {
			char[] aux;
			String fraseCapitalizada="";
			frase=frase.toLowerCase();
			
			String[] palabras=frase.split(" ");
			
			for(int i=0;i<palabras.length;i++) {
				aux=palabras[i].toCharArray();
				aux[0]=Character.toUpperCase(aux[0]);
				
				palabras[i]=String.valueOf(aux);
			}
			for(int i=0;i<palabras.length;i++) {
				fraseCapitalizada+=palabras[i]+" ";
			}
			
			System.out.println(fraseCapitalizada);
			return fraseCapitalizada;
			
		}
	
	
	public static void ejercicio1() {
		String frase="Patatas Melendez me va a chupar la sangre";
		String resultado="";
		int contador=0;
		frase=frase.toLowerCase();
		for(int i=0;i<frase.length();i++) {
			if(contador%2!=0) {
				resultado+=Character.toUpperCase(frase.charAt(i));
			}else {
				resultado+=Character.toLowerCase(frase.charAt(i));
			}
			contador++;
		}
		System.out.println(resultado);
	}
	
	
	public static int[] ejercicio2a(int min,int max,int cantidad) {
		int tabla[];
		
		if(max-min>=5) {
			tabla=new int[cantidad];
			for(int i=0;i<tabla.length;i++) {
				tabla[i]=(int)((max-min+1)*Math.random()+min);
			}
		}else {
			tabla = new int[0];
		}
		System.out.println(Arrays.toString(tabla));
		return tabla;
	}
	
	public static void ejercicio3() {
		int cantidad=0,cantidadMax=0;
		String frase;
		String[] palabraMax;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		frase=sc.nextLine();
		
		String[] palabras=frase.split(" ");
		
		for(String palabra:palabras) {
			
			
			for(int i=0;i<palabra.length();i++) {
				if(palabra.charAt(i)=='a'||palabra.charAt(i)=='A'||palabra.charAt(i)=='á'||palabra.charAt(i)=='Á') {
						cantidad++;
				}
			}
		}
		
		if(cantidad>cantidadMax) {
			palabraMax=palabras;
			cantidadMax=cantidad;
		}
		cantidad=0;
		
		
	}
	
	public static void tarea26() {
		invertir();
	}
	
	public static String invertir() {
		String invertida="",frase="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase por teclado rey: ");
		frase=sc.nextLine();
		
		for(int i=frase.length()-1;i>=0;i--) {
			invertida+=frase.charAt(i);
		}
		
		System.out.println(invertida);
		return invertida;
		
			}
	
	public static void tarea36() {
		String frase="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		frase=sc.nextLine();
		String[] caracteres= {"a","A","á","e","E","é","i","I","í","o","O","ó","u","U","ú"};
		for(int i=0;i<caracteres.length;i++) {
			frase=frase.replace(caracteres[i],"");
	}
		
		System.out.println(frase);
		
}
	
	
	public static void tarea46() {
		String frase="",palabra="";
		int contador=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase por teclado: ");
		frase=sc.nextLine();
		System.out.println("Introduce una palabra por teclado: ");
		palabra=sc.nextLine();
		
		frase=frase.toLowerCase();
		palabra=palabra.toLowerCase();
		
		String [] frasePartida=frase.split("[ ,.:;]");
		
		System.out.println(Arrays.toString(frasePartida));
		
		for(int i=0;i<frasePartida.length;i++) {
			if(frasePartida[i].equals(palabra)) {
				 contador++;
			}
			
		}
		System.out.println("La palabra aparece "+contador+" veces");
		
	}
	
	public static void tarea56() {
		String palabra1="",palabra2="";
		char [] palabraChars1,palabraChars2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra por teclado: ");
		palabra1=sc.nextLine().split(" ")[0];
		System.out.println("Introduce otra palabra: ");
		palabra2=sc.nextLine().split(" ")[0];
		palabraChars1=palabra1.toCharArray();
		palabraChars2=palabra2.toCharArray();
		Arrays.sort(palabraChars1);
		Arrays.sort(palabraChars2);
		
		if(Arrays.equals(palabraChars1, palabraChars2)) {
			System.out.println("Si son anagramas");
		}else {
			System.out.println("No son anagramas");
		}
		
		
		
		
	}
}
