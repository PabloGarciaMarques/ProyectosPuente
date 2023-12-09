
public class claseBombilla {

	public boolean estado;
	public int idBombilla;
	private static boolean interruptorGeneral;
	
	
	
	public claseBombilla(int idBombilla) {
		this.estado=false;
		this.idBombilla = idBombilla;
	}
	
	public void encenderBombilla() {
		this.estado=true;
	}
	
	public void apagarBombilla() {
		this.estado=false;
	}
	
	public boolean estado() {
		return estado;
	}
	
	public static void encenderGeneral() {
		interruptorGeneral=true;
	}
	
	public static void apagarGeneral() {
		interruptorGeneral=false;
	}
	
	
	public void mostrarEstado() {
		if(this.estado&&interruptorGeneral) {
			System.out.println("La bombilla "+this.idBombilla+" esta encendida");
		}else {
			System.out.println("La bombilla "+this.idBombilla+" esta apagada");
		}
	}
}
