import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;

public class Ejer04 extends JFrame {

    private final int NUM_BUTTONS = 2;
    private final int NUM_LABELS = 3;
    private final int NUM_ROWS = 3;
    private final int NUM_COLS = 3;

    private JPanel pnlTop, pnlWest, pnlCenter;
    private JButton[] buttonsTop = new JButton[NUM_BUTTONS];
    private JLabel[] labelsWest = new JLabel[NUM_LABELS];
    private ArrayList<JComboBox<String>> combosCenter = new ArrayList<JComboBox<String>>();

    private String[] itemsComboBox = {"Uno", "Dos", "Tres"};

    Ejer04() {
        setLocationRelativeTo(null);

        pnlTop = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        for (int i = 0; i < NUM_BUTTONS; ++i) {
            buttonsTop[i] = new JButton(String.format("Button nº %d", i));
            pnlTop.add(buttonsTop[i]);
        }

        pnlWest = new JPanel();
        pnlWest.setLayout(new BoxLayout(pnlWest, BoxLayout.Y_AXIS));
        for (int i = 0; i < NUM_LABELS; ++i) {
            labelsWest[i] = new JLabel(String.format("Label nº %d", i));
            pnlWest.add(labelsWest[i]);
        }

        pnlCenter = new JPanel(new GridLayout(NUM_ROWS, NUM_COLS, 10, 10));
        for (int i = 0; i < NUM_ROWS; ++i) {
            for (int j = 0; j < NUM_COLS; ++j) {
                JComboBox<String> combo = new JComboBox(itemsComboBox);
                combosCenter.add(combo);
                pnlCenter.add(combo);
            }
        }

        setLayout(new BorderLayout());
        getContentPane().add(pnlTop, BorderLayout.NORTH);
        getContentPane().add(pnlWest, BorderLayout.WEST);
        getContentPane().add(pnlCenter, BorderLayout.CENTER);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }

    public static void main(String[] args) {
        new Ejer04();
    }
}
