import java.awt.event.ActionEvent;

public class MenuBar {
    public static void main(String[] args) {

        new MyFrameMenuBar() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==loadItem) {
                    System.out.println("file loaded");
                }
                if (e.getSource()==saveItem) {
                    System.out.println("file saved");
                }
                if (e.getSource()==exitItem) {
                    System.exit(0);
                }
            }
        };
    }
}
