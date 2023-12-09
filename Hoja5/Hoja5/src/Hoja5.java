import java.util.Arrays;
import java.util.Scanner;

public class Hoja5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabras[]= {"aaaa","bb","ccccccc","aaabbgs","abf","acdgs"};
		ej3(palabras,'a');
		
	}
	public static void tarea1() {
		int tamaño=12,i;
		int [] tabla = new int[tamaño];
		
		int suma=0;
		
		for(i=0;i<tabla.length;i++) {
			tabla[i]=(int)(99*Math.random()+1);
			suma+=tabla[i];
		}
		System.out.println(Arrays.toString(tabla));
		System.out.println(suma);
	}
	
	public static void tarea2() {
		double tabla[] = new double[5];
		double tablaInvertida[] = new double[5];
		int i,k;
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<tabla.length;i++) {
			System.out.println("Introduce un numero decimal");
			tabla[i]=sc.nextDouble();
		}
		
		for(k=tabla.length-1;k>=0;k--) {
			System.out.print(tabla[k]+" ");
		}
		System.out.println(Arrays.toString(tabla));
		
	}
	
	public static void tarea3() {
		int longitud=100000,i;
		int tabla[] = new int[longitud];
		
		for(i=0;i<tabla.length;i++) {
			tabla[i]=(int)(25*Math.random()+1);
			
		}
	}
	public static int maximoV2(int[] tabla) {
		int maximo=tabla[0];		
		for(int i=1;i<tabla.length;i++) {
			if(tabla[i]>maximo) {
				maximo=tabla[i];
			}
		}		
		System.out.println(maximo);
		return maximo;
	}
	
	public static void tarea4() {
		
		int[] tabla=rellenaPares(5,50);	
	}
	
	public static int[] rellenaPares(int longitud,int fin) {
			int[] tabla= new int[longitud];
			int numero=0;
			
			for(int i=0;i<tabla.length;i++) {
				numero=(int)(fin*Math.random()+1);
				if(numero%2==0) {
					tabla[i]=numero;
				}
			}
			System.out.println(Arrays.toString(tabla));
			return tabla;
	}
	
	
	public static int verificarCombinacion(int[] apuesta, int[] combinacionGanadora) {
		int aciertos=0;
		for(int i=0;i<apuesta.length;i++) {
			if(Arrays.binarySearch(combinacionGanadora, apuesta[i])>=0) {
				aciertos++;
			}
		}
		System.out.println("Nº de aciertos "+aciertos);
		return aciertos;
	}
	
	public static void ejercicio1() {
		int tabla[]=new int[10];
		int i=0;
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<tabla.length;i++) {
			
		System.out.println("Introduce un numero entero: ");
		tabla[i]=sc.nextInt();
		}
		Arrays.sort(tabla);
		System.out.println(Arrays.toString(tabla));
		}
		
	/*public static void ejercicio2() {
		int numeros[]=new int[20];
		int primos[]=new int[20];
		int i;
		int contador=0;
		boolean esPrimo=false;
		
		
		
		for(i=0;i<=20;i++) {
			int numero=(int)(99*Math.random()+1);
			numeros[i]=numero;
			
		}
		
		for(int j=0;j<=20;j++) {
			if(numeros[i]%i==0) {
				esPrimo=false;
			}else {
				esPrimo=true;
				contador++;
			}
			
		System.out.println(Arrays.toString(numeros));
		System.out.println("Hay "+contador+" numeros primos");
		}
		
	}*/
	
	
	public static void ej1(int[] tabla,int n) {
		int contador=0;
		for(int i=0;i<tabla.length;i++) {
			if(tabla[i]==n) {
				contador++;
			}
			
		}
		System.out.println("El numero "+n+" aparece "+contador+" veces");
	}
	public static void ej2(String[] palabras) {
		
		String palabraMax="";
		for(int i=0;i<palabras.length;i++) {
			if(palabras[i].length()>palabras.length) {
				palabraMax=palabras[i];
			}	
			
		}
		System.out.println("La palabras mas larga es "+palabraMax);
	}
	
	public static void ej3(String[] palabras,char letra) {
		
		
		for(int i=0;i<palabras.length;i++) {
			if(palabras[i].charAt(0)==letra) {
				System.out.println(palabras[i]);
			}
		}
	}
	
	public int[] ej4(int tabla1[],int tabla2[]) {
		  int tabla3[];
			if(tabla1.length>tabla2.length) {
				tabla3=new int[tabla2.length];
		  }else {
			  tabla3=new int[tabla1.length];
		  }
		
		
		return tabla3;
	}
	
	}

