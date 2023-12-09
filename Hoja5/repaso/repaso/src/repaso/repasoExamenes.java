package repaso;

import java.util.Arrays;
import java.util.Scanner;

public class repasoExamenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarea3();
	}
	public static void ejercicio1(String cadena) {
		String resultado="";
		cadena=cadena.toLowerCase();
		for(int i = 0;i<cadena.length();i++) {
			if(i%2==0) {
				resultado+=Character.toUpperCase(cadena.charAt(i));
			}else {
				resultado+=cadena.charAt(i);
			}
		}
		System.out.println(resultado);
		return;
	}
	
	public static void tarea2(int limInf,int limSup,int cantidad) {
		int [] tabla= new int [cantidad];
		
		if(limSup>=limInf+5) {
			
		tabla=new int[cantidad];
		
		for(int i=0;i<cantidad;i++) {
			tabla[i]=(int)((limSup-limInf+1)*Math.random()+limInf);
		}
		}else {
			tabla=new int[0];
		}
		System.out.println(Arrays.toString(tabla));
		return;
		
	}
	
	public static void tarea3() {
		int cantidadA=0,cantidadMax=0;
		String palabraMax=null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		
		String frase=sc.nextLine();
		
		String [] palabras=frase.split(" ");
		
		for(String palabra:palabras) {
			
			for(int i=0;i<palabra.length();i++) {
				if(palabra.charAt(i)=='a'||palabra.charAt(i)=='A') {
					cantidadA++;
				}
			}
			if(cantidadA>cantidadMax) {
				
				palabraMax=palabra;
				cantidadMax=cantidadA;
			}
			//cantidadA=0;
			}
		System.out.println(palabraMax+"   "+cantidadMax);
		}
	
	
	public static void tarea4() {
		
	}
}
