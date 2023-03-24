package utilidades;

public class CalculadoraTest {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Calculadora test = new Calculadora(150.0,180.0);
        if (test.sumar(150.0,180.0)!=110.0){
            throw new RuntimeException("ERROR! resultado esperado:110 resultado obtenido:"+test.sumar(150.0,180.0));
        }
    }

}
