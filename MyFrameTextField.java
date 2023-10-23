import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

public abstract class MyFrameTextField extends JFrame implements ActionListener {

   JButton button;
   JTextField textField;

    MyFrameTextField() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.ITALIC,30));
        textField.setForeground(Color.blue);
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);
        textField.setText("username");


        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }
}
