package Comparadores;

import java.time.LocalDate;

import Principal.Vendedor;

public class ComparadorPorCantidadProductosVendidos extends Comparador{

	private LocalDate desde;
	private LocalDate hasta;
	
	public ComparadorPorCantidadProductosVendidos(LocalDate desde, LocalDate hasta) {
		super();
		this.desde = desde;
		this.hasta = hasta;
	}

	public int compare(Vendedor vendedor1, Vendedor vendedor2) {
		return Integer.compare(vendedor1.getCantidadProductosVendidosPeriodo(desde, hasta), vendedor2.getCantidadProductosVendidosPeriodo(desde, hasta));
	}
	

}
