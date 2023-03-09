import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class ejercicio3 {
    static void codificacion(String frase,Path ruta) throws IOException{
        Files.write(ruta, frase.getBytes());
        System.out.print("\u001B[32m"+"cargado con exito");
    }
    static void decodificacion(String frase,int numero)throws IOException{
        String abc = "abcdefghijklmnñopqrstuvwxyz";
        char [] abcd = new char[abc.length()];
        char [] cadena = new char[frase.length()];
        int posicion = 0;//variable completamente inutil
        for (int i = 0; i<frase.length();i++){//cargo la cadena con la frase, seguramente al pedo
            cadena[i]=frase.charAt(i);
        }
        for (int j = 0; j<abc.length();j++){//cargo el array del abc tambien casi al pepe
            abcd[j]=abc.charAt(j);
        }
        for (int o = 0; o< frase.length();o++){
            for (int p = 0; p< abc.length();p++){//recorro la frase caracter por caracter para desplazarlo
                if (frase.charAt(o)==abc.charAt(p)){
                    if ((numero+p)>abc.length()){//esto es de control, por si hay un caracter z
                        int temp = (numero+p)-abc.length();
                        cadena[o]=abcd[temp];
                    }
                    else {
                        cadena[o]=abcd[p+numero];
                    }
                }
                posicion++;
            }
            posicion=o;
            System.out.print(cadena[o]+",");
        }
    }
    static void escribo()throws IOException{
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("c:/prueba.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 10; i++)
                pw.println("Linea " + i);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para
                // asegurarnos que se cierra el fichero.
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    public static void main(String[] args)throws IOException {
        char modo = 'q';
        String texto;
        Scanner scan = new Scanner(System.in);
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        Path archivoE = Paths.get("C:\\Users\\danie\\IdeaProjects\\clase 4\\textoEntrada.txt");
        Path archivoS = Paths.get("C:\\Users\\danie\\IdeaProjects\\clase 4\\textoSalida.txt");
        try {
            archivo=new File("C:\\Users\\danie\\IdeaProjects\\clase 4\\textoEntrada.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        do {
            if (modo == 'c') {
                System.out.print("\ningrese el texto: ");
                texto = scan.next().toLowerCase(Locale.ROOT);
                codificacion(texto, archivoE);
            } else if (modo == 'd') {

            }
            System.out.print("\nCodificacion 'c' Decodificacion 'd' o salir 's': ");
            modo = scan.next().charAt(0);
        } while (modo != 's');
    }
}
