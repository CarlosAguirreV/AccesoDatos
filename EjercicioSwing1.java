package tema0;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class EjercicioSwing1 extends JFrame{
    private JLabel text1, text2;
    private JTextField arR, arB;
    private JButton btn2pr, btn2pb, btn1pr, btn1pb;
    
    public EjercicioSwing1(){
        // Creacion
        text1 = new JLabel();
        text2 = new JLabel();
        arR = new JTextField();
        arB = new JTextField();
        btn2pr = new JButton();
        btn2pb = new JButton();
        btn1pr = new JButton();
        btn1pb = new JButton();
        
        // Definir texto
        text1.setText("Manresa");
        text2.setText("Visitante");
        arR.setText("59");
        arB.setText("38");
        btn2pr.setText("2 Puntos");
        btn2pb.setText("2 Puntos");
        btn1pr.setText("1 Punto");
        btn1pb.setText("1 Punto");
        
        // Estilos de los elementos
        text1.setHorizontalAlignment(SwingConstants.CENTER);
        text2.setHorizontalAlignment(SwingConstants.CENTER);
        arR.setHorizontalAlignment(SwingConstants.CENTER);
        arB.setHorizontalAlignment(SwingConstants.CENTER);
        text1.setForeground(Color.red);
        text2.setForeground(Color.blue);
        btn2pr.setBackground(Color.red);
        btn2pb.setBackground(Color.blue);
        btn1pr.setBackground(Color.red);
        btn1pb.setBackground(Color.blue);
        
        // Establecer una distribucion al panel de la ventana por defecto
        this.getContentPane().setLayout(new GridLayout(4,2,5,5));
        
        // Aniadir elementos al panel
        this.getContentPane().add(text1);
        this.getContentPane().add(text2);
        this.getContentPane().add(arR);
        this.getContentPane().add(arB);
        this.getContentPane().add(btn2pr);
        this.getContentPane().add(btn2pb);
        this.getContentPane().add(btn1pr);
        this.getContentPane().add(btn1pb);
        
        // Al pulsar la X se cierra la aplicacion.
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        // Empaquetar y mostrar
        this.pack();
        this.setVisible(true);  
    }
    
    public static void main(String args[]){
        new EjercicioSwing1();
    }
}