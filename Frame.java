import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;

public class Frame {
    public static void main(String[] args) {
        // FRAME
        // JFrame = a GUI window to add components to

        JFrame frame = new JFrame();
        frame.setTitle("Demo App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true); //make frame visible

        ImageIcon Image = new ImageIcon("JR logo.jpg");
        frame.setIconImage(Image.getImage()); // changing icon of frame
        frame.getContentPane().setBackground(new Color(180,120,250));

    }
}
