import java.util.Scanner;

public class ExamenSeptiembre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarea3();
	}

	public static void tarea2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce una frase por teclado");
		String frase=sc.nextLine();
		frase.toLowerCase();
		String resultado="";
		String[] partesFrase=frase.split(" ");
		
		for(String palabra:partesFrase) {
			if(palabra.length()%2==0) {
				palabra=palabra.toUpperCase();
				resultado+=palabra+" ";
			}else {
				resultado+=palabra+" ";
			}
		}
		System.out.println(resultado);
	}
	
	public static void tarea3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String frase=sc.nextLine().trim();
		
		
		System.out.println("Elige una opcion: ");
		System.out.println("1. Calcular numero medio de letras por palabra.");
		System.out.println("2. Calcular que palabra es mas larga y cuantas letras tiene.");
		System.out.println("3. Calcular que porcentaje de palabras tienes 3 letras o mas");
		int opcion=sc.nextInt();
		sc.nextLine();
		switch(opcion){
		case 1:
			
			nMedioLetras(frase);
			break;
		case 2:
			
			palabraLarga(frase);
			break;
		case 3:
			
			porcentaje(frase);
			break;
		}
		}
	
	public static void nMedioLetras(String frase) {
		int nTotalLetras=0,nTotalPalabras=0;
		String [] palabras=frase.split(" ");
		for(String palabra:palabras) {
			nTotalPalabras++;
			char[]letras=palabra.toCharArray();
			for(char letra:letras) {
				if(Character.isLetter(letra)) {
					nTotalLetras++;
				}
			}
		}
		double media=((double) nTotalLetras/nTotalPalabras);
		
		System.out.println("Hay "+nTotalLetras+" letras y "+nTotalPalabras+" palabras, la media es de "+media);
		
	}
	
	public static void palabraLarga(String frase) {
		int Lp=0,LpMax=0;
		String pL="";
		String [] palabras=frase.split(" ");
		for(String palabra:palabras) {
			Lp=palabra.length();
			if(Lp>LpMax) {
				LpMax=Lp;
				pL=palabra;
			}
		}
		System.out.println("La palabra mas larga es "+pL+" y tiene "+LpMax+" letras");
		
		
		
	}
	public static void porcentaje(String frase) {			
		int palabrasT=0,palabras3mas=0;
		String [] palabras=frase.split(" ");
		for(String palabra:palabras) {
			if(palabra.length()>=3) {
				palabrasT++;
				palabras3mas++;
			}else {
				palabrasT++;
			}
		}
		System.out.println("Hay "+palabrasT+" y de ellas "+palabras3mas+" tienen tres letras o mas");
	}
}

