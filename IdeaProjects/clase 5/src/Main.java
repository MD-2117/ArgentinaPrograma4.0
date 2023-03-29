//
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String ruta = "C:\\Users\\danie\\OneDrive\\Escritorio\\Argentina Programa\\Repositorio\\ArgentinaPrograma4.0\\IdeaProjects\\clase 5\\articulos.txt";
        String [] productos = new String[leerArchivo(ruta).length];
        List<Producto> listaProductos = new LinkedList<>();
        for (int i = 0; i < productos.length; i++) {
            productos[i]=leerArchivo(ruta)[i];
        }
        for (int i = 0; i < productos.length/3; i++) {
            int cont=0;
            switch (i){
                case 0:
                    cont=0;
                    break;
                case 1:
                    cont=3;
                    break;
                case 2:
                    cont=6;
                    break;
                default:
                    break;
            }
            int cantidad = Integer.parseInt(productos[cont]);
            cont++;
            Double precio = Double.parseDouble(productos[cont]);
            cont++;
            String nombre= productos[cont];
            listaProductos.add(new Producto(cantidad,precio,nombre));
        }

        ItemCarrito item1 = new ItemCarrito(listaProductos.get(0),listaProductos.get(0).cantidad);
        ItemCarrito item2 = new ItemCarrito(listaProductos.get(1),listaProductos.get(1).cantidad);
        ItemCarrito item3 = new ItemCarrito(listaProductos.get(2),listaProductos.get(2).cantidad);
        Carrito carritoCarlos = new Carrito();
        carritoCarlos.agregarItem(item1);
        carritoCarlos.agregarItem(item2);
        carritoCarlos.agregarItem(item3);
        DescuentoPorMonto descuentoPorMonto = new DescuentoPorMonto("superDescuento", 10.0,150.0);
        DescuentoPorCantidad descuentoPorCantidad = new DescuentoPorCantidad("maxiDescuento", 10.0,2);
        for (int i = 0; i < carritoCarlos.itemsCarro.size(); i++) {
            System.out.println("Articulo: "+carritoCarlos.getItemsCarro().get(i).producto.nombre+" Cantidad: "+carritoCarlos.getItemsCarro().get(i).producto.cantidad+" Precio: "+carritoCarlos.getItemsCarro().get(i).producto.precio);
        }
        double precioFinal=carritoCarlos.getPrecioTotal();
        System.out.println("SubTotal: "+precioFinal);

        if (descuentoPorMonto.aplicaDescuento(precioFinal)){

            System.out.println("Total descuento por monto: "+descuentoPorMonto.aplicarDescuento(precioFinal));
            precioFinal=descuentoPorMonto.aplicarDescuento(precioFinal);
        }
        if (descuentoPorCantidad.aplicaDescuento(carritoCarlos.getCantidadTotal())){

            System.out.println("Total descuento por cantidad: "+ descuentoPorCantidad.aplicarDescuento(precioFinal));
            precioFinal= descuentoPorCantidad.aplicarDescuento(precioFinal);
        }
    }
    public static String[] leerArchivo(String ruta) throws FileNotFoundException {
        File archivo = new File(ruta);
        Scanner scanner = new Scanner(archivo);
        String contenido = scanner.nextLine();
        String[] array = contenido.split(",");
        scanner.close();
        return array;
    }
}