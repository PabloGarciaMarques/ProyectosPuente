import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpleadoDAO {
	private Connection conexion;
	
	
	private Connection connect() {
		try {
			String url="jdbc:mysql://localhost:3306";
			String user="root";
			String password="root";
			
			this.conexion=DriverManager.getConnection(url, user, password);
			
		} catch (SQLException e) {
			System.out.println("Algo ha fallado");
		}
		
		return conexion;
	}
	
	public boolean create(Empleado empleado) {
		boolean exito=false;
		connect();
		try {
			
			String plantillaSQL="INSERT INTO empleado (nombre,edad,telefono) VALUES (?,?,?)";
			PreparedStatement ps=conexion.prepareStatement(plantillaSQL);
			ps.setString(1,empleado.getNombre());
			ps.setInt(2, empleado.getEdad());
			ps.setString(3, empleado.getTelefono());
			
			int filasAfectadas=ps.executeUpdate();
			exito=filasAfectadas>0;
			cerrarConexion();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(exito);
		return exito;
		
	}
	
	 private void cerrarConexion() {
	        try {
	            if (conexion != null && !conexion.isClosed()) {
	                conexion.close();
	            }
	        } catch (Exception e) {
	            e.printStackTrace(); // Imprimir la traza de la pila para depuración
	        }
	
}
	 
}
		