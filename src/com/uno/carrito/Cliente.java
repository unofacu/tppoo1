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
		this.carritos.add(new Carrito());
	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccionEnvio() {
		return direccionEnvio;
	}


	public void setDireccionEnvio(String direccionEnvio) {
		this.direccionEnvio = direccionEnvio;
	}


	public String getDireccionCobro() {
		return direccionCobro;
	}


	public void setDireccionCobro(String direccionCobro) {
		this.direccionCobro = direccionCobro;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
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
		
	}
	
	public float getTotalAPagar(){
		return this.getTotalCompra();
		
	}
		
	public void mostrarDetalle() {
		for(Carrito carrito : this.carritos)
			carrito.mostrarDetalle();
				
		System.out.printf("Total a pagar: %f\n", this.getTotalAPagar());
	}
	
	public void ListarCarritos (){
		System.out.printf("\n\n\nUsted dispone de los siguientes carritos:\n\n\n");
		for (int i = 0; i < this.carritos.size(); i++){
			System.out.printf("Carrito Nro: %d\n", i); 
		 }
		System.out.printf("\n\n\n");
	}
	
}
