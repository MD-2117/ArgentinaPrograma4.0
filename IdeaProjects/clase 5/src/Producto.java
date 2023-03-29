//
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
//
public class Producto {
    String nombre;
    int codigo;
    Double precio;
    int cantidad;
    Producto(int cantP,Double pP,String nP){
        this.precio=pP;
        this.nombre=nP;
        this.cantidad=cantP;
    }

    public Double getPrecio() {
        return precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }
}
