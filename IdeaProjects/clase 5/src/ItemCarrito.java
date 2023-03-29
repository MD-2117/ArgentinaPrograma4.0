public class ItemCarrito {
    private int cantidad;
    private Double PrecioTotal;
    Producto producto;

    public ItemCarrito(Producto prod1, int cant1) {
        this.producto=prod1;
        this.cantidad=cant1;
    }

    public int getCantidad(){
        return this.cantidad;
    }
    public double getPrecioTotal() {
        this.PrecioTotal=producto.getPrecio()*this.cantidad;
        return this.PrecioTotal;
    }
}
