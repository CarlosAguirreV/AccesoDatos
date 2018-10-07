package ejerciciosLibro;

import java.io.File;

/**
 * Actividad 1.1 parte 2.
 * Pagina: 4
 * Obtener el listado de archivos de uno o varios directorios pasados como argumento.
 * @author Carlos
 */
public class Actividad1_1B {
    private File directorio;
    
    public Actividad1_1B(String[] directorios){
        for(String directorio : directorios){
            this.directorio = new File(directorio);
            this.listarFicheros();
        }
    }
    
    private void listarFicheros(){
        if(this.directorio.exists()){
            String[] listadoElementos = this.directorio.list();
            
            System.out.println("Archivos en la ruta: " + this.directorio.toString());
            
            for(String nombreElemento : listadoElementos){
                File elemento = new File(this.directorio, nombreElemento);
                if(elemento.isFile())System.out.println(" - " + nombreElemento);
            }
            System.out.println("\n");
        }
        else{
            System.out.println("La ruta especificada no es correcta.\n");
        }
    }
    
    public static void main(String[] argumentos) {
        new Actividad1_1B(argumentos);
    }
}
