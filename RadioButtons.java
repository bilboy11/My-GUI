import java.awt.event.ActionEvent;

public class RadioButtons {
    public static void main(String[] args) {

        // Radio Button = one or more buttons in a grouping in which only 1 may be selected per group

        new MyFrameRadioButtons() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==pizzaButton){
                    System.out.println("You ordered Pizza!");
                } else if (e.getSource()==shawarmaButton) {
                    System.out.println("You prdered Shawarma!");
                } else if (e.getSource()==burgerButton) {
                    System.out.println("You ordered Burger!");

                }
            }
        };

    }
}
