/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswing4;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.util.List;
import java.util.ArrayList;
import static javax.swing.BoxLayout.Y_AXIS;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.*;

/**
 *
 * @author alex
 */
public class EjercicioSwing4 extends JFrame{

    private JPanel pnlNorte,pnlCentro,pnlSur,pnlEste,pnlOeste;
    private JButton btnIzq1,btnIzq2,btnIzq3,btnDrcha1,btnDrcha2,btnDrcha3,btnAceptar,btnCancelar;
    private JLabel lblDemo;
    private JTextArea txtArea;
    
    
    /**
     * CONSTRUCTOR
     */
    public EjercicioSwing4()
    {
        super("Demo BorderLayout");
        
        // Saco el Layout de la ventana y le hago un cast para convertirlo en panel
        // La distribución principal de la ventana será de BorderLayout
        JPanel contenidoVentana = (JPanel)this.getContentPane();
        contenidoVentana.setLayout(new BorderLayout());
        
        // Crea las componentes
        crearComponentes();
        
        // Ordena todos los componentes y los coloca en su sitio
        ordenar();
        
        // Introduce los paneles en la ventana
        contenidoVentana.add(pnlSur,BorderLayout.SOUTH);
        contenidoVentana.add(pnlCentro,BorderLayout.CENTER);
        contenidoVentana.add(pnlNorte,BorderLayout.NORTH);
        contenidoVentana.add(pnlEste,BorderLayout.EAST);
        contenidoVentana.add(pnlOeste,BorderLayout.WEST);
        
        // Edito la configuración de la pantalla
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(d.width/2 - getWidth()/2, d.height/2 - getHeight()/2);
    }
    
    /**
     * Creo las componentes de la ventana
     */
    private void crearComponentes()
    {
        // PANELES
        pnlNorte = new JPanel();
        pnlSur = new JPanel();
        pnlEste = new JPanel();
        pnlOeste = new JPanel();
        pnlCentro = new JPanel();
        
        // BOTONES
        btnIzq1 = new JButton("Izq1");
        btnIzq2 = new JButton("Izq2");
        btnIzq3 = new JButton("Izq3");
        
        btnDrcha1 = new JButton("Der1");
        btnDrcha2 = new JButton("Der2");
        btnDrcha3 = new JButton("Der3");
        
        btnAceptar = new JButton("Aceptar");
        btnCancelar = new JButton("Cancelar");
        
        // ETIQUETA
        lblDemo = new JLabel("Demostraction por INFORUX");
        lblDemo.setFont(new Font("Arial",Font.BOLD,20));
        
        // JTEXTAREA
        txtArea = new JTextArea("JTextArea",10,15);
    }
    
    /**
     * Ordena los componentes ...
     * ...
     */
    private void ordenar()
    {
        // PANEL SUR
        pnlSur.setLayout(new FlowLayout());
        pnlSur.setBackground(Color.GREEN);
        pnlSur.setOpaque(true);
        pnlSur.add(btnAceptar);
        pnlSur.add(btnCancelar);
        
        // PANEL CENTRAL
        pnlCentro.add(txtArea);
        
        // PANEL NORTE
        pnlNorte.add(lblDemo);
        pnlNorte.setBackground(Color.WHITE);
        pnlNorte.setOpaque(true);
        
        // PANEL ESTE
        pnlEste.setLayout(new BoxLayout(pnlEste,Y_AXIS));
        pnlEste.setBackground(Color.BLUE);
        pnlEste.setOpaque(true);
        pnlEste.add(btnDrcha1);
        pnlEste.add(btnDrcha2);
        pnlEste.add(btnDrcha3);
        
        // PANEL OESTE
        pnlOeste.setLayout(new BoxLayout(pnlOeste,Y_AXIS));
        pnlOeste.setBackground(Color.RED);
        pnlOeste.setOpaque(true);
        pnlOeste.add(btnIzq1);
        pnlOeste.add(btnIzq2);
        pnlOeste.add(btnIzq3);
    }
}
