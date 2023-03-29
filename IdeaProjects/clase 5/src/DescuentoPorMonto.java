public class DescuentoPorMonto extends Descuento{
    double montoMinimo;
    DescuentoPorMonto(String nombre,double porcentajeDescuento, double montoMin){
        super(nombre,porcentajeDescuento);
        this.montoMinimo=montoMin;
    }
    public double getMontoMin() {
        return montoMinimo;
    }

    public boolean aplicaDescuento(double precio){
        return precio>=montoMinimo;
    }
}
