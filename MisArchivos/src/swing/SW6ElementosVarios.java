package swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class SW6ElementosVarios extends JFrame {

    private JPanel pnlGlobal;
    private JLabel lbl1, lbl2, lbl3;
    private JComboBox cmbPrueba;
    private JCheckBox chkPrueba;
    private JRadioButton rdbPrueba1, rdbPrueba2, rdbPrueba3;
    private ButtonGroup grupoRadioBotones;
    private DefaultComboBoxModel cmbModelo;
    private JButton btnAceptar;

    public SW6ElementosVarios() {
        this.crearElementos();
        this.crearDistribucion();
        this.aniadirElementos();
        this.eventos();

        // Propiedades de la ventana.
        this.setSize(300, 400);
        this.setTitle("Pruebas a tutiplen");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void crearElementos() {
        this.pnlGlobal = new JPanel();
        this.lbl1 = new JLabel("Ejemplo JComboBox");
        this.cmbPrueba = new JComboBox<String>();
        this.cmbModelo = new DefaultComboBoxModel<Object>();

        this.lbl2 = new JLabel("Ejemplo JCheckBox");
        this.chkPrueba = new JCheckBox("Palometeame");

        this.lbl3 = new JLabel("Ejemplo JRadioButton");
        this.grupoRadioBotones = new ButtonGroup();
        this.rdbPrueba1 = new JRadioButton("Rojo");
        this.rdbPrueba2 = new JRadioButton("Verde");
        this.rdbPrueba3 = new JRadioButton("Azul");

        this.btnAceptar = new JButton("Aceptar");
    }

    private void crearDistribucion() {
        this.pnlGlobal.setLayout(new GridLayout(11, 1));
    }

    private void aniadirElementos() {
        // Modelos
        this.cmbModelo.addElement("Manzana");
        this.cmbModelo.addElement("Sandias");
        this.cmbModelo.addElement("Cerezas");
        this.cmbPrueba.setModel(this.cmbModelo);

        // Grupos
        this.grupoRadioBotones.add(rdbPrueba1);
        this.grupoRadioBotones.add(rdbPrueba2);
        this.grupoRadioBotones.add(rdbPrueba3);
//        this.rdbPrueba1.setSelected(true);

        // Paneles
        this.getContentPane().add(this.pnlGlobal);

        this.pnlGlobal.add(this.lbl1);
        this.pnlGlobal.add(this.cmbPrueba);

        this.pnlGlobal.add(new JPanel());

        this.pnlGlobal.add(this.lbl2);
        this.pnlGlobal.add(this.chkPrueba);

        this.pnlGlobal.add(new JPanel());

        this.pnlGlobal.add(this.lbl3);
        this.pnlGlobal.add(this.rdbPrueba1);
        this.pnlGlobal.add(this.rdbPrueba2);
        this.pnlGlobal.add(this.rdbPrueba3);

        this.pnlGlobal.add(this.btnAceptar);
    }

    private String getRBTNSeleccionado() {
        Enumeration BOTON = this.grupoRadioBotones.getElements();
        while (BOTON.hasMoreElements()) {
            JRadioButton rbtn = (JRadioButton) BOTON.nextElement();
            if (rbtn.isSelected()) {
                return rbtn.getText();
            }
        }
        return "Ninguno";
    }

    private void eventos() {
        this.btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(SW6ElementosVarios.this, "\nCuadro seleccion: " + cmbPrueba.getSelectedItem() + "\nPalometeado: " + chkPrueba.isSelected() + "\nMarcado: " + getRBTNSeleccionado());
            }
        });
    }

    public static void main(String[] args) {
        new SW6ElementosVarios();
    }
}
