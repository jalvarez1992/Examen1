package com.mycompany.examen1.util;

import com.mycompany.examen1.model.Producto;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class GestionProductos {
    
    private ArrayList<Producto> productos = new ArrayList<>();
    
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }
    
    public boolean eliminarProductoPorCodigo(int codigo) {
        boolean registroBorrado = false;
        for (int i = 0; i < this.productos.size(); i++) {
            if (this.productos.get(i).getCodigo() == codigo) {
                this.productos.remove(i);
                registroBorrado = true;
            }
        }
        return registroBorrado;
    }
    
    public boolean actualizarProductoPorCodigo(int codigo, String nombre, String categoria, double precio, int cantidad) {
        boolean registroActualizado = false;
        for (int i = 0; i < this.productos.size(); i++) {
            if (this.productos.get(i).getCodigo() == codigo) {
                Producto p = this.productos.get(i);
                p.setNombre(nombre);
                p.setCategoria(categoria);
                p.setPrecio(precio);
                p.setCantidad(cantidad);
                
                this.productos.set(i, p);
                
                registroActualizado = true;
            }
        }
        return registroActualizado;
    }
    
    public void mostrarTodosProductos() {
        for (int i = 0; i < this.productos.size(); i++) {
            System.out.println("================================");
            System.out.println("Codigo: " + this.productos.get(i).getCodigo());
            System.out.println("Nombre: " + this.productos.get(i).getNombre());
            System.out.println("Categoria: " + this.productos.get(i).getCategoria());
            System.out.println("Precio: " + this.productos.get(i).getPrecio());
            System.out.println("Cantidad: " + this.productos.get(i).getCantidad());
        }
    }
    
}
