/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author ProfVespertino
 */
public class ControladorCalculadora {

    private InterfazCalculadora vista;
    private ModeloCalculadora modelo;

    public ControladorCalculadora(InterfazCalculadora vista, ModeloCalculadora modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    public void operar() {
        double op1, op2, resultado = 0;
        char operacion;

        // Leemos los datos de la vista
        op1 = vista.getOperando1();
        op2 = vista.getOperando2();
        operacion = vista.getOperador();

        // Pasamos la datos al modelo
        modelo.setOp1(op1);
        modelo.setOp2(op2);

        // Llamamos operacion pertinente
        switch (operacion) {
            case '+':
                resultado = modelo.suma();
                break;
            case '-':
                resultado = modelo.resta();
                break;
            case '*':
                resultado = modelo.producto();
                break;
            case '/':
                resultado = modelo.producto();
                break;
        }
        
        vista.setResultado(resultado);

    }

}
