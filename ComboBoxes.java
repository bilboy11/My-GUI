import javax.swing.*;
import java.awt.event.ActionEvent;

public class ComboBoxes {
    public static void main(String[] args) {
        // JComboBoxes = A component that combines a button or editable field and a drop-down list

        new MyFrameComboBoxes() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()== comboBox){
                    //System.out.println(comboBox.getSelectedItem());
                    System.out.println(comboBox.getSelectedIndex());
                }
            }
        };
    }
}
