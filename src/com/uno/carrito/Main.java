package com.uno.carrito;

public class Main {

	public static void main(String[] args) {
	
		Carrito carrito1 = new Carrito();
		Carrito carrito2 = new Carrito();
		
		Cliente cliente = new Cliente("Calor Perez", "Rivadavia 620", "Rivadavia 620", "carlos@mail.com");
		cliente.agregarCarrito(carrito1);
		cliente.agregarCarrito(carrito2);
		
		cliente.getCarrito(0).agregarProducto(new Producto(1, "Atlas Argentina", 5.20f), 2);
		cliente.getCarrito(0).agregarProducto(new Producto(2, "CD Metallica", 10.53f), 1);
		cliente.getCarrito(0).agregarProducto(new Producto(1, "Atlas Argentina", 5.20f), 1);
		cliente.getCarrito(0).agregarProducto(new Producto(3, "Libro de Cocina", 7.35f), 2);

		cliente.getCarrito(1).agregarProducto(new Producto(1, "Pelota de Futbol", 15.20f), 2);
		cliente.getCarrito(1).agregarProducto(new Producto(2, "Mouse", 17.8f), 1);

		cliente.mostrarDetalle();
		
	}
	
}
