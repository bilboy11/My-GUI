import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public abstract class MyPanel2dA extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 400;
    final int PANEL_HEIGHT = 400;
    Image good;
   // Image backgroundImage;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPanel2dA(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
        good = new ImageIcon("good.jpg").getImage();
        timer = new Timer(10,this);
        timer.start();

    }
    public void paint(Graphics g) {

        super.paint(g); // this will paint background

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(good, x, y,null);
    }
}
