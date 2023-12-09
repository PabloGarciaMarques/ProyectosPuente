import java.time.LocalDateTime;

public class Texto {
private String cadena;
private int longitudMax;
private LocalDateTime fechaModificacion;



public Texto(int longitudMax) {
	this.longitudMax = longitudMax;
	this.cadena="";
	fechaModificacion=LocalDateTime.now();
}


public boolean agregarletraInicio(char letra) {
	String cadena=letra+"";
	boolean valido=agregarletraInicio(letra);
	return valido;
}

}
