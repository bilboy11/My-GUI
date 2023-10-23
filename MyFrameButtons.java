import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public abstract class MyFrameButtons extends JFrame implements ActionListener {

     JButton button;
     JLabel label;
     MyFrameButtons(){

          ImageIcon icon = new ImageIcon("th.jpg");
          ImageIcon icon2 = new ImageIcon("fcb.jpg");


          label = new JLabel();
          label.setIcon(icon2);
          label.setBounds(150, 250, 150, 150);
          label.setVisible(false);


          button = new JButton();
          button.setBounds(50, 50, 250, 250);
          button.addActionListener(this);
          button.setText("button");
          button.setFocusable(false);
          button.setIcon(icon);
          button.setHorizontalTextPosition(JButton.CENTER);
          button.setVerticalTextPosition(JButton.BOTTOM);
          button.setFont(new Font("Comic sans",Font.BOLD,25));
          button.setIconTextGap(10);
          button.setForeground(Color.black);
          button.setBackground(Color.darkGray);
          button.setBorder(BorderFactory.createEtchedBorder());


          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setLayout(null);
          this.setSize(500,500);
          this.setVisible(true);
          this.add(button);
          this.add(label);

     }
}
