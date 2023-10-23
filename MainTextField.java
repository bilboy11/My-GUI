import javax.swing.*;
import java.awt.event.ActionEvent;

public class MainTextField {
    public static void main(String[] args) {

        // JTextField = A GUI textbox component that can be used to add, set or get text.

        MyFrameTextField frame = new MyFrameTextField() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==button) {
                    System.out.println("Welcome" + " " + textField.getText());
                    button.setEnabled(false);
                    textField.setEditable(false);
                }
            }
        };


    }

}
