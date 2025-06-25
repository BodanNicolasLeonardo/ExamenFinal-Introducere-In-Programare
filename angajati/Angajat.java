package angajati;
import java.util.Objects;

public abstract class Angajat {

	private String nume;

	public Angajat(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}
	
	public abstract double calculSalar();
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Angajat)) return false;
		Angajat other = (Angajat) obj;
		return Objects.equals(this.nume, other.nume);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nume);
	}
	
}
