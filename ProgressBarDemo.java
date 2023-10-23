import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,100); // passing minimum and maximum value to our progress bar

    ProgressBarDemo() {

        bar.setValue(0);
        bar.setBounds(0,0,400,50);
        bar.setStringPainted(true);  // adds percentage to a progress bar
        bar.setFont(new Font("MV Boli",Font.BOLD,20));
        bar.setForeground(Color.blue);
        bar.setBackground(Color.black);

        frame.add(bar);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        fill(); // to create progress bar
    }
    public void fill() {
        int counter = 0;

        while (counter <= 100) {
            bar.setValue(counter);
            try {
                Thread.sleep(50); // simulates progress increase overtime
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter += 2;
    }
        bar.setString("Completed!");

    }



}
