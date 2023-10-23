import javax.swing.*;
import  javax.swing.ImageIcon;
import java.awt.*;

public class Panels {
    public static void main(String[] args) {


        // JPanel = a GUI component that functions as a container to hold other components
        ImageIcon icon = new ImageIcon("thumb.jpg");

        JLabel label = new JLabel();
        label.setText("Hello.!");
        label.setIcon(icon);

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0, 0, 250, 250);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250, 0, 250, 250);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0, 250, 500, 250);


        JFrame frame = new JFrame();
        frame.setTitle("Demo App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setVisible(true);
        greenpanel.add(label); // adding imageicon to the red panel
        frame.add(redpanel); // adds panel to the frame
        frame.add(bluepanel);
        frame.add(greenpanel);

    }
}
