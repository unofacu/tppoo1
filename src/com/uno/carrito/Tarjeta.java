package com.uno.carrito;


public class Tarjeta {
	
	private long numero;
	private String validaDesde;
	private String validaHasta;
	private int cvs;
	

	public Tarjeta(long numero, String validaDesde, String validaHasta, int cvs) {
		super();
		this.numero = numero;
		this.validaDesde = validaDesde;
		this.validaHasta = validaHasta;
		this.cvs = cvs;
	}


	public long getNumero() {
		return numero;
	}


	public void setNumero(long numero) {
		this.numero = numero;
	}


	public String getValidaDesde() {
		return validaDesde;
	}


	public void setValidaDesde(String validaDesde) {
		this.validaDesde = validaDesde;
	}


	public String getValidaHasta() {
		return validaHasta;
	}


	public void setValidaHasta(String validaHasta) {
		this.validaHasta = validaHasta;
	}


	public int getCvs() {
		return cvs;
	}


	public void setCvs(int cvs) {
		this.cvs = cvs;
	}


	public boolean validar(int cvs) {
		return (this.cvs == cvs);
	}

}
