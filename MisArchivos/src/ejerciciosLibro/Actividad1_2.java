package ejerciciosLibro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Actividad 1.2
 * Pagina: 13
 * Leer un archivo de texto. Flujo de caracteres.
 * @author Carlos
 */
public class Actividad1_2 {

    private File ruta;

    public Actividad1_2() {
        this.ruta = new File("./", "Actividad1_2.txt");
        
        try{
            FileReader lector = new FileReader(this.ruta);
            int codigoCaracter;
            while((codigoCaracter = lector.read()) != -1){ // El caracter -1 indica que ha llegado al final del archivo.
                System.out.print((char) codigoCaracter);
            }
            lector.close();
            System.out.println("");
        }
        catch(Exception ex){}
    }

    public static void main(String[] args) {
        new Actividad1_2();
    }
}
