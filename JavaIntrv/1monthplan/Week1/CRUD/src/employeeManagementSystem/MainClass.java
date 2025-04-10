package src.employeeManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MainClass extends JFrame implements ActionListener {

    JButton AddEmployee, ViewEmployee, RemoveEmployee;

    public MainClass(){


        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("src/icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance( 1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,  0,  1120, 630);
        add(img);

        JLabel heading = new JLabel("Employee Management system");
        heading.setBounds(340, 155, 400,40);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        img.add(heading);

        // AddEmployee = new JButton("Add Employee");
        // AddEmployee.setBounds(150, 140, 150, 30);
        // AddEmployee.addActionListener(this);
        // AddEmployee.setBackground(Color.black);
        // img.add(AddEmployee);

        AddEmployee = new JButton("Add Employee");
        AddEmployee.setBounds(20, 20, 150, 30);
        AddEmployee.addActionListener(this);
        AddEmployee.setBackground(Color.black);
        AddEmployee.setForeground(Color.white);
        img.add(AddEmployee);

        // AddEmployee = new JButton("Add Employee");
        // AddEmployee.setBounds(150, 140, 150, 30);
        // AddEmployee.addActionListener(this);
        // add(AddEmployee);

        // AddEmployee = new JButton("Add Employee");
        // AddEmployee.setBounds(150, 140, 150, 30);
        // AddEmployee.addActionListener(this);
        // add(AddEmployee);
 
        setSize(1120, 630);
        setLocation(250, 100);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MainClass();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
