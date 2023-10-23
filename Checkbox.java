import java.awt.event.ActionEvent;

public class Checkbox {
    public static void main(String[] args) {

        // checkbox = a GUI component that can be selected or deselected

        new MyFrameCheckBox() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==button){
                    System.out.println(checkBox.isSelected());
                }
            }
        };


    }
}
