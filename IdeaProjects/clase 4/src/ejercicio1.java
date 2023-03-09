import java.util.Scanner;

public class ejercicio1 {
    static void Ordenar2(int numero1,int numero2,int numero3, char orden){
        int[] Vector = new int[3];
        int cont=0;
        Vector[0]=numero1;
        Vector[1]=numero2;
        Vector[2]=numero3;
        switch (orden){
            case 'a':
                for (int i=0;i<3;i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(Vector[j] + " ");
                        if (Vector[i] < Vector[j]) {
                            cont = Vector[j];
                            Vector[j] = Vector[i];
                            Vector[i] = cont;
                        }
                    }
                    System.out.print("\n");
                }
                break;
            case 'd':
                for (int i=0;i<3;i++){
                    for (int j=0; j<3; j++){
                        System.out.print(Vector[j]+" ");
                        if (Vector[i]>Vector[j]){
                            cont=Vector[j];
                            Vector[j]=Vector[i];
                            Vector[i]=cont;
                        }
                    }
                    System.out.print("\n");
                }
                break;
            default:
                System.out.print("\u001B[31m"+"no se que paso");
                break;
        }
        for (int i=0;i<3;i++){
            System.out.print("\u001B[31m"+Vector[i]+" ");
        }
    }
    public static int verificacion()
    {
        Scanner scan = new Scanner(System.in);
        do {
            if (scan.hasNext()) {
                if (scan.hasNextInt()) {
                    return scan.nextInt();
                } else {
                    scan.next();
                    System.out.print("No ha introducido un número correcto.\n\nFavor entrar un entero como 25, -178, o 3: ");
                }
            } else {
                System.out.println("Q carajo hiciste? sera '0' por bobo ");
                return 0;
            }
        } while (true);
    }
    public static void main(String[] args) {
        char Spalabra;
        int num1=0;
        int num2=0;
        int num3=0;
        Scanner teclado = new Scanner(System.in);
        //EJERCICIO 1B
        System.out.print ("\ncoloque numero 1");
        num1=verificacion();
        System.out.print ("\ncoloque numero 2");
        num2 = verificacion();
        System.out.print ("\ncoloque numero 3");
        num3 = verificacion();
        System.out.print ("\norden ascendente 'a' o decreciente 'b': ");
        Spalabra = teclado.nextLine().charAt(0);
        Ordenar2(num1,num2,num3,Spalabra);
    }
}
