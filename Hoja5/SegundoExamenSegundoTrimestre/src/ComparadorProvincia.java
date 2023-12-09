import java.util.Comparator;

public class ComparadorProvincia implements Comparator<Municipio>{

	@Override
	public int compare(Municipio m1,Municipio m2) {
		return m1.getProvincia().compareToIgnoreCase(m2.getProvincia());
	}
}
