import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {
    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    Game() {

        frame = new JFrame("KeyBinding demo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.black);
        label.setBounds(100,100,100,100);
        label.setOpaque(true);

        upAction = new UpAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setLocation(label.getX(), label.getY()-10);

            }
        };
        downAction = new DownAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setLocation(label.getX(), label.getY()+10);

            }
        };
        leftAction = new LeftAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setLocation(label.getX()-10, label.getY());

            }
        };
        rightAction = new RightAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setLocation(label.getX()+10, label.getY());

            }
        };

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        label.getActionMap().put("upAction", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        label.getActionMap().put("downAction", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        label.getActionMap().put("leftAction", leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        label.getActionMap().put("rightAction", rightAction);

        frame.add(label);
        frame.setVisible(true);

        }



    }

    abstract class UpAction extends AbstractAction{

    }

    abstract class DownAction extends AbstractAction{

    }

    abstract class LeftAction extends AbstractAction{

    }

    abstract class RightAction extends AbstractAction{

    }
