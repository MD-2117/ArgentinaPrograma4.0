import java.util.ArrayList;
import java.util.List;

public class Carrito {
    Double precioTotal=0.0;
    int cantidadTotal=0;
    List<ItemCarrito> itemsCarro;
    Carrito(){
        this.itemsCarro = new ArrayList<ItemCarrito>();
    }
    public void agregarItem(ItemCarrito item){
        this.itemsCarro.add(item);
    }
    public void removerItem(int indice){
        this.itemsCarro.remove(indice);
    }

    public List<ItemCarrito> getItemsCarro() {
        return this.itemsCarro;
    }

    public Double getPrecioTotal() {
        double total = 0;
        for (int i = 0; i < this.itemsCarro.toArray().length; i++) {
            total=this.precioTotal+itemsCarro.get(i).getPrecioTotal();
        }
        return total;
    }
    public int getCantidadTotal(){
        int total=0;
        for (int i = 0; i < this.itemsCarro.size(); i++) {
            total=this.cantidadTotal+this.itemsCarro.get(i).getCantidad();
        }
        return total;
    }
}