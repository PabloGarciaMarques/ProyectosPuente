import java.io.Serializable;

public class Municipio implements Comparable<Municipio>, Serializable {
private String nombre;
private int poblacion;
private String provincia;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getPoblacion() {
	return poblacion;
}
public void setPoblacion(int poblacion) {
	this.poblacion = poblacion;
}
public String getProvincia() {
	return provincia;
}
public void setProvincia(String provincia) {
	this.provincia = provincia;
}
public Municipio(String nombre, int poblacion, String provincia) {
	super();
	this.nombre = nombre;
	this.poblacion = poblacion;
	this.provincia = provincia;
}

@Override
public String toString() {
	return nombre+","+poblacion+","+provincia;
}
@Override 
public int compareTo(Municipio otroMunicipio) {
	return this.poblacion-otroMunicipio.poblacion;
}

}
