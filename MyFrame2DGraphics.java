import javax.swing.*;
import java.awt.*;

public class MyFrame2DGraphics extends JFrame {
    MyPanel panel;

    MyFrame2DGraphics(){

        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }



}
