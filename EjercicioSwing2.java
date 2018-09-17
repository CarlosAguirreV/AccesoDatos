package tema0;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class EjercicioSwing2 extends JFrame{
    private char[] colCaracteres = {'7','8','9','/','4','5','6','*','1','2','3','-','0',',','%','+'};
    
    public EjercicioSwing2(){
        this.getContentPane().setLayout(new GridLayout(4,4,5,5));
        this.addBotones();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
    
    private void addBotones(){
        for(int i = 0; i < colCaracteres.length; i++){
            String caracter = Character.toString(colCaracteres[i]);
            JButton btnTemporal = new JButton();
            btnTemporal.setText(caracter);
            this.getContentPane().add(btnTemporal);
        }
    }
    
    public static void main(String args[]){
        new EjercicioSwing2();
    }
}