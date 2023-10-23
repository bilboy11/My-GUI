import javax.swing.*;
import java.awt.event.ActionEvent;

public class MyFrame2DAnimations extends JFrame {

    MyPanel2dA panel;

    MyFrame2DAnimations(){

        panel = new MyPanel2dA() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (x >= PANEL_WIDTH-good.getWidth(null) || x < 0) {
                    xVelocity = xVelocity * -1;
                }
                x = x + xVelocity;

                if (y >= PANEL_HEIGHT-good.getHeight(null) || y < 0) {
                    yVelocity = yVelocity * -1;
                }
                x = x + xVelocity;
                repaint();

            }
        };


    }
}
