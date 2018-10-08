package catalogoProductos;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class SWCatalogo extends JFrame {

    private JPanel jpSur, jpCentro;
    private JButton btnSiguiente, btnFinalizar;
    private CardLayout distribucionCarta;
    private JPanel[] coleccionPaneles;
    private ArrayList<Articulo> coleccionArticulos;

    private byte contador;

    private SWCatalogo(File archivo) throws IOException {
        this.cargarProductos(archivo);
        
        if (this.coleccionArticulos.size() > 0) {
            this.inicializarElementos();

            this.definirTextoElementos();
            this.definirEstiloElementos();
            this.establecerDistribucion();
            this.aniadirElementos();
            this.auxAniadirElementos(); // Crea los elementos y los aniade de forma eficaz.

            this.eventos();

            this.setTitle("Catalogo");
            this.definirTamanioVentana(30, 20);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.setVisible(true);
        } else {
            System.out.println("No hay articulos que mostrar");
        }
    }
    
    private void cargarProductos(File archivo) throws FileNotFoundException, IOException {
        this.coleccionArticulos = new ArrayList<Articulo>();
        
        FileInputStream lector = new FileInputStream(archivo);
        ObjectInputStream lectorObjetos = new ObjectInputStream(lector);
        
        try {
            while (true) {
                this.coleccionArticulos.add((Articulo) lectorObjetos.readObject());
            }
        } catch (Exception ex) {}
        
        lectorObjetos.close();
        
        System.out.println("Hay un total de " + this.coleccionArticulos.size() + " articulos.");
    }

    private void inicializarElementos() {
        this.jpSur = new JPanel();
        this.jpCentro = new JPanel();

        coleccionPaneles = new JPanel[this.coleccionArticulos.size()];

        this.btnSiguiente = new JButton();
        this.btnFinalizar = new JButton();
        this.distribucionCarta = new CardLayout();
        this.contador = 0;
    }

    private void definirTextoElementos() {
        this.btnSiguiente.setText("Siguiente");
        this.btnFinalizar.setText("Finalizar");
    }

    private void definirEstiloElementos() {
        this.jpSur.setBackground(Color.lightGray);
    }

    private void establecerDistribucion() {
        this.getContentPane().setLayout(new BorderLayout());
        this.jpSur.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.jpCentro.setLayout(this.distribucionCarta);
    }

    private void aniadirElementos() {
        this.getContentPane().add(this.jpSur, BorderLayout.SOUTH);
        this.getContentPane().add(this.jpCentro, BorderLayout.CENTER);
        this.jpSur.add(this.btnSiguiente);
        this.jpSur.add(this.btnFinalizar);
    }

    private void auxAniadirElementos() {
        for (int i = 0; i < coleccionArticulos.size(); i++) {
            JPanel panelTemporal = new JPanel();
            this.coleccionPaneles[i] = panelTemporal;

            Articulo articuloTemporal = this.coleccionArticulos.get(i);

            panelTemporal.add(new JLabel("Foto: " + articuloTemporal.getNombreFoto())); // AQUI HAY QUE PONER LA IMAGEN
            panelTemporal.add(new JLabel("Descripcion: " + articuloTemporal.getDescripcion()));
            panelTemporal.add(new JLabel("Precio: " + articuloTemporal.getPrecio().toString()));

            panelTemporal.setLayout(new GridLayout(3, 1, 5, 5));

            this.jpCentro.add(panelTemporal, "c" + Integer.toString(i));
        }
    }

    private void eventos() {
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

    private void cambiarPanel() {
        this.contador++;

        this.distribucionCarta.show(this.jpCentro, "c" + Integer.toString(this.contador));
        if (this.contador >= this.coleccionArticulos.size() - 1) {
            this.btnSiguiente.setEnabled(false);
        }
    }

    private void definirTamanioVentana(double porcAlto, double porcAncho) {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

        double altoFinal = pantalla.height * (porcAlto / 100);
        double anchoFinal = pantalla.width * (porcAncho / 100);

        this.setSize(new Dimension((int) anchoFinal, (int) altoFinal));
    }

    public static void main(String[] args) throws IOException {
        String[] nombreFotos = {"foto zapato", "foto camisa", "foto pantalon", "foto calcetines", "foto bufanda", "gersey"};
        String[] descripciones = {"Bonito y elegante complemento para sus pies", "Camisa de manga corta", "Hecho de pana, no lo mojes", "Con dibujos de los Minions", "Todo algodon", "Da mucho calor"};
        BigDecimal[] precios = {new BigDecimal("23.4"), new BigDecimal("15"), new BigDecimal("35.7"), new BigDecimal("7"), new BigDecimal("12"), new BigDecimal("30")};

        File archivo = new File("./productos.bin");

        FileOutputStream escritor = new FileOutputStream(archivo);
        ObjectOutputStream escritorObjetos = new ObjectOutputStream(escritor);

        for (int i = 0; i < nombreFotos.length; i++) {
            Articulo articuloTemporal = new Articulo(nombreFotos[i], descripciones[i], precios[i]);
            escritorObjetos.writeObject(articuloTemporal);
        }

        escritorObjetos.close();

        new SWCatalogo(archivo);
    }
}
