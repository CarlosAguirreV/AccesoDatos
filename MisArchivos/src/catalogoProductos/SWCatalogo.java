package catalogoProductos;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class SWCatalogo extends JFrame{
    
    private JPanel jpSur, jpCentro;
    private JButton btnSiguiente, btnFinalizar;
    private CardLayout distribucionCarta;
    private JLabel[] coleccionLabel = new JLabel[15];
    private JPanel[] coleccionPaneles = new JPanel[5];

    private byte contador;
    
    private SWCatalogo(){
        this.inicializarElementos();
        this.definirTextoElementos();
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
        
        this.btnSiguiente = new JButton();
        this.btnFinalizar = new JButton();
        this.distribucionCarta = new CardLayout();
        this.contador = 0;
        
        for(int i = 0; i < coleccionPaneles.length; i++){
            this.coleccionPaneles[i] = new JPanel();
            
            this.coleccionPaneles[i].add(new JLabel("FOTO" + i)); // AQUI HAY QUE PONER LA IMAGEN
            this.coleccionPaneles[i].add(new JLabel("Descripcion: " + "DESCRIPCION"));
            this.coleccionPaneles[i].add(new JLabel("Precio: " + "PRECIO"));
            
            this.coleccionPaneles[i].setLayout(new BoxLayout(this.coleccionPaneles[i], BoxLayout.Y_AXIS));
            
            this.jpCentro.add(this.coleccionPaneles[i], "carta" + Integer.toString(i));
            System.out.println(i);
        }
    }
    
    private void definirTextoElementos(){
        this.btnSiguiente.setText("Siguiente");
        this.btnFinalizar.setText("Finalizar");
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
            case 0: this.distribucionCarta.show(jpCentro, "carta0"); break;
            case 1: this.distribucionCarta.show(jpCentro, "carta1"); break;
            case 2: this.distribucionCarta.show(jpCentro, "carta2"); break;
            case 3: this.distribucionCarta.show(jpCentro, "carta3"); break;
            case 4: this.distribucionCarta.show(jpCentro, "carta4"); break;
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
        new SWCatalogo();
    }
}