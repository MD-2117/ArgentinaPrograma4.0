import javax.print.DocFlavor;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String asdasd="asdasd1";
        System.out.println(asdasd);
        System.out.println("actividad 1A");
        int numeroInicio = 5;
        int numeroFin = 14;
        while (numeroInicio<=numeroFin){
            System.out.print(numeroInicio+", ");
            numeroInicio++;
        }
        /* //////////////// */
        numeroInicio = 5;
        System.out.println();
        System.out.println("actividad 1B");
        while (numeroInicio<=numeroFin){
            if (numeroInicio%2==0){
                System.out.print(numeroInicio+", ");
            }
            numeroInicio++;
        }
        /* /////////////// */
        numeroInicio=5;
        System.out.println();
        System.out.println("actividad 1C");
        System.out.println ("coloque 1 para mostrar numeros pares y 2 para numeros impares");
        int entradaTeclado;
        Scanner entradaEscaner = new Scanner (System.in);
        entradaTeclado = Integer.parseInt(entradaEscaner.nextLine ());
        switch (entradaTeclado){
            case 1:
                while (numeroInicio<=numeroFin){
                    if (numeroInicio%2==0){
                        System.out.print(numeroInicio+", ");
                    }
                    numeroInicio++;
                }
            case 2:
                while (numeroInicio<=numeroFin){
                    if (numeroInicio%2!=0){
                        System.out.print(numeroInicio+", ");
                    }
                    numeroInicio++;
                }
        }
        /* //////////////// */
        numeroInicio=5;
        System.out.println();
        System.out.println("actividad 1D");
        for (int i = 0; i < 14; i++){
            if (numeroFin%2==0&&numeroFin>numeroInicio){
                System.out.print(numeroFin+", ");
            }
            numeroFin--;
        }
        //Actividad 2
        //variables: float ingresosN, int inmuebles, int vehiculos, boolean lujos.
        System.out.println("\nactividad 2D");
        double ingresosMT;
        int inmuebles;
        int vehiculos;
        boolean lujos;
        char respuesta='2';
        char categoria='D';
        System.out.print ("\ncoloque ingresos ");
        ingresosMT = Integer.parseInt((entradaEscaner.nextLine ()));
        System.out.print ("\ncoloque inmuebles ");
        inmuebles = Integer.parseInt((entradaEscaner.nextLine ()));
        System.out.print ("\ncoloque vehiculos ");
        vehiculos = Integer.parseInt((entradaEscaner.nextLine ()));
        System.out.print ("Poseer una embarcación, una aeronave de lujo o\nser titular de activos societarios que demuestren capacidad económica plena? S o N ");
        respuesta = entradaEscaner.next().charAt(0);
        switch (respuesta){
            case 'S':
                lujos = true;
                break;
            case 's':
                lujos = true;
                break;
            case 'N':
                lujos = false;
                break;
            case 'n':
                lujos = false;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + respuesta);
        }
        System.out.println("\n"+ingresosMT+"\n"+inmuebles+"\n"+vehiculos+"\n"+respuesta );
        if (ingresosMT>=572386.50||inmuebles>=3||vehiculos>=3||lujos==true){
            categoria='A';
        }else if (ingresosMT>=163539&&ingresosMT<572386.50||inmuebles<=2||vehiculos<=1||lujos==false){
            categoria='M';
        } else if (ingresosMT<163539||inmuebles==1||vehiculos==0||lujos==false){
            categoria='B';
        }
        switch (categoria){
            case 'A':
                System.out.println("\nUsted pertenece al segmento de ingresos ALTOS");
                break;
            case 'M':
                System.out.println("\nUsted pertenece al segmento de ingresos MEDIOS");
                break;
            case 'B':
                System.out.println("\nUsted pertenece al segmento de ingresos BAJOS");
                break;
        }

    }
}
