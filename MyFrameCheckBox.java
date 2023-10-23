import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

public abstract class MyFrameCheckBox extends JFrame implements ActionListener {


   JButton button;
   JCheckBox checkBox;
   //ImageIcon xIcon;
   //ImageIcon checkIcon;
    MyFrameCheckBox(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

       // xIcon = new ImageIcon("iconname");
        // checkIcon = new ImageIcon("iconname");

        button = new JButton();
        button.setText("submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.PLAIN,30));
       // checkBox.setIcon(xIcon);
       // checkBox.setSelectedIcon(CheckIcon);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }


}
