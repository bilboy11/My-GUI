import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

public abstract class MyFrameComboBoxes extends JFrame implements ActionListener {

    JComboBox comboBox;
    MyFrameComboBoxes(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "lion"};
       // Integer[] number = {1,2,3,4,5}; // uses wrapper classes to store primitive data types in an array

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        // comboBox.setEditable(true); // allows to type-in anything
        // System.out.println(comboBox.getItemCount()); // prints the amount of items
       // comboBox.addItem("tiger"); // to add item
        // comboBox.insertItemAt("cow",2);
        // comboBox.setSelectedIndex(2);
       // comboBox.removeItem("lion");
       // comboBox.removeItemAt(1);
       // comboBox.removeAll();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

}
