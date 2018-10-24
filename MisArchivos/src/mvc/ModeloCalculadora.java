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
public class ModeloCalculadora {
    private double op1, op2;

    public ModeloCalculadora() {
    }

    public double getOp1() {
        return op1;
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public double getOp2() {
        return op2;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }
    
    public double suma() {
        return op1 + op2;
    }
    
    public double resta() {
        return op1 + op2;
    }
    
    public double producto(){
        return op1 * op2;
    }
    
    public double division(){
        return op1 / op2;
    }
}
