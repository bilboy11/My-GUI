import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

public abstract class MyFrameRadioButtons extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton shawarmaButton;
    JRadioButton burgerButton;
    MyFrameRadioButtons(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("pizza");
        shawarmaButton = new JRadioButton("shawarma");
        burgerButton = new JRadioButton("burger");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(shawarmaButton);
        group.add(burgerButton);

        pizzaButton.addActionListener(this);
        shawarmaButton.addActionListener(this);
        burgerButton.addActionListener(this);


        this.add(pizzaButton);
        this.add(shawarmaButton);
        this.add(burgerButton);
        this.pack();
        this.setVisible(true);
    }


}
