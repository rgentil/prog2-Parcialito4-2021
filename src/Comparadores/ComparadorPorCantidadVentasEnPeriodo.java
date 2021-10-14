package Comparadores;

import java.time.LocalDate;

import Principal.Vendedor;

public class ComparadorPorCantidadVentasEnPeriodo extends Comparador{

	private LocalDate desde;
	private LocalDate hasta;
	
	public ComparadorPorCantidadVentasEnPeriodo(LocalDate desde, LocalDate hasta) {
		super();
		this.desde = desde;
		this.hasta = hasta;
	}

	public int compare(Vendedor vendedor1, Vendedor vendedor2) {
		return Integer.compare(vendedor1.getCantidadVentasPeriodo(desde, hasta), vendedor2.getCantidadVentasPeriodo(desde, hasta));
	}
	

}
