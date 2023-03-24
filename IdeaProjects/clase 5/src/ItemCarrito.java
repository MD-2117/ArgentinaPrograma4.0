public class ItemCarrito {
    private int cantidad;
    private Double PrecioTotal;
    Producto prod1= new Producto("cepillo", 250.0, 2);
    Producto prod2= new Producto("pasta de dientes",500.25,1);


    public ItemCarrito(Producto prod1, int cantidad) {
    }

    public int getCantidad(){
        return this.cantidad;
    }
    public double getPrecioTotal() {
        this.PrecioTotal=prod1.getPrecio()*cantidad;
        return this.PrecioTotal;
    }
}
