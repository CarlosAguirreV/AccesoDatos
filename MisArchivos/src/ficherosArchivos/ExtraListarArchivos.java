package ficherosArchivos;

import java.io.File;
import java.util.ArrayList;

public class ExtraListarArchivos {
    private ArrayList<String> listaArchivos;
    private File directorio;
    private String RUTA = "./";
    
    public ExtraListarArchivos(){
        this.listaArchivos = new ArrayList();
        this.directorio = new File(RUTA);
        
        this.getListaArchivos();
    }
    
    // Obtiene la lista de archivos si la ruta actual es correcta:
    public void getListaArchivos(){
        if(this.directorio.exists()){
            String[] listaElementos = this.directorio.list();
            
            for(int i = 0; i < listaElementos.length; i++){ 
                File elemento = new File(this.directorio, listaElementos[i]);
                if(elemento.isFile()){this.listaArchivos.add(listaElementos[i]);}
            }
            
            this.mostrarArchivos();
        }
        else{System.out.println("La ruta: " + this.RUTA + "\nNo es correcta.");}
    }
    
    // Muestra la lista de archivos:
    private void mostrarArchivos(){
        System.out.println("La ruta actual es: " + RUTA);
        
        if(this.listaArchivos.size() > 0){
            System.out.println("Se encontraron " + Integer.toString(this.listaArchivos.size()) + " archivos:");
            for(String nombreArchivo : this.listaArchivos){System.out.println("- " + nombreArchivo);}
        }
        else{System.out.println("No hay archivos que mostrar.");}

        System.out.println("");
    }
    
    public static void main(String[] args) {
        
        new ExtraListarArchivos(); 
    }
}
