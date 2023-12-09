import java.time.LocalDate;

public class Cliente implements Comparable<Cliente>{
private String nombre;
private LocalDate fechaIncio;
private int edad;
private double saldo;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public LocalDate getFechaIncio() {
	return fechaIncio;
}
public void setFechaIncio(LocalDate fechaIncio) {
	this.fechaIncio = fechaIncio;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}

public String toString() {
    return "Cliente{" +
            "nombre='" + nombre + '\'' +
            ", edad=" + edad +
            ", saldo=" + saldo +
            ", fechaInicio=" + fechaIncio +
            '}';
}

public Cliente(String nombre, LocalDate fechaIncio, int edad, double saldo) {
	super();
	this.nombre = nombre;
	this.fechaIncio = fechaIncio;
	this.edad = edad;
	this.saldo = saldo;
}

@Override
public int compareTo(Cliente otroCliente) {
	return this.fechaIncio.compareTo(otroCliente.fechaIncio);
}

}
