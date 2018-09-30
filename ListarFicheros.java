/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ad;

import java.io.*;

/**
 *
 * @author Vespertino
 */
public class Act1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            File f = new File(args[0]);
            File[] ficheros;
            
            if (!f.exists()) {
                System.out.println("El fichero no existe");
                System.exit(0);
            }
            ficheros = f.listFiles();
            
            for(int i = 0; i < ficheros.length; i++) {
                System.out.println(ficheros[i].getName());
            }
        
    }
    
}
