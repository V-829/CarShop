//package CarShop;

import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;

public class CarRunner extends JPanel {
    private static boolean check =false ;
     protected void paintComponent(Graphics g)
    {
        //clear canvas
        super.paintComponent(g);
        //Create a CarList Object
        CarList list = new CarList();
        //create text
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      
        //Creates text if the condition is true
        if(check){
        g2.drawString(list.carSounds(), 20, 250);
        
        }
    }
    public static void main (String[]args){
        

        SwingUtilities.invokeLater(()->{
            JFrame frame = new JFrame("List of Cars");
            CarRunner panel = new CarRunner();
            JButton button = new JButton("Click to know certain car noises");
            button.addActionListener(e -> {
                //Makes the condition true, allowing the
                //frame to print out the text while
                //jhiding the button
                check = true;
                button.setVisible(false);
                frame.repaint();
            });
            frame.add(button);
            frame.setSize(200,200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1100,600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });

    }
}
