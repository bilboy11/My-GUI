import java.awt.event.ActionEvent;

public class Buttons {
    public static void main(String[] args) {

        // JButton = a button that performs an action when clicked on


        new MyFrameButtons() {


            @Override
            public void actionPerformed(ActionEvent e) {
                // System.out.println("yupp");
                // button.setEnabled(false); (clicking button once)
                label.setVisible(true);
            }
        };
    }
}
