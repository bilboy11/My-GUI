import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import javax.swing.border.Border;

public class Label {
    public static void main(String[] args) {
        // JLabel = a GUI display area for a string of text, an image or both

        ImageIcon image = new ImageIcon("fcb.jpg");
        Border border = BorderFactory.createLineBorder(Color.WHITE,3);

        JLabel label = new JLabel();
        label.setText("I am a Barcelona fan!");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER,RIGHT of ImageIcon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP,CENTER,BOTTOM of ImageIcon
        label.setForeground(Color.BLUE); // set font color of text
        label.setFont(new Font("MV Boli",Font.ITALIC,30)); // set font of text
        label.setIconTextGap(20); // set gap of text to image
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalTextPosition(JLabel.CENTER);
       // label.setBounds(50,50,300,300); //set x,y position within frame as well a dimensions


        JFrame frame = new JFrame();
        frame.setTitle("Demo App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(400,400);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); // resize the size of a frame to accommodate(fit) all components inside
    }
}
