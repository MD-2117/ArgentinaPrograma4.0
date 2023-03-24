//
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
//
public class Producto {
    private  Integer cantidad;
    private String nombre;
    private String descripcion;
    private LocalDate fechaAlta;
    private Integer pesoKg;
    private Double precio;
    private static final Double minPrecio = 0.1;
    public Producto(String nombre, Double minPrecio, Integer cantidad) {
        this.nombre = nombre;
        this.fechaAlta = LocalDate.now();
        this.precio = minPrecio;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public Double getPrecio(){
        return this.precio;
    }
    public Integer getCantidad(){return this.cantidad;}
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void  setPrecio(double v){
        this.precio= v;
    }
}
