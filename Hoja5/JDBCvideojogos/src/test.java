
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VideojuegoDAO dao= new VideojuegoDAO();
		Videojuego v1=new Videojuego(1, "The bindding of isacc","15-05-2002", "Nicalis",15.50, false);
		
		
		//dao.insert(v1);
		dao.read(1);
		//dao.buscarPorNombre("The", false);
	}

}
