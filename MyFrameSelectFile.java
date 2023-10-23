import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

public abstract class MyFrameSelectFile extends JFrame implements ActionListener {

    JButton button;
    MyFrameSelectFile(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }
}
