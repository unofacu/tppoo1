package com.uno.carrito;

import java.util.ArrayList;

public class Cliente {

	private ArrayList<Carrito> carritos;
	
	private String nombre;
	private String direccionEnvio;
	private String direccionCobro;
	private String email;
	
	private Tarjeta tarjeta;
	
	public Cliente(String nombre, String direccionEnvio, String direccionCobro, String email, Tarjeta tarjeta) {
		
		this.nombre = nombre;
		this.direccionEnvio = direccionEnvio;
		this.direccionCobro = direccionCobro;
		this.email = email;
		this.tarjeta = tarjeta;
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

	public float getTotalCompra(int nroCarrito) {
		
//		float totalCompra = 0;
//		for (Carrito carrito : this.carritos)
//			totalCompra += carrito.getTotal();
		
//		return totalCompra;
		
		return this.carritos.get(nroCarrito).getTotal();
		
	}
	
	public void comprar(int nroCarrito, int cvs) {

		if (this.tarjeta.validar(cvs)) {
			float total = this.getTotalCompra(nroCarrito);
			System.out.printf("Compra realizada\n\nDatos Cliente:\n%s\n%s\n%s\n%s\n", nombre, direccionCobro, direccionEnvio, email);
		} else {
			System.out.println("Problemas al validar la tarjeta. Rentente.");
		}
		
	}
	
	public float getTotalAPagar(int nroCarrito){
		return this.getTotalCompra(nroCarrito);
		
	}
		
	public void mostrarDetalle(int id) {
		
		getCarrito(id).mostrarDetalle();
				
		System.out.printf("\t                                 Total a pagar: $%7.2f\n\n", this.getTotalAPagar(id));
	}
	
	public void ListarCarritos (){
		System.out.printf("\n\n\nCarritos del cliente %s :\n\n", this.nombre);
		System.out.printf("%-3s\t%-11s\n\n", "Id", "Total");
		for (int i = 0; i < this.carritos.size(); i++){
			System.out.printf("%3d\t$%7.2f\n", i, this.carritos.get(i).getTotal());
		 }
		System.out.printf("\n\n\n");
	}
	
}
