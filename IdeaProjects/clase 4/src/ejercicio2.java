import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ejercicio2 {
    public  static void imprimirSumMul(Path ruta,char estilo) throws IOException{
        int suma=0;
        long mult=1;
        List <String> lineas = Files.readAllLines(ruta);
        if (estilo=='s'){
            for (String linea : lineas) {
                suma = suma+ Integer.parseInt(linea);
                System.out.println(linea);
            }
            System.out.print("\u001B[32m"+suma);
        }
        else if (estilo=='m'){
            for (String linea : lineas) {
                mult = mult * Integer.parseInt(linea);
                System.out.println(linea);
            }
            System.out.print("\u001B[32m"+mult);
        }
    }
    public static void main(String[] args)throws IOException{
        char modo;
        Scanner scan = new Scanner(System.in);
        Path archivo = Paths.get("C:\\Users\\danie\\IdeaProjects\\clase 4\\ficheroNumeros.txt");
        System.out.print("sumar 's' o multiplicar 'm':");
        modo=scan.next().charAt(0);
        imprimirSumMul(archivo,modo);
    }

}
