package com.uno.carrito;

public class MainHardcode {

	public static void main(String[] args) {

		Tienda tienda = new Tienda();
		
		
		Cliente cliente1 = new Cliente("Pedro Perez", "Colombia 123", "Colombia 123", "pperez@mail.com", new Tarjeta(1234567890, "2015-01-01", "2017-01-01", 321));
		tienda.agregarCliente(cliente1);
		Cliente cliente2 = new ClientePreferencial("Pedro Lopez", "Colombia 567", "Colombia 567", "plo@mail.com", new Tarjeta(1877655443, "2015-01-01", "2017-01-01", 467), 25);
		tienda.agregarCliente(cliente2);
		
		Producto producto1 = new Producto(1, "Producto 1", 23.50f);
		Producto producto2 = new Producto(2, "Producto 2",317.53f);
		Producto producto3 = new Producto(3, "Producto 3", 15.54f);
		Producto producto4 = new Producto(4, "Producto 4", 16.53f);
		Producto producto5 = new Producto(5, "Producto 5", 19.53f);
	

		Carrito carrito1 = new Carrito();
		Carrito carrito2 = new Carrito();
		
		tienda.obtenerCliente(0).agregarCarrito(carrito1);
		tienda.obtenerCliente(0).agregarCarrito(carrito2);
				
		tienda.obtenerCliente(0).getCarrito(0).agregarProducto(producto1, 1);
		tienda.obtenerCliente(0).getCarrito(0).agregarProducto(producto2, 3);
		
		tienda.obtenerCliente(0).getCarrito(1).agregarProducto(producto3, 4);
		tienda.obtenerCliente(0).getCarrito(1).agregarProducto(producto4, 2);
		tienda.obtenerCliente(0).getCarrito(1).agregarProducto(producto1, 2);
		tienda.obtenerCliente(0).getCarrito(1).borrarProducto(1);
		
		tienda.obtenerCliente(0).getCarrito(2).agregarProducto(producto5, 2);
		
		tienda.obtenerCliente(0).mostrarDetalle(0);
		tienda.obtenerCliente(0).mostrarDetalle(1);
		tienda.obtenerCliente(0).mostrarDetalle(2);

		tienda.obtenerCliente(0).ListarCarritos();

		tienda.obtenerCliente(0).comprar(1, 222);
		tienda.obtenerCliente(0).comprar(1, 321);

		Carrito carrito10 = new Carrito();
		Carrito carrito20 = new Carrito();
		
		tienda.obtenerCliente(1).agregarCarrito(carrito10);
		tienda.obtenerCliente(1).agregarCarrito(carrito20);
		
		
		tienda.obtenerCliente(1).getCarrito(0).agregarProducto(producto1, 1);
		tienda.obtenerCliente(1).getCarrito(0).agregarProducto(producto2, 3);
		
		tienda.obtenerCliente(1).getCarrito(1).agregarProducto(producto3, 4);
		tienda.obtenerCliente(1).getCarrito(1).agregarProducto(producto4, 2);
		tienda.obtenerCliente(1).getCarrito(1).agregarProducto(producto1, 2);
		tienda.obtenerCliente(1).getCarrito(1).borrarProducto(1);
		
		tienda.obtenerCliente(1).getCarrito(2).agregarProducto(producto5, 2);
		
		tienda.obtenerCliente(1).mostrarDetalle(0);
		tienda.obtenerCliente(1).mostrarDetalle(1);
		tienda.obtenerCliente(1).mostrarDetalle(2);
		
		tienda.obtenerCliente(1).comprar(1, 222);
		tienda.obtenerCliente(1).comprar(1, 467);
		
		tienda.obtenerCliente(1).ListarCarritos();

		tienda.mostrarClientes();

	}

}
