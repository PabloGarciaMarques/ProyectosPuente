package examen1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class examen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejericicio5();
	}
	public static short ejercicio3(int limiteInferior,int limiteSuperior) {
		short cantidad=0;
		
		for(int i=limiteInferior;i<=limiteSuperior;i++) {
			if(i%3==0&&i%4==0){
				System.out.println(i+" ");
				cantidad++;
			}
		}
		if(limiteInferior>=limiteSuperior) {
			System.out.println("El limite inferior no puede ser mayor o igual que el límite superior");
		}
		
		return cantidad;
	}

	
	
	
	public static void tarea4() {
		
			double alturaMedia=0,alturaMax=0,alturaMin=0,alturaLeida=0,alturaAcumulada=0;
			int indexMasBaja=0,indexMasAlta=0,k=1;
			Locale.setDefault(new Locale("es"));
			Scanner teclado=new Scanner(System.in);
			do {
				System.out.println("Introduce la altura del alumno "+k);
				alturaLeida=teclado.nextDouble();
				if(alturaLeida==0) {
					break;
				}
				//alturaAcumulada=alturaAcumulada+alturaLeida;
				alturaAcumulada+=alturaLeida;
				
				if(alturaLeida>alturaMax) {
					alturaMax=alturaLeida;
					indexMasAlta=k;
				}
				if(alturaLeida<alturaMin||alturaMin==0) {
					alturaMin=alturaLeida;
					indexMasBaja=k;
				}
				k++;			
			}while(true);
			alturaMedia=alturaAcumulada/(k-1);
			System.out.println("Altura media: "+alturaMedia);
			System.out.println("Index persona más alta "+indexMasAlta+"con una altura de "+alturaMax);
			System.out.println("Index persona más baja "+indexMasBaja+"con una altura de "+alturaMin);
		}


	public static void tarea5(int n) {
		do {
			System.out.println(n+"->");
			if(n%2==0) {
				n=n/2;
			}else {
				n=n*3+1;
			}
		}while(n!=1);
		
		System.out.println(n);
	}
	
	public static void tarea7() {
		int a,b,resultado = 0,respuesta = 0,racha=0;
		Scanner sc = new Scanner(System.in);
		do {
			
		a=(int)(10*Math.random()+1);
		b=(int)(10*Math.random()+1);
		
		System.out.println("Cuanto da esta multiplicacion: "+a+"*"+b);
		
		resultado=a*b;
		respuesta=sc.nextInt();
		racha++;
		}while(resultado==respuesta);
	
		System.out.println("has conseguido una racha de "+racha);
		
		
	}
	
	public static void ejericicio5() {
		double [] tabla=new double[0];
		double [] tablaInvertida;
		int posicion=0;
		double numero=0;
		Scanner sc = new Scanner(System.in); 
		do {
			System.out.println("Introduce un numero decimal positivo");
			numero=sc.nextDouble();
			if(numero>0) {
				tabla=Arrays.copyOf(tabla, tabla.length+1);
				tabla[tabla.length-1]=numero;
				
			}
			
			
		}while(numero>0);
		tablaInvertida=new double[tabla.length];
		System.out.println(Arrays.toString(tabla));
		
		for(int i=tabla.length-1;i>=0;i--) {
			tablaInvertida[posicion]=tabla[i];
			posicion++;
		}
		
		System.out.println(Arrays.toString(tablaInvertida));
		
	}
}