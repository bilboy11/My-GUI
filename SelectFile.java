import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;

public class SelectFile {
    public static void main(String[] args) {
        // JFileChooser = A GUI mechanism that lets a user choose a file (helpful for opening or saving files)

        new MyFrameSelectFile() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == button) {

                    JFileChooser fileChooser = new JFileChooser();

                    fileChooser.setCurrentDirectory(new File(".")); //

                   // int response = fileChooser.showOpenDialog(null); // select file to open
                    int response = fileChooser.showSaveDialog(null); // select file to save

                    if (response == JFileChooser.APPROVE_OPTION) {
                        File file = new File(String.valueOf(fileChooser.getSelectedFile().getAbsoluteFile()));
                        System.out.println(file);
                    }
                }
            }
        };
    }
}
