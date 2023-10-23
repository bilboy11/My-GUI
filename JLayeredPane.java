import javax.swing.*;
import java.awt.*;

public class JLayeredPane {
    public static void main(String[] args) {

        // JLayeredPane = is a swing container that provides a third dimension for positioning components.
        //                Ex:- depth, Z-index.

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.black);
        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.blue);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.yellow);
        label3.setBounds(150,150,200,200);
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("JLayeredPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.setVisible(true);


    }
}
