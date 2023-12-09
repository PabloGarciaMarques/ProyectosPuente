package lecturaYescritura;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lecturaYescritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pruebas();
	}
	public static void tarea1() {
		String ruta="C:\\Users\\Pablo\\OneDrive\\Escritorio\\nigeriano.txt";
		
		
		try(FileReader reader = new FileReader(ruta)){
			int cursor=reader.read();
			while(cursor!=-1) {
				if(cursor!=32) {
					System.out.print((char)cursor);
				}
				cursor=reader.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void tarea2() {
		String ruta="C:\\Users\\Pablo\\OneDrive\\Escritorio\\nigeriano.txt";
		String texto="Mi moto alpina derrapante";
		texto.equalsIgnoreCase(" ");
		texto=texto.toUpperCase();
		try(FileWriter writer=new FileWriter(ruta)){
			writer.write(texto);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void pruebas() {
		 String factos ="Judios, negros y gitanos todos ladrones";
		 int i=0;
		 factos= factos.toUpperCase();
		 while(i<5) {
			 System.out.println(factos);
			 i++;
		 }
		 
	}
	
	public static void tarea3() {
		
	}
}
