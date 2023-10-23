import javax.swing.*;

public class JOptionP{
    private static Object[] responses;

    public static void main(String[] args) {

        // JOptionPane = pop up standard dialogue box that prompts users for a value or informs them of something.

      //javax.swing.JOptionPane.showInternalMessageDialog(null, "Attention Needed", "title", javax.swing.JOptionPane.PLAIN_MESSAGE);
     // javax.swing.JOptionPane.showInternalMessageDialog(null, "Attention Needed", "title", JOptionPane.INFORMATION_MESSAGE);
    //javax.swing.JOptionPane.showInternalMessageDialog(null, "Attention Needed", "title", JOptionPane.QUESTION_MESSAGE);
    //javax.swing.JOptionPane.showInternalMessageDialog(null, "Attention Needed", "title", JOptionPane.WARNING_MESSAGE);
   // javax.swing.JOptionPane.showInternalMessageDialog(null, "Attention Needed", "title", JOptionPane.ERROR_MESSAGE);

       // int answer = JOptionPane.showConfirmDialog(null, "do you even code?", "my title", JOptionPane.YES_NO_OPTION);
        // String name = JOptionPane.showInputDialog("HEYY BILAL!");

        String[] responses = {"smiles", "thanks", "blush"};
        ImageIcon icon = new ImageIcon("hacker.png");
        
        JOptionPane.showOptionDialog(null, 
                "You're awesome!",
                "Anonymous", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                icon, 
                responses, 
                0);


}
}
