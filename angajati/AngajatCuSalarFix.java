package angajati;

public class AngajatCuSalarFix extends Angajat {
	
	private double salarFix;
	
	public AngajatCuSalarFix(String nume, double salarFix) {
		super(nume);
		this.salarFix = salarFix;
		// TODO Auto-generated constructor stub
	}
	
	public void schimbaSalarFix(double noulSalar) {
		this.salarFix = noulSalar;
	}

	@Override
	public double calculSalar() {
		
		return salarFix;
	}
	
}
