import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VideojuegoDAO {
private Connection conexion;
public VideojuegoDAO() {
	connect();
}



private Connection connect() {
	try {
		String url="jdbc:mysql://localhost:3306/videojuegos";
		String user="root";
		String password="root";
		this.conexion=DriverManager.getConnection(url, user, password);
	
	} catch (SQLException e) {
		// TODO: handle exception
	}
	return this.conexion;
}


public boolean insert(Videojuego videojuego) {
	boolean exito=false;
	
	try {
		String sql="INSERT INTO videojuego(idVideojuego,nombre,fechaLanzamiento,desarrollador,precio,descuento) VALUES "
				+ "(?,?,?,?,?,?)";
		PreparedStatement prepared=conexion.prepareStatement(sql);
		prepared.setInt(1, videojuego.getIdVideojuego());
		prepared.setString(2, videojuego.getNombre());
		prepared.setString(3, videojuego.getFechaLanzamiento());
		prepared.setString(4, videojuego.getDesarrollador());
		prepared.setDouble(5, videojuego.getPrecio());
		prepared.setBoolean(6, videojuego.isDescuento());
		
		int filasAfectadas=prepared.executeUpdate();
		if(filasAfectadas>0) {
			exito=true;
		}
		
	} catch (SQLException e) {
		// TODO: handle exception
	}
	return exito;
}

public Videojuego read(int idVideojuego) {
	Videojuego videojuego=null;
	try {
		String plantilla="SELECT * FROM videojuego WHERE idVideojuego=?";
		PreparedStatement prepared = conexion.prepareStatement(plantilla);
		prepared.setInt(1, idVideojuego);
		ResultSet resultados=prepared.executeQuery();
	
		if(resultados.next()) {
			String nombre=resultados.getString(2);
			String fechaLanzamienot=resultados.getString(3);
			String desarrollador=resultados.getString(4);
			double precio= resultados.getDouble(5);
			
			
			videojuego =new Videojuego(idVideojuego, nombre, fechaLanzamienot, desarrollador, precio, false);
			 System.out.println("Información del Videojuego:");
	            System.out.println("ID: " + videojuego.getIdVideojuego());
	            System.out.println("Nombre: " + videojuego.getNombre());
	            System.out.println("Fecha de Lanzamiento: " + videojuego.getFechaLanzamiento());
	            System.out.println("Desarrollador: " + videojuego.getDesarrollador());
	            System.out.println("Precio: " + videojuego.getPrecio());
	            System.out.println("Descuento: " + videojuego.isDescuento());
			
			
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	return videojuego;
	
}

public List<Videojuego> buscarPorNombre(String nombre, boolean exacto){
	List<Videojuego> lista=new ArrayList<>();
	try {
		String sql;
		if(exacto) {
			sql="SELECT * FROM videojuego WHERE nombre=?";
		}else {
			sql="SELECT * FROM videojuego WHERE nombre LIKE ?";
		}
	
		PreparedStatement prepared= conexion.prepareStatement(sql);
		prepared.setString(1,exacto ? nombre:"%"+nombre+"%");
		ResultSet resultados=prepared.executeQuery();
		while (resultados.next()) {
            int idVideojuego = resultados.getInt("idVideojuego");
            String nombreVideojuego = resultados.getString("nombre");
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	return lista;
}

}
