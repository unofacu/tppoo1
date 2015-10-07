package com.uno.carrito;


public class ClientePreferencial extends Cliente{
	
	private float descuento;	

	public ClientePreferencial(String nombre, String direccionEnvio, String direccionCobro, String email, float descuento) {
		super(nombre, direccionEnvio, direccionCobro, email);
		this.descuento = descuento;
	}

	@Override
	public float getTotalAPagar() {
		// TODO Auto-generated method stub
		return this.getTotalCompra()- ((this.getTotalCompra()*descuento)/100);
	}



	
}
