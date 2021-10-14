package Comparadores;

import java.util.Comparator;

import Principal.Vendedor;

public abstract class Comparador implements Comparator<Vendedor>{

	public abstract int compare(Vendedor vendedor1, Vendedor vendedor2);

}
