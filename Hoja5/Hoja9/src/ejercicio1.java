import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio1 {

	private static double totalEdades;
	private static double numJugadores;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarea7();
	}
	public static void tarea2() {
		String ruta="C:\\Users\\Pablo\\OneDrive\\Escritorio\\textoPrueba.txt";
		
		try(FileReader reader=new FileReader(ruta)){
			int valorLeido=0;
			while((valorLeido=reader.read())!=-1) {
				System.out.println((char)valorLeido);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void tarea3() {
		String ruta="C:\\Users\\Pablo\\OneDrive\\Escritorio\\numeros.txt";
		double numero=0,media=0,suma=0;
		int totalNum=0;
		try(Scanner sc=new Scanner(new FileReader(ruta))){
			while(sc.hasNext()) {
				numero=sc.nextDouble();
				suma+=numero;
				totalNum++;
				System.out.println(numero+" ");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		media=(double)suma/totalNum;
		System.out.println("suma: "+suma+" media: "+media);
	}
	
	
	public static void tarea4() {
		int totalPares=0,totalImpares=0,sumaImpares=0,numero=0;
		double mediaImpares=0;
		
		String ruta="C:\\Users\\Pablo\\OneDrive\\Escritorio\\numeros.txt";
		
		try(BufferedReader reader=new BufferedReader(new FileReader(ruta))){
			String lineaLeida;
			String [] partesLeidas=null;
			
			while((lineaLeida=reader.readLine())!=null) {
				partesLeidas=lineaLeida.split(" ");
				for(String numS:partesLeidas) {
					System.out.println(numS);
					numero=Integer.parseInt(numS);
					
					if(numero%2!=0) {
						totalImpares++;
						sumaImpares+=numero;
					}else {
						totalPares++;
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mediaImpares=(double)sumaImpares/totalImpares;
		System.out.println("Hay "+totalPares+" numeros pares"+", "+totalImpares+" impares, cuya media es "+mediaImpares);
		
	}
	
public static void tarea5() {
	String ruta="C:\\Users\\Pablo\\OneDrive\\Escritorio\\jugadores.txt";
	double mediaEdad=0,mediaEstatura=0,totalEstaturas=0,estaturaMax=0,estaturaMin=0;
	int totalJugadores=0,edadTotal=0,edadMin=0,edadMax=0;
	
	String nombreJugadorMasAlto="",nombreJugadorMasBajo="",nombreJugadorMasJoven="",nombreJugadorMasViejo="";
	
	try(BufferedReader reader=new BufferedReader(new FileReader(ruta))) {
		String LineaLeida=null;
		String [] partesLinea=null;
		String nombre,edadS,alturaS;
		int edad=0;
		double estatura=0;
		
	while((LineaLeida=reader.readLine())!=null) {
		partesLinea=LineaLeida.split(";");
		nombre=partesLinea[0];
		edadS=partesLinea[1];
		alturaS=partesLinea[2];
		
		
		edad=Integer.parseInt(alturaS);
		estatura=Double.parseDouble(alturaS);
		
		edadTotal+=edad;
		totalEstaturas+=estatura;
		
		if(totalJugadores==0) {
			edadMax=edad;
			edadMin=edad;
			estaturaMax=estatura;
			estaturaMin=estatura;
		}
		totalJugadores++;
		if (edad>edadMax){
			edadMax=edad;
			nombreJugadorMasViejo=nombre;
		}
		if(edad<edadMin) {
			edadMin=edad;
			nombreJugadorMasJoven=nombre;
		}
		if(estatura>estaturaMax) {
				estaturaMax=estatura;
				nombreJugadorMasAlto=nombre;
			}
			if(estatura<estaturaMin) {
				estaturaMin=estatura;
				nombreJugadorMasBajo=nombre;
			}
		}
	}catch(Exception ex) {
		System.out.println(ex.toString());
	}
	mediaEdad=(double)totalEdades/numJugadores;
	mediaEstatura=(double)totalEstaturas/numJugadores;
	
	System.out.println("La edad media es de "+mediaEdad+" y la media de altura es de "+mediaEstatura);
	System.out.println("El jugador más joven es "+nombreJugadorMasJoven+"  y el más mayor "+nombreJugadorMasViejo);
	System.out.println("El jugador más alto es "+nombreJugadorMasAlto+" y el más bajo es "+nombreJugadorMasBajo);
	}


public static void tarea6() {
	String ruta="C:\\Users\\Pablo\\OneDrive\\Escritorio\\TextoEj7.txt";
	String texto="RataTopo";
	
	try(BufferedWriter writer=new BufferedWriter(new FileWriter(ruta,true))){
		writer.write(texto);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static void tarea7() {
	String rutaOriginal="‪C:\\Users\\Pablo\\OneDrive\\Escritorio\\";
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el nombre del archivo que quieras copiar");
	String archivoCopiar = sc.nextLine();
	String archivo=rutaOriginal+archivoCopiar;
	
	String archivoCopia="Copia de "+archivo;
	File file=new File(archivo);
	
	if(file.exists()==false) {
		System.out.println("Archivo no encontrado");
		return;
	}else {
		try(BufferedReader reader = new BufferedReader(new FileReader(archivo))){
			BufferedWriter writer=new BufferedWriter(new FileWriter(archivoCopia));
			String lineaLeida="";
			while((lineaLeida=reader.readLine())!=null) {
				writer.write(lineaLeida);
				writer.newLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}

public static void tarea9() {
	String ruta="‪C:\\Users\\Pablo\\OneDrive\\Escritorio\\el cuervo.txt";
	Scanner sc = new Scanner(System.in);
	int mostradas=0;
	try(BufferedReader reader = new BufferedReader(new FileReader(ruta))){
		String lineaLeida=null;
		while((lineaLeida=reader.readLine())!=null) {
			System.out.println(lineaLeida);
			mostradas++;
			if(mostradas>=12) {
				mostradas=0;
				sc.nextLine();
			}
		}
	}catch(IOException ex) {}
	
}

public static void ejercicio9() {
		String rutaFichero="‪C:\\Users\\Pablo\\OneDrive\\Escritorio\\el cuervo.txt";
		int mostradas=0;
		Scanner sc=new Scanner(System.in);
		try(BufferedReader reader=new BufferedReader(new FileReader(rutaFichero))){
			String lineaLeida=null;
			while((lineaLeida=reader.readLine())!=null) {
				System.out.println(lineaLeida);
				mostradas++;
				if(mostradas>=12) {
					mostradas=0;
					sc.nextLine();
				}  				
			}
		}catch(Exception ex) {}
	}
}

