import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

public abstract class MyFrameColorChooser extends JFrame implements ActionListener {

   JButton button;
   JLabel label;

    MyFrameColorChooser() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Choose a color");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("This is some text :D");
        label.setFont(new Font("MV Boli",Font.PLAIN,60));
        label.setOpaque(true); // to display background color

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

}
