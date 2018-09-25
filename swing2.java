import java.awt.GridLayout;
import javax.swing.*;

public class Ejer03 extends JFrame {

    private static final String[][] texts = {
        {"7", "8", "9", "+"},
        {"4", "5", "6", "-"},
        {"1", "2", "3", "*"},
        {"C", "0", "=", "/"}
    };

    private JButton[][] buttons = new JButton[4][4];

    public Ejer03() {
        setLocationRelativeTo(null);

        setLayout(new GridLayout(4, 4, 10, 10));
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                buttons[i][j] = new JButton(texts[i][j]);
                getContentPane().add(buttons[i][j]);
            }
        }

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejer03();
    }
}
