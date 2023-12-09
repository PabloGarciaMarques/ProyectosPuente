import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Hoja12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarea3();
	}
	public static void tarea1() {
		
		ArrayList<Integer> listaNumeros=new ArrayList<>();
		for(int i=0;i<30;i++) {
			int num=(int)(10*Math.random()+1);
			listaNumeros.add(num);	
		}
		Set<Integer> conjunto=new HashSet<>(listaNumeros);
		ArrayList<Integer> sinRepetidos=new ArrayList<>(conjunto);
		System.out.println("Lista sin repetidos: ");
		System.out.println(sinRepetidos);
		System.out.println("\nLista original: ");
		System.out.println(listaNumeros);
		
	}
	
	
	public static void tarea2() {
		List<Integer> lista1=List.of(1,3,5,6,3,2);
		List<Integer> lista2=List.of(5,7,8,5,10,9);
		
		fusionarListas(lista1,lista2);
		
		
	}
	
	public static void fusionarListas(List<Integer> lista1,List<Integer> lista2) {
		List<Integer> listaCombi=new ArrayList<>(lista1);
		
		listaCombi.addAll(lista2);
		
		System.out.println(listaCombi);
	}
	
	
	public static void tarea3() {
		Cliente c1=new Cliente("Pepe", LocalDate.of(2021,6,2), 39,1985.0 );
		Cliente c2=new Cliente("Luis", LocalDate.of(2022,9,1), 39,1985.0 );
		Cliente c3=new Cliente("Jose", LocalDate.of(2013,9,6), 39,1985.0 );
		Cliente c4=new Cliente("Antonio", LocalDate.of(2019,8,20), 39,1985.0 );
		Cliente c5=new Cliente("Jacinto", LocalDate.of(2020,6,12), 39,1985.0 );
		
		
		Set<Cliente> listaClientes=new TreeSet<>();
		listaClientes.add(c1);
		listaClientes.add(c2);
		listaClientes.add(c3);
		listaClientes.add(c4);
		listaClientes.add(c5);
		
		
		
		if(!listaClientes.isEmpty()) {
		Iterator<Cliente> iterator=listaClientes.iterator();	
		Cliente ultimoCliente=null;
		while(iterator.hasNext()) {
			ultimoCliente=iterator.next();
		}
		if(ultimoCliente!=null) {
			listaClientes.remove(ultimoCliente);
		}
		}
		
		Iterator<Cliente> iterator=listaClientes.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
}
	
	public static List<List<String>> repartoAlumno(List<String> lista,int numGrupos){
		if(numGrupos<=0) {
			throw new IllegalArgumentException("Error en los argumentos." );
		}
		
		List<String> listaBarajada=new ArrayList<>(lista);
		Collections.shuffle(listaBarajada);
		
		
		return null;
		
	}
	
	public static void tarea4() {
		List<String> lista=List.of("alumno1","alumno2","alumno3","alumno4","alumno5","alumno6","alumno7","alumno8");
	}
	
	
}
