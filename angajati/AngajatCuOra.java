package angajati;

public class AngajatCuOra extends Angajat{
	
	private int ore;
	private double salarPeOra;
	
	public AngajatCuOra(String nume, int ore, double salarPeOra) {
		super(nume);
		this.ore = ore;
		this.salarPeOra = salarPeOra;
	}
	
	public void adaugaOre(int oreInPlus) {
		this.ore = oreInPlus;
	}

	public void schimbaSalarPeOra(double noulSalar) {
		this.salarPeOra = noulSalar;
	}
	
	@Override
	public double calculSalar() {
		// TODO Auto-generated method stub
		return ore * salarPeOra;
	}
	
}
