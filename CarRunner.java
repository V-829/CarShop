//package CarShop;

import javax.swing.*;
import java.awt.*;

public class CarRunner extends JPanel {
     protected void paintComponent(Graphics g)
    {
        //clear canvas
        super.paintComponent(g);


        //create text
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        g2.drawString("text", 20, 50);
    }
    public static void main (String[]args){
        Ferrari rari = new Ferrari("VROOOM", "Ferrari");
        System.out.println(rari.getType() + " goes " + rari.getSound());
        

        SwingUtilities.invokeLater(()->{
            JFrame frame = new JFrame("List of Cars");
            CarRunner panel = new CarRunner();


            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800,600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });

    }
}
