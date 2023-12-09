import java.util.Comparator;

public class comparadorNombre implements Comparator<Municipio>{
@Override
public int compare(Municipio m1, Municipio m2) {
	return m1.getNombre().compareToIgnoreCase(m2.getNombre());
}

}


