import java.util.Comparator;

public class Pelicula implements Comparable <Pelicula> {
private String titulo;
private int duracion;
private int anyLanzamiento;
private double notaIMDB;
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public int getDuracion() {
	return duracion;
}
public void setDuracion(int duracion) {
	this.duracion = duracion;
}
public int getAnyLanzamiento() {
	return anyLanzamiento;
}
public void setAnyLanzamiento(int anyLanzamiento) {
	this.anyLanzamiento = anyLanzamiento;
}
public double getNotaIMDB() {
	return notaIMDB;
}
public void setNotaIMDB(double notaIMDB) {
	this.notaIMDB = notaIMDB;
}
public Pelicula(String titulo, int duracion, int anyLanzamiento, double notaIMDB) {
	super();
	this.titulo = titulo;
	this.duracion = duracion;
	this.anyLanzamiento = anyLanzamiento;
	this.notaIMDB = notaIMDB;
}

public int compareTo(Pelicula otraPelicula) {
	return this.titulo.compareToIgnoreCase(otraPelicula.titulo);
	
}

@Override
public String toString() {
	return "Titulo: "+titulo+"\n"+"Duración: "+duracion+" minutos\n"+"Año de lanzamiento: "+anyLanzamiento+"\n"+"Puntucion IMDB: "+notaIMDB+"\n"+
			"------------------------------------------------------------------------------------------------------------------------------------";
}

public static Comparator<Pelicula> compararDuracion= Comparator.comparingInt(Pelicula::getDuracion);

public static Comparator<Pelicula> compararNota=Comparator.comparingDouble(Pelicula::getNotaIMDB);

}


