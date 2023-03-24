package utilidades;

public class Calculadora {
    double num1;
    double num2;
    static double resultado=0;
    Calculadora(double numero1, double numero2){
        this.num1=numero1;
        this.num2=numero2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double sumar(double num1, double num2){
        resultado=num1+num2;
        return resultado;
    }
    public double restar(double num1,double num2){
        resultado=num1-num2;
        return resultado;
    }
    public double multiplicar(double num1,double num2){
        resultado=num1*num2;
        return resultado;
    }
    public double dividir(double num1,double num2){
        resultado=num1/num2;
        return resultado;
    }
}
