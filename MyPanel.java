import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

  // Image image;
    MyPanel(){

      //  image = new ImageIcon("fcb.png").getImage();
        this.setPreferredSize(new Dimension(400,400));

    }

    public void paint(Graphics g) {

        Graphics2D  g2D = (Graphics2D) g;

       // g2D.drawImage(image,0,0,null);

        //g2D.setPaint(Color.blue);
        // g2D.setStroke(new BasicStroke(5));
        // g2D.drawLine(0,0,400,400);

       // g2D.setPaint(Color.yellow);
        // g2D.drawRect(0,0,100,200);
        // g2D.fillRect(0,0,100,200);

       // g2D.setPaint(Color.pink);
       // g2D.drawOval(0,0,100,200);

       // g2D.setPaint(Color.red);
        //g2D.drawArc(0,0,100,100,0,180);
        //g2D.fillArc(0,0,100,100,0,180);
        //g2D.setPaint(Color.black);
        //g2D.fillArc(0,0,100,100,180,180);

        //int[] xPoints = {150,250,350};
        //int[] yPoints = {300,150,300};
        //g2D.setPaint(Color.cyan);
        // g2D.drawPolygon(xPoints,yPoints,3);
        //g2D.fillPolygon(xPoints,yPoints,3);

        // g2D.setPaint(Color.pink);
        // g2D.setFont(new Font("Ink Free",Font.BOLD,50));
        // g2D.drawString("BILBOY JR",100,100);

    }
}
