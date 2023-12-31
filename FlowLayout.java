import javax.swing.*;
import java.awt.*;

public class FlowLayout {
    public static void main(String[] args) {

        // Flow Layout = places components in a row, sized at their preferred sizes.
        //               if the horizontal space in d container is too small, d FlowLayout class uses d next available row.


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER,10,10));


        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200,250));
        panel.setBackground(Color.cyan);
        panel.setLayout(new java.awt.FlowLayout());
        
        
        panel.add(new JButton("1")); // this will create a new button
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));


        frame.add(panel);
        frame.setVisible(true);






    }


}
