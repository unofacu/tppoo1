package com.uno.carrito;

import java.util.ArrayList;

public class ClientePreferencial extends Cliente{
	
	private float descuento;
	private ArrayList<Carrito> carritos;	

	public ClientePreferencial(String nombre, String direccionEnvio, String direccionCobro, String email, float descuento) {
		super(nombre, direccionEnvio, direccionCobro, email);
		this.descuento = descuento;
		this.carritos = new ArrayList <Carrito>();
	}

	@Override
	public float getTotalAPagar() {
		// TODO Auto-generated method stub
		return this.getTotalCompra()- ((this.getTotalCompra()*descuento)/100);
	}



	
}
