package examen1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class preacticando {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		tarea2();
	}
	public static int tarea1() {
		int entero=0;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Introduce un numero entero por teclado");
			entero=sc.nextInt();
		}catch(InputMismatchException ex) {
			
			System.out.println("Tipo de dato incorrecto");
			tarea1();
		}
		return entero;
	}
	
	public static void tarea2() {
		String ruta="C:\\Users\\Pablo\\OneDrive\\Escritorio\\numeros.txt";
		
		try(BufferedReader reader=new BufferedReader(new FileReader(ruta))){
			String lineaLeida=null;
			
			while((lineaLeida=reader.readLine())!= null) {
				System.out.println(lineaLeida);
			}
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public static void tarea3() throws FileNotFoundException, IOException {
		String ruta="C:\\Users\\Pablo\\OneDrive\\Escritorio\\mediasImparesAndWhatEver.txt";
		
		
		try(BufferedReader reader=new BufferedReader(new FileReader(ruta))){
			while()
		}
	}
}
