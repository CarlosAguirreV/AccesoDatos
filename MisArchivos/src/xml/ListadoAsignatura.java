package xml;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class ListadoAsignatura {
    private ArrayList<Asignatura> coleccionLibros = new ArrayList();

    public ArrayList<Asignatura> getColeccionLibros() {
        return coleccionLibros;
    }
    
    public ListadoAsignatura() {}
    
    @XmlElementWrapper(name = "listaDeAsignatura")
    @XmlElement(name = "asignatura")
    
    public void setColeccionLibros(ArrayList<Asignatura> coleccionLibros) {
        this.coleccionLibros = coleccionLibros;
    }
    
    public ListadoAsignatura(ArrayList coleccionLibros) {
        this.coleccionLibros = coleccionLibros;
    }
    
    
    
}
