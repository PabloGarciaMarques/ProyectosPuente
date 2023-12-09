
public class HoraExacta extends claseHora {

	private int segundos;
	
	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		this.segundos=segundos;
		// TODO Auto-generated constructor stub
	}
	
	public boolean setSegundo(int segundos) {
		boolean valido=false;
		
		if(segundos<=0&&segundos>=59) {
			this.segundos=segundos;
			valido = true;
		}else {
			valido=false;
		}
		
		return valido;
	}
	
	@Override 
	public void inc() {
		this.segundos++;
		if(this.segundos>=60) {
			this.segundos=0;
			
			super.inc();
		}
	}

}
