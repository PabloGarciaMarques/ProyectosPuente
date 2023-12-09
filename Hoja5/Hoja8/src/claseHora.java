
public class claseHora {
	private int hora;
	private int minutos;
	private int segundos;
	
	
	
	public claseHora(int hora, int minutos) {
		
		this.hora = hora;
		this.minutos = minutos;
	}
	
	public void inc() {
		this.minutos++;
		if(this.minutos>=60) {
			this.hora++;
			this.minutos=this.minutos-60;
		}
	}
	
	public boolean setMinutos(int min) {
		boolean valido=false;
		this.minutos=min;
		
		if(this.minutos>=0&&this.minutos<=60) {
			valido=true;
		}else {
			valido=false;
		}
		return valido;
	}
	
	public boolean setHoras(int horas) {
		boolean horaCorrecta=false;
		this.hora=horas;
		
		if(this.hora>=0&&this.hora<=24) {
			horaCorrecta=true;
		}else {
			horaCorrecta=false;
		}
		return horaCorrecta;
	}
	
	public String toString() {
		System.out.println(hora+":"+minutos);
		return null;
	}
}
