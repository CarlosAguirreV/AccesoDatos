
package catalogoProductos;

import java.util.Random;


public class Random2 {  
    public static void main(String[] args) {
        Random rand = new Random();
        for(int i = 0; i < 100; i++){
            System.out.println(rand.nextInt(40));
        }
        
    }
}
