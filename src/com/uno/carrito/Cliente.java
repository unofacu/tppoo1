package com.uno.carrito;

import java.util.ArrayList;

public class Cliente {

	private ArrayList<Carrito> carritos;
	
	private String nombre;
	private String direccionEnvio;
	private String direccionCobro;
	private String email;
	
	public Cliente(String nombre, String direccionEnvio, String direccionCobro, String email) {
		
		this.nombre = nombre;
		this.direccionEnvio = direccionEnvio;
		this.direccionCobro = direccionCobro;
		this.email = email;
		this.carritos = new ArrayList<Carrito>();
		
	}

	public void agregarCarrito (Carrito carrito) {
		this.carritos.add(carrito);
	}
	
	public void quitarCarrito (int nroCarrito) {
		this.carritos.remove(nroCarrito);
	}
	
	public Carrito getCarrito(int nroCarrito) {
		
		Carrito carrito = null;
		
		if (nroCarrito < this.carritos.size())
			carrito = this.carritos.get(nroCarrito);
		
		return carrito;
		
	}

	public float getTotalCompra() {
		
		float totalCompra = 0;
		for (Carrito carrito : this.carritos)
			totalCompra += carrito.getTotal();
		
		return totalCompra;
		
	}
	
	public void comprar() {
		
		float total = this.getTotalCompra();
		
		System.out.printf("Datos Cliente:\n%s\n%s\n%s\n%s\n", nombre, direccionCobro, direccionEnvio, email);
		System.out.printf("Total de la compra : %f\n", total);
		
	}
	
	public void mostrarDetalle() {
		for(Carrito carrito : this.carritos)
			carrito.mostrarDetalle();
	}
	
}
