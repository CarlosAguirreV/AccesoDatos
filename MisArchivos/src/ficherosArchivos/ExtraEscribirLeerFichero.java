package ficherosArchivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ExtraEscribirLeerFichero {
    private FileWriter escritor;
    private FileReader lector;
    private BufferedReader memoriaIntermedia;
    private String NOMBRE_ARCHIVO = "texto.txt";
    
    public ExtraEscribirLeerFichero(){
        this.crearArchivo();
        this.escribirLinea("Hola mundo");
        System.out.println("Contenido linea: " + this.leerLinea());
    }
    
    // Inicializa el escritor (crea el archivo), el lector y la memoria intermedia (buffer):
    private void crearArchivo(){
        try{
            this.escritor = new FileWriter(NOMBRE_ARCHIVO);
            this.lector = new FileReader(NOMBRE_ARCHIVO);
            this.memoriaIntermedia = new BufferedReader(lector);
        }
        catch(Exception ex){ex.printStackTrace();}
    }
    
    // Obtiene la primera linea de texto del archivo:
    public String leerLinea(){
        try{return memoriaIntermedia.readLine();}
        catch(Exception ex){
            ex.printStackTrace();
            return "Error al leer la linea.";
        }
    }
    
    // Esto sobreescribe todo el contenido existente, no lo continua.
    // Devuelve true si se ha podido escribir, false en caso contrario:
    public void escribirLinea(String cadena){
        try{
            this.escritor.write(cadena);
            this.escritor.close(); // MUY IMPORTANTE: Al terminar de escribir en un fichero, este hay que cerrarlo
        }
        catch(Exception ex){ex.printStackTrace();}
    }
    
    public static void main(String[] args) {
        new ExtraEscribirLeerFichero();
    }
}
