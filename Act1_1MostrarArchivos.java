import java.io.*;

public class Act1_1MostrarArchivos {
    
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Error: Debe indicarse una ruta como argumento");
            System.exit(0);
        }
        
        File f = new File(args[0]);
        
        if(!f.exists()){
            System.out.println("Esa ruta no existe");
        }else if(!f.isDirectory()){
            System.out.println("Esa ruta no es una carpeta");                    
        }else{
            System.out.println("Archivos en: " + args[0]);

            File[] files = f.listFiles();
            if(files != null){
                for (File file : files) {
                    System.out.printf("Nombre: %s, %ses fichero, %ses directorio, ocupa %s bytes\n",
                            file.getName(), 
                            file.isFile() ? "" : "no ",
                            file.isDirectory() ? "" : "no ",
                            file.length());
                }
            }else{
                System.out.println("No se puede leer la carpeta");
            }
        }
    }
}
