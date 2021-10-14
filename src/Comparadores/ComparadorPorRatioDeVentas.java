package Comparadores;

import java.time.LocalDate;

import Principal.Vendedor;

public class ComparadorPorRatioDeVentas extends Comparador{

	private LocalDate desde;
	private LocalDate hasta;
	
	public ComparadorPorRatioDeVentas(LocalDate desde, LocalDate hasta) {
		super();
		this.desde = desde;
		this.hasta = hasta;
	}
	
	public int compare(Vendedor vendedor1, Vendedor vendedor2) {
		return Double.compare(vendedor1.getRatioVentas(desde, hasta), vendedor2.getRatioVentas(desde, hasta));
	}
	

}
