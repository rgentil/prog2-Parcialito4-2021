package Comparadores;

import Principal.Vendedor;

public class ComparadorPorEdad extends Comparador{

	public ComparadorPorEdad() {}

	public int compare(Vendedor vendedor1, Vendedor vendedor2) {
		return Integer.compare(vendedor1.getEdad(), vendedor2.getEdad());
	}
	

}
