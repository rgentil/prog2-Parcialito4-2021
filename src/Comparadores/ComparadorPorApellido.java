package Comparadores;

import Principal.Vendedor;

public class ComparadorPorApellido extends Comparador{

	public ComparadorPorApellido() {}

	public int compare(Vendedor vendedor1, Vendedor vendedor2) {
		return vendedor1.getApellido().compareTo(vendedor2.getApellido());
	}
	

}
