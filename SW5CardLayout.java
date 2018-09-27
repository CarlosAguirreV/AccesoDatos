package ventanas;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class SW5CardLayout extends JFrame{
    
    private JPanel jpSur, jpCentro, jp1, jp2, jp3, jp4, jp5;
    private JButton btnSiguiente, btnFinalizar;
    private CardLayout distribucionCarta;
    private byte contador;
    
    private SW5CardLayout(){
        this.inicializarElementos();
        this.definirTextoElementos();
        this.definirEstilo();
        this.establecerDistribucion();
        this.aniadirElementos();
        
        this.eventos();
        
        this.setTitle("Card Layout");
        this.definirTamanioVentana(30,20);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    private void inicializarElementos(){
        this.jpSur = new JPanel();
        this.jpCentro = new JPanel();
        this.jp1 = new JPanel();
        this.jp2 = new JPanel();
        this.jp3 = new JPanel();
        this.jp4 = new JPanel();
        this.jp5 = new JPanel();
        this.btnSiguiente = new JButton();
        this.btnFinalizar = new JButton();
        this.distribucionCarta = new CardLayout();
        this.contador = 0;
    }
    
    private void definirTextoElementos(){
        this.btnSiguiente.setText("Siguiente");
        this.btnFinalizar.setText("Finalizar");
    }
    
    private void definirEstilo(){
        this.jp1.setBackground(Color.red);
        this.jp2.setBackground(Color.green);
        this.jp3.setBackground(Color.blue);
        this.jp4.setBackground(Color.orange);
        this.jp5.setBackground(Color.pink);
    }
    
    private void establecerDistribucion(){
        this.getContentPane().setLayout(new BorderLayout());
        this.jpSur.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.jpCentro.setLayout(this.distribucionCarta);
    }
    
    private void aniadirElementos(){
        this.getContentPane().add(this.jpSur, BorderLayout.SOUTH);
        this.getContentPane().add(this.jpCentro, BorderLayout.CENTER);
        this.jpSur.add(this.btnSiguiente);
        this.jpSur.add(this.btnFinalizar);
        this.jpCentro.add(this.jp1, "carta1");
        this.jpCentro.add(this.jp2, "carta2");
        this.jpCentro.add(this.jp3, "carta3");
        this.jpCentro.add(this.jp4, "carta4");
        this.jpCentro.add(this.jp5, "carta5");
    }
    
    private void eventos(){
        this.btnSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarPanel();
            }
        });
        
        this.btnFinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
    }
    
    private void cambiarPanel(){
        this.contador++;

        switch(contador){
            case 0: this.distribucionCarta.show(jpCentro, "carta1"); break;
            case 1: this.distribucionCarta.show(jpCentro, "carta2"); break;
            case 2: this.distribucionCarta.show(jpCentro, "carta3"); break;
            case 3: this.distribucionCarta.show(jpCentro, "carta4"); break;
            case 4: this.distribucionCarta.show(jpCentro, "carta5"); break;
        }
        
        if(this.contador >= 4){this.btnSiguiente.setEnabled(false);}
    }
    
    private void definirTamanioVentana(double porcAlto, double porcAncho){
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        
        double altoFinal = pantalla.height * (porcAlto / 100);
        double anchoFinal = pantalla.width * (porcAncho / 100);
        
        this.setSize(new Dimension((int)anchoFinal, (int)altoFinal));
    }
    
    public static void main(String[] args) {
        new SW5CardLayout();
    }
}