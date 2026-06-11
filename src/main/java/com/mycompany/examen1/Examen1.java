package com.mycompany.examen1;

import com.mycompany.examen1.model.Producto;
import com.mycompany.examen1.util.GestionProductos;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class Examen1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int opcion = 0;
        String entrada = "";
        Producto p;
        
        while (opcion != 6) {
            GestionProductos.mostrarMenu();
        
            entrada = teclado.nextLine();
            
            try {
                opcion = Integer.parseInt(entrada);

                switch (opcion) {
                    case 1:
                        p = new Producto();
                        System.out.println("Agregando producto nuevo");
                        System.out.print("Escribe Codigo: ");
                        p.setCodigo(Integer.parseInt(teclado.nextLine()));
                        System.out.print("Escribe Nombre: ");
                        p.setNombre(teclado.nextLine());
                        System.out.print("Escribe Categoria: ");
                        p.setCategoria(teclado.nextLine());
                        System.out.print("Escribe Precio: ");
                        p.setPrecio(Double.parseDouble(teclado.nextLine()));
                        System.out.print("Escribe Cantidad: ");
                        p.setCantidad(Integer.parseInt(teclado.nextLine()));
                        
                        GestionProductos.agregarProducto(p);
                        break;
                    case 2:
                        GestionProductos.mostrarTodosProductos();
                        break;
                    case 3:
                        p = new Producto();
                        System.out.println("Eliminar producto");
                        System.out.print("Escribe Codigo: ");
                        p.setCodigo(Integer.parseInt(teclado.nextLine()));
                        GestionProductos.eliminarProductoPorCodigo(p.getCodigo());
                        break;
                    case 4:
                        p = new Producto();
                        System.out.println("Actualizando producto");
                        System.out.print("Escribe Codigo: ");
                        p.setCodigo(Integer.parseInt(teclado.nextLine()));
                        System.out.println();
                        System.out.print("Escribe Nombre: ");
                        p.setNombre(teclado.nextLine());
                        System.out.print("Escribe Categoria: ");
                        p.setCategoria(teclado.nextLine());
                        System.out.print("Escribe Precio: ");
                        p.setPrecio(Double.parseDouble(teclado.nextLine()));
                        System.out.print("Escribe Cantidad: ");
                        p.setCantidad(Integer.parseInt(teclado.nextLine()));
                        GestionProductos.actualizarProductoPorCodigo(p);
                        break;
                    case 5:
                        System.out.println("Estadisticas");
                        GestionProductos.cantidadProductosRegistrados();
                        GestionProductos.productoMasCaro();
                        GestionProductos.productoMasBarato();
                        GestionProductos.valorTotalInventario();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ocurrio un error, vuelve a intentarlo. " + e.getMessage());
            }
        }
        
        teclado.close(); 
    }
}
