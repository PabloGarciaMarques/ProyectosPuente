package repaso;

import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarea12();
	}
	
	public static void tarea1() {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Introduce un numero: ");
			numero=sc.nextInt();
		if(numero%2==0) {
			System.out.println("El numero es par.");
		}else {
			System.out.println("El numero en impar.");
			
		}
		if(numero>=0) {
			System.out.println("El numero es positivo.");
		}else {
			System.out.println("El numero es negativo.");
		}
		
		int cuadrado=numero*numero;
		System.out.println("El cuadrado es: "+cuadrado);
	}while(numero!=0);
	}
	
	
	public static void tarea2() {
		Scanner sc = new Scanner (System.in);
		int edad,suma=0,alumnos=0,mayores=0;
		double mediaEdad=0;
		
		do {
			System.out.println("Introduce una edad: ");
			edad=sc.nextInt();
			
			
			if(edad>=0&&edad<18) {
				alumnos++;
				suma+=edad;
			}else if(edad>=18) {
				mayores++;
				alumnos++;
				suma+=edad;
			}
			if(edad==0) {
			mediaEdad=(double)(suma/(alumnos-1));
			System.out.println(suma+" "+alumnos);
			System.out.println("Hay "+alumnos+" alumnos en total, de ellos  "+mayores+" son mayores de edad, y\nla media de edad es de "+mediaEdad+" años.");
			}
			
		}while(edad>0);
		
	}
	
	public static void tarea3() {
		Scanner sc = new Scanner(System.in);
		int numeroSecreto=(int) (99*Math.random()+1);
		
		int numJugador;
		
		System.out.println("Intoduce tu numero: ");
		
		do {
			
			numJugador=sc.nextInt();
				if(numJugador==-1) {
					System.out.println("Te has rendido");
					break;
			}else if(numeroSecreto<numJugador) {
				System.out.println("El numero secreto es mas pequeño.");
			}else if(numeroSecreto>numJugador) {
				System.out.println("El numero secreto es mas grande.");
			}else if(numeroSecreto==numJugador) {
				System.out.println("Enhorabuena, has acertado");
				break;
			
			} 
			
			
		}while(numJugador!=numeroSecreto||numJugador!=-1);
		
		
	}
	
	
	public static void tarea4() {
		int idArbol=0,idArbolMasAlto=0,alturaCM,alturaMayor = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduce la altura de un alrbol en centimetros: "+idArbol);
			alturaCM=sc.nextInt();
			if(alturaCM>alturaMayor) {
				idArbolMasAlto=idArbol;
				alturaMayor=alturaCM;
			}
			idArbol++;
		}while(alturaCM!=-1);
		System.out.println("El árbol más alto es el de índice "+idArbolMasAlto+" que mide "+alturaMayor);
		
		
	}

	public static void tarea5() {
		Scanner sc = new Scanner(System.in);
		int num1,num2,jugador,suma,racha=0;
		do {
			 num1=(int)(99*Math.random()+1);
			 num2=(int)(99*Math.random()+1);
			 suma=num1+num2;
			
			System.out.println("¿Cuanto suman estos dos numeros? "+num1+" + "+num2);
			jugador=sc.nextInt();
			
			if(jugador==suma) {
				racha++;
			}
			if(jugador!=suma) {
				break;
			}
			
		}while(jugador==suma);
		
		System.out.println("Lástima, has fallado, has conseguido una racha de "+racha+" aciertos seguidos.");
	}
	
	public static void tarea6() {
		int i=0;
		
		for(i=0;i<=100;i++) {
			if(i%2==0&&i%3==0&&i%8!=0){
				System.out.println(i);
			}
		}
	}
	
	public static void tarea7() {
		int i=0;
		for(i=0;i<=100;i++) {
			if(i%7==0) {
				System.out.println(i);
			}
		}
	}
	
	public static void tarea8() {
		int num,factorial=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero para calcular su factorial ");
		num=sc.nextInt();
		while(num!=1) {
			factorial=factorial*num;
			num--;
		}
		System.out.println(factorial);
	}
	
	public static void tarea9() {
		Scanner sc = new Scanner(System.in);
		double nota1,nota2,nota3,nota4,nota5,nota6;
		
		
	}
	
	public static void tarea10(int k) {
		int totalPrimos=0;
		boolean esPrimo=true;
		
		/*El bucle externo recorrerá todos los números desde 2 hasta k, el número
		  elegido*/
		for(int i=2;i<=k;i++) {		
			//Recorro todos los números entre 2 y el número que está siendo estudiado
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					esPrimo=false;
					break;
				}		
			}			
			if(esPrimo) {
				System.out.println("Numero :"+i);
				totalPrimos++;
			}			
		esPrimo=true;
		}
		System.out.println("Total primos"+totalPrimos);
	}
	public static void tarea12() {
        
        Scanner sc = new Scanner(System.in);
     System.out.print("Introduzca numero de filas: ");
     int numFilas = sc.nextInt();
     sc.close();

     System.out.println();
     for(int altura = 1; altura<=numFilas; altura++){
         
         for(int blancos = 1; blancos<=numFilas-altura; blancos++){
             System.out.print(" ");
         }

         for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
             System.out.print("*");
         }
         System.out.println();
     }
}

}
