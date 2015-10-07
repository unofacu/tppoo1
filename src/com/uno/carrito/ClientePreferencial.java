package com.uno.carrito;


public class ClientePreferencial extends Cliente{
	
	private float descuento;	

	public ClientePreferencial(String nombre, String direccionEnvio, String direccionCobro, String email, Tarjeta tarjeta, float descuento) {
		super(nombre, direccionEnvio, direccionCobro, email, tarjeta);
		this.descuento = descuento;
	}

	@Override
	public float getTotalAPagar() {
		// TODO Auto-generated method stub
		return this.getTotalCompra()- ((this.getTotalCompra()*descuento)/100);
	}



	
}
