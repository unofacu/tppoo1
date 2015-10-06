package com.uno.carrito;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		ProductosAComprar lista = new ProductosAComprar("listaproductos.txt");
			
//		Carrito carrito1 = new Carrito();
//		Carrito carrito2 = new Carrito();
//		Carrito carrito3 = new Carrito();
//		
//		Cliente cliente = new Cliente("Carlos Perez", "Rivadavia 620", "Rivadavia 620", "carlos@mail.com");
//		ClientePreferencial cliente2 = new ClientePreferencial("Carlos Perez", "Rivadavia 620", "Rivadavia 620", "carlos@mail.com", 20);
//		
//		cliente.agregarCarrito(carrito1);
//		cliente.agregarCarrito(carrito2);
//		cliente2.agregarCarrito(carrito3);
//		
//		cliente.getCarrito(0).agregarProducto(new Producto(1, "Atlas Argentina", 5.2f), 2);
//		cliente.getCarrito(0).agregarProducto(new Producto(2, "CD Metallica", 10.5f), 1);
//		cliente.getCarrito(0).agregarProducto(new Producto(1, "Atlas Argentina", 5.20f), 1);
//		cliente.getCarrito(0).agregarProducto(new Producto(3, "Libro de Cocina", 7.35f), 2);
//
//		cliente.getCarrito(1).agregarProducto(new Producto(1, "Pelota de Futbol", 15.20f), 2);
//		cliente.getCarrito(1).agregarProducto(new Producto(2, "Mouse", 17.8f), 1);
//				
//		cliente2.getCarrito(0).agregarProducto(new Producto(1, "Atlas Argentina", 5.20f), 2);
//		cliente2.getCarrito(0).agregarProducto(new Producto(2, "CD Metallica", 10.53f), 1);
//		cliente2.getCarrito(0).agregarProducto(new Producto(1, "Atlas Argentina", 5.20f), 1);
//		cliente2.getCarrito(0).agregarProducto(new Producto(3, "Libro de Cocina", 7.35f), 2);
//		
//		cliente.mostrarDetalle();
//		cliente2.mostrarDetalle();
		//////////////////////////
		//lista.mostrarListaProductos();
	
		Cliente cliente = null;
		int carritoActual = 0;
		Scanner keyboard = new Scanner(System.in);
		String linea = "";
		while (!(linea.equals("7") || linea.equals("8"))) {
			
			System.out.println("1.-Ingresar cliente");
			System.out.println("2.-Agregar Carrito al cliente.");
			System.out.println("3.-Listar Carritos");
			System.out.println("4.-Seleccionar Carrito");
			System.out.println("5.-Listar productos");
			System.out.println("6.-Agregar producto al carrito");
			System.out.println("7.-Comprar");
			System.out.println("8.-Salir");
			System.out.println("");
			System.out.print("Ingrese una opcion: ");
			linea = keyboard.next();
			
			
		}
		
	}
	
	// Metodo para pedir datos del cliente por pantalla y con los mismos crear una instancia de Cliente, si se ingresa un porcentaje de 
	// descuento la instancia se hara con la clase ClientePreferencial. Esta opcion solo permitira cargar los datos del cliente si el objeto cliente == null
	
	// Metodo que agregue un carrito vacio al cliente
	
	// Motodo que muestra una lista de los carritos con su respectivo id (el id del carrito es igual a su posicion en el Arraylist de carritos del cliente)
	
	// Metodo para seleccionar carrito, mostrar la lista de carritos y el que selecciones lo carga en la variable carritoActual
	
	// Motodo para listar los productos disponibles. llama al metodo mostrarListaProductos() de la clase ProductosAComprar.
	
	// Metodo que solicita id de producto y cantidad, luego se llama al metodo agregarProducto del carrito apuntado por la variable carritoActual.
	
	
	
}
