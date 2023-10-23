import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyFrameMouseListener extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon good;
    ImageIcon th;
    ImageIcon thumb;
    ImageIcon fcb;

     MyFrameMouseListener() {
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         this.setSize(500,500);
         this.setLayout(new FlowLayout());

         label = new JLabel();
         label.addMouseListener(this);

        good = new ImageIcon("good.jpg");
        th = new ImageIcon("th.jpg");
        thumb = new ImageIcon("thumb.jpg");
        fcb = new ImageIcon("fcb.jpg");

        label.setIcon(good);

         this.add(label);
         this.pack();
         this.setLocationRelativeTo(null); // it makes the frame to appear in the middle of the computer screen
         this.setVisible(true);
     }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Involved when the mouse button has been clicked (pressed and released) on a component
        System.out.println("You Clicked the mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {
         // Involved when a mouse button has been pressed on a component
        System.out.println("You Pressed the mouse");
        label.setIcon(thumb);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
         // Involved when a mouse button has been released on a component
        System.out.println("You Released the mouse");
        label.setIcon(fcb);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
         // Involved when the mouse enters a component
        System.out.println("You Entered the component");
        label.setIcon(good);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Involved when the mouse exits a component
        System.out.println("You Exited the component");
        label.setIcon(th);

    }
}
