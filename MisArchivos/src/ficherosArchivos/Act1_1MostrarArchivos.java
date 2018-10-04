package ficherosArchivos;

import java.io.File;
import java.util.ArrayList;

public class Act1_1MostrarArchivos {
    private ArrayList<String> listaArchivos;
    private File directorioActual;
    
    public Act1_1MostrarArchivos(String[] listaDirectorios){
        for(String directorio : listaDirectorios){
            this.listaArchivos = new ArrayList();
            this.directorioActual = new File(directorio);

            this.getListaArchivos();
        }
    }
    
    // Obtiene la lista de archivos si la ruta actual es correcta:
    private void getListaArchivos(){
        if(this.directorioActual.exists()){
            String[] listaElementos = this.directorioActual.list();
            
            for(int i = 0; i < listaElementos.length; i++){ 
                File elemento = new File(this.directorioActual, listaElementos[i]);
                if(elemento.isFile()){this.listaArchivos.add(listaElementos[i]);}
            }
            
            this.mostrarArchivos();
        }
        else{System.out.println("La ruta: " + this.directorioActual + "\nNo es correcta.");}
    }
    
    // Muestra la lista de archivos:
    private void mostrarArchivos(){
        System.out.println("La ruta actual es: " + this.directorioActual);
        
        if(this.listaArchivos.size() > 0){
            System.out.println("Se encontraron " + Integer.toString(this.listaArchivos.size()) + " archivos:");
            for(String nombreArchivo : this.listaArchivos){System.out.println("- " + nombreArchivo);}
        }
        else{System.out.println("No hay archivos que mostrar.");}

        System.out.println("");
    }
    
    public static void main(String[] args) {
        
        new Act1_1MostrarArchivos(args); 
    }
}
