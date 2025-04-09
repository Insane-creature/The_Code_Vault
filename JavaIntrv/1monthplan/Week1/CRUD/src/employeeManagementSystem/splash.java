package src.employeeManagementSystem;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;      // For framing first page
import javax.swing.JLabel;

public class splash extends JFrame{
    
    splash(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("src/icons/front.gif"));
        // framing image in size of frame
        Image i2 = i1.getImage().getScaledInstance(1170, 650 , Image.SCALE_DEFAULT);     // Defining the  scaling
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1170, 650);
        add(image);

        setSize(1170, 650); // Frame size
        setLocation(200, 50);
        setLayout(null); // layout
        setVisible(true);       // reflect the screen

        try {
            Thread.sleep(5000);
            setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
         
    }

    public static void main(String[] args) {
        new splash();
        System.out.println("hello"); 
    }
}
