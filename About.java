package TravelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame implements ActionListener {

    JButton back;


    About(){

        setBounds(600,200,500,550);
        setLayout(null);
        getContentPane().setBackground(new Color(255 , 236 , 242 ));

        //Label for heading
        JLabel l1 = new JLabel("ABOUT");
        l1.setBounds(150, 10, 100,40);
        l1.setForeground(new Color(170, 51 ,106));
        l1.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 20));
        add(l1);

        //Text to add in my about
        String s1 = "\n\nTRAVEL AND TOURISM MANAGEMENT SYSTEM\n\n " +
                "\n\nTravel and Tourism System is a platform designed to simplify travel planning. " +
                "\n\nIt allows users to browse and book travel packages, hotels, and manage their bookings seamlessly. " +
                "\n\nUsers can retrieve their personal data, view past bookings, and update their profiles. \n" +
                "\n\nWith secure payment gateway integration and a user-friendly interface, our system offers an easy and reliable solution for all your travel needs.";


        //TextArea to store the about section
        TextArea area = new TextArea(s1 , 10, 40, Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);


        //Adding the back button
        back = new JButton("Back");
        back.setBounds(200, 420, 80, 40);
        back.setForeground(new Color(255 , 209 , 220 ));
        back.setFont(new Font("CENTURY GOTHIC" , Font.BOLD, 14));
        back.setBackground(Color.DARK_GRAY);
        back.addActionListener(this);
        //create.setBorder(new LineBorder(new Color(170, 51 ,106)));
        add(back);


        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back){
            setVisible(false);
        }
    }

    public void main(String[] arg){
        new About();
    }
}
