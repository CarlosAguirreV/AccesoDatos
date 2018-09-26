import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main extends JFrame {
    
    public static final int NUM_PANELS = 5;
    
    private CardLayout cardLayout;
    private JPanel panelCards;
    private JPanel panelBottom;
    
    private JPanel[] cards = new JPanel[NUM_PANELS];
    
    private JButton btnNext;
    private JButton btnFinish;
   
    private int cardIndex;
    
    public Main(){
        setLayout(new BorderLayout());
        
        panelCards = new JPanel();
        cardLayout = new CardLayout();
        panelCards.setLayout(cardLayout);
        
        for(int i = 0; i < cards.length; ++i){
            cards[i] = new JPanel();
            int c = (int) (Math.random()*256*256*256);
            Color color = new Color(c);
            cards[i].setBackground(color);
            panelCards.add(cards[i]);    
        }
        
        cardIndex = 0;
        
        panelBottom = new JPanel();
        panelBottom.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        
        btnNext = new JButton("Next");
        btnNext.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                next();
            }            
        });
        
        btnFinish = new JButton("Finish");
        btnFinish.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finish();
            }
        });
        
        panelBottom.add(btnNext);
        panelBottom.add(btnFinish);
        
        getContentPane().add(panelCards, BorderLayout.CENTER);
        getContentPane().add(panelBottom, BorderLayout.SOUTH);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);        
    }
    
    private void next(){
        cardLayout.next(panelCards);
        ++cardIndex;
        if(cardIndex == NUM_PANELS - 1){
            btnNext.setEnabled(false);
        }
    }
    
    private void finish(){
        dispose();
    }
    
    public static void main(String[] args) {
        new Main();
    }
}
