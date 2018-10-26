package xml;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"codigo", "nombre", "horas"})
public class Asignatura {
    private int cod;
    private String nombre;
    private int horas;
    
    public Asignatura(int cod, String nombre, int horas) {
        this.cod = cod;
        this.nombre = nombre;
        this.horas = horas;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getCod() {
        return cod;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }
    
    @Override
    public String toString() {
        return "Asignatura{" + "cod=" + cod + ", nombre=" + nombre + ", horas=" + horas + '}';
    }
}
