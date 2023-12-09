
public class claseRadio {
double frecuencia;
private final double limiteSup=1080;
private final double limiteInf=80;


public claseRadio(double frecuencia) {
	
	this.frecuencia = frecuencia;
}


public void subirFrecuencia() {
	this.frecuencia=this.frecuencia+0.5;
	
	if(this.frecuencia>limiteSup) {
		this.frecuencia=80;
	}
}

public void bajarFrecuencia() {
	this.frecuencia=this.frecuencia-0.5;
	
	if(this.frecuencia<limiteInf) {
		this.frecuencia=1080;
	}
}

public void mostrar() {
	System.out.println("La frecuencia es "+this.frecuencia+" MHz");
}

}
