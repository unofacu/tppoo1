package com.uno.carrito;

public class Item {

	private int cantidad;
	private Producto producto;
	public Item(Producto producto, int cantidad) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public float getTotal() {
		return cantidad * producto.getPrecio();
	}
	
}
