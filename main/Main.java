package main;

import angajati.AngajatCuOra;
import angajati.AngajatCuSalarFix;
import firma.Firma;

public class Main {

	public static void main(String[] args) {
		
		AngajatCuSalarFix a1 = new AngajatCuSalarFix("Jhon Kennedy", 3500);
		AngajatCuSalarFix a2 = new AngajatCuSalarFix("Ion Marin ", 3500);
		
		AngajatCuOra b1 = new AngajatCuOra("Edi Vasile", 100, 30 );
		AngajatCuOra b2 = new AngajatCuOra("Josh Edwards", 130, 45 );

		Firma firma = new Firma();
		
		System.out.println(firma.angajeaza(a1));
	    System.out.println(firma.angajeaza(a2));
	    System.out.println(firma.angajeaza(b1));
	    System.out.println(firma.angajeaza(b2)); 

	    a1.schimbaSalarFix(4000);
	    b1.schimbaSalarPeOra(33);
	     
	}
}
