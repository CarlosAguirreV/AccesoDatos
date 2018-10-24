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
public interface InterfazCalculadora {
    public abstract double getOperando1();
    public abstract double getOperando2();
    public abstract char getOperador();
    public abstract void setResultado(double resultado);
    
    // Metodos añadidos del patron MVC
    public abstract void setControlador(Object o);
    public abstract void muestrate();
}
