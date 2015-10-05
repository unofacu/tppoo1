package com.uno.carrito;

import java.util.ArrayList;

public class Carrito {

	ArrayList<Item> items;

	public Carrito() {
		this.items = new ArrayList<Item>();
	}
	
	public void agregarProducto (Producto producto, int cantidad) {
		
		boolean encontre = false;
		for (int i = 0; i < this.items.size() && !encontre; i++) {
			
			Item item = this.items.get(i);
			if (item.getProducto().getId() == producto.getId()) {
				item.setCantidad(item.getCantidad() + cantidad);
				encontre = true;
			}
			
		}
		
		if (!encontre) {
			Item item = new Item(producto, cantidad);
			this.items.add(item);
		}
			
	}
	
	public float getTotal() {
		
		float total = 0;
		
		for (Item item : this.items)
			total += item.getTotal();
		
		return total;
		
	}
	
	public void mostrarDetalle() {
		
		System.out.printf("\t%-2s\t%-30s\t%-3s\t%-10s\n", " Id", "Descripcion", "Can", "Precio");
		System.out.printf("\t----------------------------------------------------------\n");
		for (Item item : this.items)
			System.out.printf("\t%3d\t%-30s\t%3d\t$%7.2f\n", item.getProducto().getId(), item.getProducto().getNombre(), item.getCantidad(), item.getProducto().getPrecio());
		
		System.out.println();
		System.out.printf("\t                                        Total : $%7.2f\n", this.getTotal());
		System.out.println();
		
		
	}

}
