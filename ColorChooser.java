import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ColorChooser {
    public static void main(String[] args) {
        // JColorChooser = A GUI mechanism that lets a user choose a color

        new MyFrameColorChooser() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==button) {
                    JColorChooser colorChooser = new JColorChooser();

                    Color color =JColorChooser.showDialog(null, "Choose a color....maybe", Color.BLACK);

                    // label.setForeground(color); // to change text color
                    label.setBackground(color); // to change background color
                }

            }
        };


    }
}
