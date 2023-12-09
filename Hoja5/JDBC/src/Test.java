
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpleadoDAO dao= new EmpleadoDAO();
		Empleado e1=new Empleado("pepe", 21, "123123123");
		
		
		dao.create(e1);
	}
	


}
