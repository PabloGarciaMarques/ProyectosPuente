import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tarea1();
		tarea5();
	}
	public static void tarea1() {
		String rutaDos="C:\\Users\\Pablo\\OneDrive\\Escritorio\\putencias.dat";
		
		try {
			for(int i=0;i<=20;i++) {
			int potencia=(int) Math.pow(2, i);
			
				DataOutputStream dos = new DataOutputStream(new FileOutputStream(rutaDos));
				dos.writeInt(potencia);
				//System.out.print("2^"+i+"="+potencia+" ");
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	public static void tarea2() {
		String rutaDos="C:\\Users\\Pablo\\OneDrive\\Escritorio\\putencias.dat";
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream(rutaDos));
			for(int i=0;i<20;i++) {
			int potencia=dis.readInt();
			System.out.print(potencia+" ");
			
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void tarea5() {
		String ruta="C:\\Users\\Pablo\\Downloads\\peliculas (1).txt";
		String linea="";
		int contador=0;
		ArrayList<Pelicula> listaPeliculas=new ArrayList<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(ruta));
			while((linea=reader.readLine())!=null) {
				String [] partesLinea=linea.split(";");
				
				String titulo=partesLinea[0];
				int duracion=Integer.parseInt(partesLinea[1]);
				int anyoLanzamiento=Integer.parseInt(partesLinea[2]);
				double notaIMDB=Double.parseDouble(partesLinea[3]);
				
				Pelicula peli=new Pelicula(titulo, duracion, anyoLanzamiento, notaIMDB);
				
				listaPeliculas.add(peli);
				
			}
			Collections.sort(listaPeliculas,Pelicula.compararNota.reversed());
			for (Pelicula peli:listaPeliculas) {
				
				System.out.println(peli.toString());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	}

