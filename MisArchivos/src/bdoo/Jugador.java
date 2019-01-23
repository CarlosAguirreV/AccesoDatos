package bdoo;

public class Jugador {

    private Pais pais;
    private String nombre;
    private String deporte;
    private int edad;

    public Jugador(Pais pais, String nombre, String deporte, int edad) {
        this.pais = pais;
        this.nombre = nombre;
        this.deporte = deporte;
        this.edad = edad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Jugador{" + "pais=" + pais + ", nombre=" + nombre + ", deporte=" + deporte + ", edad=" + edad + '}';
    }
}
