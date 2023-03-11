//

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
//
public class ejercicio3 {
    public static void cifrar(int desplazamientoF,String textoF,String rutaEF,String rutaSF){
        String abc = "abcdefghijkl mnñopqrstuvwxyz";
        char [] abcd = new char[abc.length()];
        char [] cadena = new char[textoF.length()];
        try {
            File archivoF = new File(rutaEF);
            // Si el archivo no existe es creado
            if (!archivoF.exists()) {
                archivoF.createNewFile();
            }
            FileWriter fw = new FileWriter(archivoF);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(textoF);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i<textoF.length();i++){//cargo la cadena con la frase, seguramente al pedo
            cadena[i]=textoF.charAt(i);
        }
        for (int j = 0; j<abc.length();j++){//cargo el array del abc tambien casi al pepe
            abcd[j]=abc.charAt(j);
        }
        for (int o = 0; o< textoF.length();o++){
            for (int p = 0; p< abc.length();p++){//recorro la frase caracter por caracter para desplazarlo
                if (textoF.charAt(o)==abc.charAt(p)){
                    if ((desplazamientoF+p)>abc.length()){//esto es de control, por si hay un caracter z
                        int temp = (desplazamientoF+p)-abc.length();
                        cadena[o]=abcd[temp];
                    }
                    else {
                        cadena[o]=abcd[p+desplazamientoF];
                    }
                }
            }
        }
        String contenidoC = new String(cadena);
        System.out.println(contenidoC);
        try {
            File archivoF = new File(rutaSF);
            // Si el archivo no existe es creado
            if (!archivoF.exists()) {
                archivoF.createNewFile();
            }
            FileWriter fw = new FileWriter(archivoF);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenidoC);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void descifrar(int desplazamientoF, String rutaSF) {
        String abc = "abcdefghijkl mnñopqrstuvwxyz";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(rutaSF));
            String texto = br.readLine();
            while(texto == null) {
                System.out.println(texto);
                texto = br.readLine();
            }
            String[] contenido = new String[texto.length()];
            for (int i = 0; i < texto.length();i++){
                for (int p = 0; p < abc.length();p++){
                    if (texto.charAt(i)==abc.charAt(p)){
                        if ((p-desplazamientoF)<0){
                            int temp= abc.length()+(p-desplazamientoF);
                            contenido[i] = String.valueOf(abc.charAt(temp));
                        } else{
                            contenido[i]= String.valueOf(abc.charAt(p-desplazamientoF));
                        }
                    }
                }
            }
            texto= new String(Arrays.toString(contenido));
            File archivoF = new File(rutaSF);
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoF));
            bw.write(texto);
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String ars[]) throws IOException {
        Scanner teclado = new Scanner(System.in);
        String contenido="asdas";
        String rutaE = "C:\\Users\\danie\\OneDrive\\Escritorio\\Argentina Programa\\Repositorio\\ArgentinaPrograma4.0\\IdeaProjects\\clase 4\\textoEntrada.txt";
        String rutaS = "C:\\Users\\danie\\OneDrive\\Escritorio\\Argentina Programa\\Repositorio\\ArgentinaPrograma4.0\\IdeaProjects\\clase 4\\textoSalida.txt";
        char modo;
        int desplazamiento;
        System.out.print("modo codificar 'c' o decodificar 'd' o 's'(salir): ");
        modo = teclado.next().charAt(0);
        while (modo!='s'){
            if (modo=='c'){
                System.out.print("desplazamiento : ");
                desplazamiento= Integer.parseInt(teclado.next());
                teclado.nextLine();
                System.out.print("texto : ");
                contenido = teclado.nextLine();
                cifrar(desplazamiento,contenido,rutaE,rutaS);
            } else if (modo=='d') {
                System.out.print("desplazamiento : ");
                desplazamiento= Integer.parseInt(teclado.next());
                teclado.nextLine();
                descifrar(desplazamiento,rutaS);
            }
            System.out.print("modo codificar 'c' o decodificar 'd' o 's'(salir): ");
            modo = teclado.next().charAt(0);

        }
    }
}
