public class Descuento {
    String nombre;
    double porcentajeDescuento;
    Descuento(String nomD,double porcenD){
        this.nombre=nomD;
        this.porcentajeDescuento=porcenD;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPorcentajeDescuento() {
        return this.porcentajeDescuento;
    }
    public double aplicarDescuento(double precio){
        double descuento=precio*getPorcentajeDescuento()/100;
        precio=precio-descuento;
        return precio;
    }
}
