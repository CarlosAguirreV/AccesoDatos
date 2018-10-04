package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class SW4BorderLayout extends JFrame{
    private JButton btn1O, btn2O, btn3O, btn1E, btn2E, btn3E, btn1S, btn2S;
    private JLabel titulo;
    private JTextArea areaTexto;
    private JPanel panelO, panelE, panelS;
    
    public SW4BorderLayout(){
        this.iniciarElementos();
        this.definirTextoElementos();
        this.definirEstiloElementos();
        this.definirDistribucionPaneles();
        this.aniadirElementosPaneles();
        this.definirTamanioVentana(30, 20);
        
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Border Layout");
        this.setLocationRelativeTo(null);
        //this.pack(); No es necesario si se usa .setSize();
        this.setVisible(true);
    }
    
    private void iniciarElementos(){
        this.btn1O = new JButton();
        this.btn2O = new JButton();
        this.btn3O = new JButton();
        this.btn1E = new JButton();
        this.btn2E = new JButton();
        this.btn3E = new JButton();
        this.btn1S = new JButton();
        this.btn2S = new JButton();
        this.titulo = new JLabel();
        this.areaTexto = new JTextArea();
        this.panelO = new JPanel();
        this.panelE = new JPanel();
        this.panelS = new JPanel();
    }
    
    private void definirTextoElementos(){
        this.btn1O.setText("Izq1");
        this.btn2O.setText("Izq2");
        this.btn3O.setText("Izq3");
        this.btn1E.setText("Der1");
        this.btn2E.setText("Der2");
        this.btn3E.setText("Der3");
        this.btn1S.setText("Aceptar");
        this.btn2S.setText("Cancelar");
        this.titulo.setText("Demostracion por INFORUX");
        this.areaTexto.setText("Esto es un jTextArea");
    }
    
    private void definirEstiloElementos(){
        this.titulo.setFont(new Font("Tahoma", 1, 24));
        this.titulo.setHorizontalAlignment(SwingConstants.CENTER);
        this.panelE.setBackground(Color.blue);
        this.panelO.setBackground(Color.red);
        this.panelS.setBackground(Color.green);
    }
    
    private void definirDistribucionPaneles(){
        this.getContentPane().setLayout(new BorderLayout());
        this.panelO.setLayout(new BoxLayout(panelO, BoxLayout.Y_AXIS));
        this.panelE.setLayout(new BoxLayout(panelE, BoxLayout.Y_AXIS));
        this.panelS.setLayout(new FlowLayout());
    }
    
    private void aniadirElementosPaneles(){
        this.getContentPane().add(this.panelO, BorderLayout.WEST);
        this.getContentPane().add(this.panelE, BorderLayout.EAST);
        this.getContentPane().add(this.panelS, BorderLayout.SOUTH);
        this.getContentPane().add(this.titulo, BorderLayout.NORTH);
        this.getContentPane().add(this.areaTexto, BorderLayout.CENTER);
        
        this.panelO.add(this.btn1O);
        this.panelO.add(this.btn2O);
        this.panelO.add(this.btn3O);
        this.panelE.add(this.btn1E);
        this.panelE.add(this.btn2E);
        this.panelE.add(this.btn3E);
        this.panelS.add(this.btn1S);
        this.panelS.add(this.btn2S);
    }
    
    private void definirTamanioVentana(double porcAlto, double porcAncho){
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        
        double altoFinal = pantalla.height * (porcAlto / 100);
        double anchoFinal = pantalla.width * (porcAncho / 100);
        
        this.setSize(new Dimension((int)anchoFinal, (int)altoFinal));
    }
    
    public static void main(String[] args) {
        new SW4BorderLayout();
    }
}
