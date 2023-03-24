import java.util.ArrayList;
import java.util.List;

public class Carrito {
    //LLamando a la clase

    //Definiendo sus atributos
    private List<ItemCarrito> items;

    //Constructor de la clase
    public Carrito() {
        this.items = new ArrayList<ItemCarrito>();
    }
    //Defino sus métodos
    public void agregarItem(Producto producto, int cantidad){
        items.add(new ItemCarrito(producto, cantidad));
    }

    public void eliminarItem(int indice) {
        items.remove(indice);
    }
    public List<ItemCarrito> getItems() {
        return items;
    }

    public double getPrecioTotal(){
        double precioTotal = 0;
        for(ItemCarrito item : items){
            precioTotal += item.getPrecioTotal();
        };
        return precioTotal;
    }
}