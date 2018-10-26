package xml;

import java.util.ArrayList;

public class GenerarXML {
    public static void main(String[] args) {
        ArrayList<Asignatura> listaAsignatura = new ArrayList();
        
        Asignatura asignatura1 = new Asignatura(1, "Lenguaje", 8);
        listaAsignatura.add(asignatura1);
        
        Asignatura asignatura2 = new Asignatura(2, "Matematicas", 12);
        listaAsignatura.add(asignatura2);
        
        ListadoAsignatura listadoAsig = new ListadoAsignatura(listaAsignatura);
        
    }
}
