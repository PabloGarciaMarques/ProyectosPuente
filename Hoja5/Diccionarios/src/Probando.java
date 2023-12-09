import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Probando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pruebaDeHashMAp();
	}
	
	public static void pruebaDeHashMAp() {
		Map<String, String> diccionario=new HashMap<>();
		
		diccionario.put("Perrete", "Un perrete muy majo");
		diccionario.put("Gatete", "Un gatete muy majo");
		diccionario.put("Lorito", "Un lorito muy majo");
		diccionario.put("Nutria", "Una nutria muy maja");
		
		String definicion=diccionario.get("Perrete");
		System.out.println(definicion);
		
		
		Scanner sc = new Scanner(System.in);
		String palabraBuscar=sc.nextLine();
		
		if(diccionario.containsKey(palabraBuscar)) {
		System.out.println(diccionario.get(palabraBuscar));
		}
		
		for(Map.Entry<String,String> entrada:diccionario.entrySet()) {
			System.out.println(entrada.getKey()+" : "+entrada.getValue());
		}
	}
}
