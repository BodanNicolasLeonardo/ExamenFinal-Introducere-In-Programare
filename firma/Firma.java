package firma;
import java.util.ArrayList;
import java.util.List;
import angajati.Angajat;
	
public class Firma {
	private List<Angajat> angajati = new ArrayList<>();
	
	public boolean angajeaza(Angajat a) {
		angajati.add(a);
		return true;
	}

}
