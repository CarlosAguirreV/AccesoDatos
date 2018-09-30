/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac_cardlayout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.util.List;
import java.util.ArrayList;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.*;

/**
 *
 * @author alex
 */
public class Prac_CardLayout extends JFrame{
    
    private JPanel pnlCentral, pnlSur, pnl1, pnl2, pnl3, pnl4, pnl5;
    private CardLayout cl;
    private JButton btnSiguiente, btnFinalizar;
    private int contador;
    
    /**
     * CONSTRUCTOR
     */
    public Prac_CardLayout()
    {
        super("Demo CardLayout");
        
        JPanel contenidoVentana = (JPanel)this.getContentPane();
        contenidoVentana.setLayout(new BorderLayout());
        
        inicializarComponentes();
        
        pnlCentral.setLayout(cl);
        pnlCentral.add(pnl1, "carta1");
        pnlCentral.add(pnl2, "carta2");
        pnlCentral.add(pnl3, "carta3");
        pnlCentral.add(pnl4, "carta4");
        pnlCentral.add(pnl5, "carta5");
        
        pnlSur.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pnlSur.add(btnSiguiente);
        pnlSur.add(btnFinalizar);
        
        contenidoVentana.add(pnlCentral, BorderLayout.CENTER);
        contenidoVentana.add(pnlSur, BorderLayout.SOUTH);
        
        // Edito la configuración de la pantalla
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(800, 600);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(d.width/2 - getWidth()/2, d.height/2 - getHeight()/2);
    }
    
    /**
     * Inicializa los componentes y les da estilo
     */
    private void inicializarComponentes()
    {
        contador = 0;
        
        pnlCentral = new JPanel();
        pnlSur = new JPanel();
        pnl1 = new JPanel();
        pnl2 = new JPanel();
        pnl3 = new JPanel();
        pnl4 = new JPanel();
        pnl5 = new JPanel();
        
        cl = new CardLayout();
        
        btnSiguiente = new JButton("Siguiente");
        btnSiguiente.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) 
                {
                    clickEnBoton();
                }
                }
            );
            
        btnFinalizar = new JButton("Finalizar");
        btnFinalizar.setEnabled(false);
        btnFinalizar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) 
                {
                    System.exit(0);
                }
                }
            );
        
        pnl5.setBackground(Color.RED);
        pnl1.setBackground(Color.yellow);
        pnl2.setBackground(Color.BLUE);
        pnl3.setBackground(Color.GREEN);
        pnl4.setBackground(Color.DARK_GRAY);
    }
    
    /**
     * Permite pasar de carta en carta al pulsar en el botón
     */
    private void clickEnBoton()
    {
        if (contador == 0) {
            cl.show(pnlCentral, "carta2");
        }
        else if (contador == 1) {
            cl.show(pnlCentral, "carta3");
        }
        else if (contador == 2) {
            cl.show(pnlCentral, "carta4");
        }
        else if (contador == 3) {
            cl.show(pnlCentral, "carta5");
            btnFinalizar.setEnabled(true);
            btnSiguiente.setEnabled(false);
        }
        contador++;
    }
}
