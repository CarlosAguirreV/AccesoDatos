package ejerciciosLibro;

import java.io.File;

/**
 * Actividad 1.1 parte 1.
 * Pagina: 4
 * Obtener el listado de archivos de un directorios cualquiera.
 * @author Carlos
 */
public class Actividad1_1A {
    private File directorio;
    
    public Actividad1_1A(){
        this.directorio = new File("./");
        this.listarFicheros();
    }
    
    private void listarFicheros(){
        if(this.directorio.exists()){
            String[] listadoElementos = this.directorio.list();
            
            System.out.println("Archivos en la ruta: " + this.directorio.toString());
            
            for(String nombreElemento : listadoElementos){
                File elemento = new File(this.directorio, nombreElemento);
                if(elemento.isFile())System.out.println(" - " + nombreElemento);
            }
        }
        else{
            System.out.println("La ruta especificada no es correcta.\n");
        }
    }
    
    public static void main(String[] args) {
        new Actividad1_1A();
    }
}
