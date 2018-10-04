package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class SW3GridLayout extends JFrame{
    private JPanel panelNorte, panelCentral, panelOeste;
    private JButton btnA, btnB;
    private JLabel lb1,lb2,lb3;
    private JComboBox[] colComboBox;
    
    public SW3GridLayout(){
        // Establezco la distribucion del panel principal
        this.getContentPane().setLayout(new BorderLayout());
        
        // Creo los paneles
        this.panelNorte = new JPanel();
        this.panelCentral = new JPanel();
        this.panelOeste = new JPanel();
        
        // Doy una distribucion a los tres paneles que conforman el GUI
        panelNorte.setLayout(new FlowLayout());
        panelCentral.setLayout(new GridLayout(3, 3));
        panelOeste.setLayout(new BoxLayout(panelOeste, BoxLayout.Y_AXIS));
        
        // Aniado los paneles al panel principal
        this.getContentPane().add(panelNorte, BorderLayout.NORTH);
        this.getContentPane().add(panelCentral, BorderLayout.CENTER);
        this.getContentPane().add(panelOeste, BorderLayout.WEST);
        
        // Creo los elementos
        this.btnA = new JButton();
        this.btnB = new JButton();
        this.lb1 = new JLabel();
        this.lb2 = new JLabel();
        this.lb3 = new JLabel();
        this.colComboBox = new JComboBox[9];
        
        // Defino un texto para cada elemento
        this.btnA.setText("Boton A");
        this.btnB.setText("Boton B");
        this.lb1.setText("Etiqueta 1");
        this.lb2.setText("Etiqueta 2");
        this.lb3.setText("Etiqueta 3");
        
        // Aniado los elementos a sus respectivos paneles
        this.panelNorte.add(btnA);
        this.panelNorte.add(btnB);
        this.panelOeste.add(lb1);
        this.panelOeste.add(lb2);
        this.panelOeste.add(lb3);
        this.crearComboBox();
        
        // Establecer un titulo
        this.setTitle("Grid Layout");
        
        // Centrar la ventana
        this.setLocationRelativeTo(null);
        
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
    
    private void crearComboBox(){
        for(JComboBox cmbox : this.colComboBox){
            cmbox = new JComboBox();
            this.panelCentral.add(cmbox);
        }
    }
    
    public static void main(String[] args){
        new SW3GridLayout();
    }
}
