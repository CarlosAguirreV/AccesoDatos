package ficherosArchivos;

import java.io.File;

public class Act1_1 {
    public Act1_1(String[] listaDirectorios){
        for(String directorio : listaDirectorios){ // 2) Recorro todos los argumentos pasados al constructor, que contendrán cadenas con directorios
            System.out.println("La ruta actual es: " + directorio); // 3) Muestro el directorio (ruta) actual con el que trabaja en este momento

            File ruta = new File(directorio); // 4) Creo un objeto de archivo pasandole el directorio (ruta)
            
            if(ruta.exists()){ // 5) Comprobamos si la ruta pasada existe o no
                System.out.println("Estado: OK \nSe encontraron los siguientes archivos:"); // 6) Enhorabuena, si llega hasta aqui es que la ruta es correcta
                String[] listaElementos = ruta.list(); // 7) Almaceno en un array el listado de todos los elementos (archivos y directorios) que hay en la ruta actual
                
                for(int i = 0; i < listaElementos.length; i++){ // 8) Recorro todo el array de elementos (archivos y directorios)
                    File elemento = new File(ruta, listaElementos[i]); // 9) Creo un objeto de archivo pasandole la ruta y el elemento (archivo/directorio) que toque en ese momento
                    
                    if(elemento.isFile()){System.out.println("- " + listaElementos[i]);} // 9) Si el elemento es un archivo lo muestra 
                }
            }
            else{System.out.println("Estado: ERROR \nEsta ruta no es valida por lo que no se puede comprobar.");} // 6) Si la ruta no es valida muestra este mensaje
            
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        
        new Act1_1(args); // 1) Creamos un objeto de la actividad 1_1 y le pasamos los argumentos 
    }
}
