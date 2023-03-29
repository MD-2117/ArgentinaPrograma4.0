public class DescuentoPorCantidad extends Descuento {
    int cantidadMinima;
    DescuentoPorCantidad(String nombre, double porcentajeDescuento,int cantidad){
        super(nombre,porcentajeDescuento);
        this.cantidadMinima=cantidad;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }
    public Boolean aplicaDescuento(int cantidad){
        return cantidad>=cantidadMinima;
    }
}
