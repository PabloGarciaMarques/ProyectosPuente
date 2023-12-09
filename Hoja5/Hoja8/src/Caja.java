
public class Caja {
	public enum Unidad {cm,m}
	final int longEtiquetaMax=30;
	protected int ancho;
	protected int alto;
	protected int fondo;
	protected String etiqueta;
	protected Unidad unidad;
	public Caja(int ancho, int alto, int fondo, Caja.Unidad unidad) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		this.unidad = unidad;
	}
	
	public double getVolumen() {
		double volumen=ancho*alto*fondo;
		
		if(unidad==Unidad.cm) {
			volumen/=1000000;
		}
		return volumen;
	}
	
	public boolean setEtiqueta(String etiqueta) {
		boolean posible=false;
		if(etiqueta.length()<=longEtiquetaMax) {
			this.etiqueta=etiqueta;
			posible=true;
		}
		return posible;
	}
	public String toString() {
		return "Etiqueta: "+this.etiqueta+"\nAlto: "+this.alto+"\nAncho: "+this.ancho+"\nFondo: "
				+this.fondo+"\nUnidad: "+this.unidad;
	}
}
