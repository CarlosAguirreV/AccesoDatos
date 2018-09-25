import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class Ejer05 extends JFrame {

    private final int NUM_BUTTONS_WEST = 3;
    private final int NUM_BUTTONS_EAST = 3;
    private final int NUM_BUTTONS_BOTTOM = 2;
    private Color colorWest = Color.RED;
    private Color colorEast = Color.BLUE;
    private Color colorBottom = Color.GREEN;

    private JPanel pnlTop, pnlWest, pnlEast, pnlBottom;
    private JButton[] buttonsWest = new JButton[NUM_BUTTONS_WEST];
    private JButton[] buttonsEast = new JButton[NUM_BUTTONS_EAST];
    private JButton btnAccept, btnCancel;

    private JTextArea taCenter;
    
    Ejer05() {
        setLocationRelativeTo(null);

        pnlTop = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        pnlTop.add(new JLabel("Demostración por INFORUX"));
        
        

        pnlWest = new JPanel();
        pnlWest.setLayout(new BoxLayout(pnlWest, BoxLayout.Y_AXIS));
        pnlWest.setBackground(colorWest);
        for (int i = 0; i < NUM_BUTTONS_WEST; ++i) {
            buttonsWest[i] = new JButton(String.format("Izq%d", i+1));
            pnlWest.add(buttonsWest[i]);
        }
        
        pnlEast = new JPanel();
        pnlEast.setLayout(new BoxLayout(pnlEast, BoxLayout.Y_AXIS));
        pnlEast.setBackground(colorEast);
        for (int i = 0; i < NUM_BUTTONS_EAST; ++i) {
            buttonsEast[i] = new JButton(String.format("Der%d", i+1));
            pnlEast.add(buttonsEast[i]);
        }

        btnAccept = new JButton("Aceptar");
        btnCancel = new JButton("Cancel");
        pnlBottom = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        pnlBottom.setBackground(colorBottom);
        pnlBottom.add(btnAccept);
        pnlBottom.add(btnCancel);
        
        setLayout(new BorderLayout());
        getContentPane().add(pnlTop, BorderLayout.NORTH);
        getContentPane().add(pnlWest, BorderLayout.WEST);
        getContentPane().add(pnlEast, BorderLayout.EAST);
        getContentPane().add(pnlBottom, BorderLayout.SOUTH);
        getContentPane().add(new JTextArea("JTextArea"), BorderLayout.CENTER);
        
        GraphicsDevice gd = GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(width/4, height/3);
//        pack();
        setVisible(true);

    }

    public static void main(String[] args) {
        new Ejer05();
    }

}
