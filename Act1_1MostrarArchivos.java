package ficherosArchivos;

import java.io.File;
import java.util.ArrayList;

public class Act1_1MostrarArchivos {
    private ArrayList<String> listaArchivos;
    
    public Act1_1MostrarArchivos(String[] listaDirectorios){
        for(String directorio : listaDirectorios){
            
            this.listaArchivos = new ArrayList();
            System.out.println("La ruta actual es: " + directorio);

            File ruta = new File(directorio);
            
            if(this.getListaArchivos(ruta)){
                System.out.println("Se encontraron " + Integer.toString(this.listaArchivos.size()) + " archivos:");
                for(String nombreArchivo : this.listaArchivos){System.out.println("- " + nombreArchivo);}
            }
            else{System.out.println("Esta ruta no es valida por lo que no se puede comprobar.");}
            
            System.out.println("");
        }
    }
    
    // Obtiene la lista de archivos si la ruta actual es correcta
    // Devuelve true si es correcta por lo que se ha creado el listado y false en caso contrario
    private boolean getListaArchivos(File rutaActual){
        if(rutaActual.exists()){
            String[] listaElementos = rutaActual.list();
            
            for(int i = 0; i < listaElementos.length; i++){ 
                File elemento = new File(rutaActual, listaElementos[i]);
                if(elemento.isFile()){this.listaArchivos.add(listaElementos[i]);}
            }
            return true;
        }
        else{return false;}
    }
    
    public static void main(String[] args) {
        
        new Act1_1MostrarArchivos(args); // 1) Creamos un objeto de la actividad 1_1 y le pasamos los argumentos 
    }
}
