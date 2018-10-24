package MVC;

public class Run {
    public static void main(String[] args) {
        VistaCalculadora vista = new VistaCalculadora();
        ModeloCalculadora modelo = new ModeloCalculadora();
        ControladorCalculadora controlador = new ControladorCalculadora(vista, modelo);
        
        vista.setControlador(controlador);
        vista.muestrate();
    }
}
