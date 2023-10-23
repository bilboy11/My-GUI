import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public abstract class MyFrameMenuBar extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
   /* ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon; */

    MyFrameMenuBar() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setLayout(new FlowLayout());

      /*  loadIcon = new ImageIcon("iconname");
        saveIcon = new ImageIcon("iconname");
        exitIcon = new ImageIcon("iconname"); */

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

       /* loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon); */

        //setting keyboard shortcut for menuItems and Menus
        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f for File
        editMenu.setMnemonic(KeyEvent.VK_E); // Alt + f for Edit
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + f for Help
        loadItem.setMnemonic(KeyEvent.VK_L); // l for load
        saveItem.setMnemonic(KeyEvent.VK_S); // s for save
        exitItem.setMnemonic(KeyEvent.VK_E); // e for exit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);


        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

}
