package com.mycompany.examen1.util;

import com.mycompany.examen1.model.Producto;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class GestionProductos {
    
    private static ArrayList<Producto> productos = new ArrayList<>();
    
    public static void mostrarMenu() {
        System.out.println("===== SISTEMA DE GESTIÓN DE PRODUCTOS =====");
        
        System.out.println("1. Agregar producto");
        System.out.println("2. Mostrar productos");
        System.out.println("3. Eliminar producto");
        System.out.println("4. Actualizar producto");
        System.out.println("5. Mostrar estadísticas");
        System.out.println("6. Salir");
        System.out.println("Seleccione una opción:");
    }
    
    public static void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado con exito.");
    }
    
    public static void eliminarProductoPorCodigo(int codigo) {
        boolean ok = false;
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo() == codigo) {
                productos.remove(i);
                ok = true;
            }
        }
        if (ok) {
            System.out.println("Producto eliminado con exito.");
        } else {
            System.out.println("No se encontro el producto a eliminar");
        }
    }
    
    public static void actualizarProductoPorCodigo(Producto p) {
        boolean ok = false;
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo() == p.getCodigo()) {
                
                productos.set(i, p);
                
                ok = true;
            }
        }
        if (ok) {
            System.out.println("Producto actualizado con exito.");
        } else {
            System.out.println("No se encontro el producto a actualizar");
        }
    }
    
    public static void mostrarTodosProductos() {
        System.out.println("Lista de productos registrados");
        for (int i = 0; i < productos.size(); i++) {
            String pro = "Codigo: " + productos.get(i).getCodigo()
                    + ", Nombre: " + productos.get(i).getNombre()
                    + ", Categoria: " + productos.get(i).getCategoria()
                    + ", Precio: " + productos.get(i).getPrecio()
                    + ", Cantidad: " + productos.get(i).getCantidad();
            System.out.println(pro);
        }
    }
    
    public static void cantidadProductosRegistrados() {
        System.out.println("Cantidad de productos registrados: " + productos.size());
    }
    
    public static void valorTotalInventario() {
        double valor = 0;
        for (int i = 0; i < productos.size(); i++) {
            valor += productos.get(i).getValor();
        }
        System.out.println("Valor total del inventario: " + valor);
    }
    
    public static void productoMasCaro() {
        double precio = 0;
        Producto p = null;
        if (!productos.isEmpty()) {
            p = productos.getFirst();
            precio = p.getPrecio();
        }
        for (int i = 0; i < productos.size(); i++) {
            if (precio < productos.get(i).getPrecio()) {
                precio = productos.get(i).getPrecio();
                p = productos.get(i);
            }
        }
        System.out.println("Producto mas caro del inventario:");
        if (p != null) {
            String pro = "Codigo: " + p.getCodigo()
                    + ", Nombre: " + p.getNombre()
                    + ", Categoria: " + p.getCategoria()
                    + ", Precio: " + p.getPrecio()
                    + ", Cantidad: " + p.getCantidad();
            System.out.println(pro);
        } else {
            System.out.println("No hay productos");
        }
    }
    
    public static void productoMasBarato() {
        double precio = 0;
        Producto p = null;
        if (!productos.isEmpty()) {
            p = productos.getFirst();
            precio = p.getPrecio();
        }
        for (int i = 0; i < productos.size(); i++) {
            if (precio > productos.get(i).getPrecio()) {
                precio = productos.get(i).getPrecio();
                p = productos.get(i);
            }
        }
        System.out.println("Producto mas barato del inventario:");
        if (p != null) {
            String pro = "Codigo: " + p.getCodigo()
                    + ", Nombre: " + p.getNombre()
                    + ", Categoria: " + p.getCategoria()
                    + ", Precio: " + p.getPrecio()
                    + ", Cantidad: " + p.getCantidad();
            System.out.println(pro);
        } else {
            System.out.println("No hay productos");
        }
    }
    
}
