package bdoo;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

public class Prueba {
    public Prueba(){
        this.almacenarObjetos();
    }
    
    public void almacenarObjetos(){
        Pais pais1 = new Pais(0, "España");
        Pais pais2 = new Pais(1, "Alemania");
        Pais pais3 = new Pais(2, "Francia");
        Pais pais4 = new Pais(3, "Letonia");
        
        Jugador j1 = new Jugador(pais1,"Jaime", "Futbol", 25);        
        Jugador j2 = new Jugador(pais1, "Elena", "Futbol", 22);
        Jugador j3 = new Jugador(pais3, "Diego", "Baloncesto", 30);
        Jugador j4 = new Jugador(pais4, "Palomo", "Hockey", 19);
        Jugador j5 = new Jugador(pais2, "Nerea", "Rutby", 31);
        Jugador j6 = new Jugador(pais4, "Ines", "Patinaje", 45);
        
        ODB odb = ODBFactory.open("equipos.db");
        odb.store(pais1);
        odb.store(pais2);
        odb.store(pais3);
        odb.store(pais4);
        odb.store(j1);
        odb.store(j2);
        odb.store(j3);
        odb.store(j4);
        odb.store(j5);
        odb.store(j6);
        
        odb.close();
    }
    
    public static void main(String[] args) {
        new Prueba();
    }
}
