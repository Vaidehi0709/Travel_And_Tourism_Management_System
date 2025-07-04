package TravelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewPackage extends JFrame implements ActionListener {


    //Buttons
    JButton back;

    //labes those store the heading
    JLabel lblUsername, lblId ,lblPackage, lblPersons ,lblNumber, lblPhone, lblPrice;

    //labels those store the data in the heading
    JLabel labelUsername, labelId ,labelPackage , labelPersons ,labelNumber,  labelPhone, labelPrice;

    ViewPackage(String username){
        //Creating frame
        setBounds(450, 200, 900, 450);
        setLayout(null);
        getContentPane().setBackground(new Color(255 , 236 , 242 ));


        //Creating label for heading
        JLabel text = new JLabel("VIEW PACKAGE DETAILS");
        text.setBounds(60, 0, 300, 30);
        text.setForeground(new Color(170, 51 ,106));
        text.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 20));
        add(text);



        //Creating label for the username
        lblUsername = new JLabel("Username");
        lblUsername.setBounds(30, 50, 150, 25);
        lblUsername.setForeground(new Color(170, 51 ,106));
        lblUsername.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblUsername);

        //creating label that stores the original username
        labelUsername = new JLabel();
        labelUsername.setBounds(220, 50, 150, 25);
        labelUsername.setForeground(new Color(170, 51 ,106));
        labelUsername.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelUsername);


        //Creating label for the type of package name
        lblPackage = new JLabel("Package");
        lblPackage.setBounds(30, 90, 150, 25);
        lblPackage.setForeground(new Color(170, 51 ,106));
        lblPackage.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblPackage);

        //creating label that stores the type package
        labelPackage = new JLabel();
        labelPackage.setBounds(220, 90, 150, 25);
        labelPackage.setForeground(new Color(170, 51 ,106));
        labelPackage.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelPackage);


        //Creating label for the number of persons
        lblPersons = new JLabel("Total Persons");
        lblPersons.setBounds(30, 130, 150, 25);
        lblPersons.setForeground(new Color(170, 51 ,106));
        lblPersons.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblPersons);

        //creating label that stores the number of persons
        labelPersons = new JLabel();
        labelPersons.setBounds(220, 130, 150, 25);
        labelPersons.setForeground(new Color(170, 51 ,106));
        labelPersons.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelPersons);


        //Creating label for the type of id
        lblId = new JLabel("Id");
        lblId.setBounds(30, 170, 150, 25);
        lblId.setForeground(new Color(170, 51 ,106));
        lblId.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblId);

        //creating label that stores the type of id
        labelId = new JLabel();
        labelId.setBounds(220, 170, 150, 25);
        labelId.setForeground(new Color(170, 51 ,106));
        labelId.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelId);


        //Creating label for the id number
        lblNumber = new JLabel("Id Number");
        lblNumber.setBounds(30, 210, 150, 25);
        lblNumber.setForeground(new Color(170, 51 ,106));
        lblNumber.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblNumber);

        //creating label that stores the id number
        labelNumber = new JLabel();
        labelNumber.setBounds(220, 210, 150, 25);
        labelNumber.setForeground(new Color(170, 51 ,106));
        labelNumber.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelNumber);


        //Creating label for the phone
        lblPhone = new JLabel("Phone");
        lblPhone.setBounds(30, 250, 150, 25);
        lblPhone.setForeground(new Color(170, 51 ,106));
        lblPhone.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblPhone);

        //creating label that stores the phone
        labelPhone = new JLabel();
        labelPhone.setBounds(220, 250, 150, 25);
        labelPhone.setForeground(new Color(170, 51 ,106));
        labelPhone.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelPhone);


        //Creating label for the total price
        lblPrice = new JLabel("Total Price");
        lblPrice.setBounds(30, 290, 150, 25);
        lblPrice.setForeground(new Color(170, 51 ,106));
        lblPrice.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblPrice);

        //creating label that stores the total price
        labelPrice = new JLabel();
        labelPrice.setBounds(220, 290, 150, 25);
        labelPrice.setForeground(new Color(170, 51 ,106));
        labelPrice.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelPrice);


        //Adding the back button
        back = new JButton("Back");
        back.setBounds(130, 360, 100, 25);
        back.setForeground(new Color(255 , 209 , 220 ));
        back.setFont(new Font("CENTURY GOTHIC" , Font.BOLD, 14));
        back.setBackground(Color.DARK_GRAY);
        back.addActionListener(this);
        //create.setBorder(new LineBorder(new Color(170, 51 ,106)));
        add(back);


        //Adding Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);//This gives the new height and width to your image
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450, 20, 500, 400);//This will give the placemdnt coordinates in the frame created
        add(image);


        //taking the data from the database
        try{

            Conn c = new Conn();
            String query = "SELECT * FROM bookpackage WHERE username = '"+username+"'";
            ResultSet rs =  c.stmt.executeQuery(query);
            while (rs.next()){
                labelUsername.setText(rs.getString("username"));
                labelId.setText(rs.getString("id"));
                labelNumber.setText(rs.getString("idNumber"));
                labelPackage.setText(rs.getString("package"));
                labelPersons.setText(rs.getString("persons"));
                labelPrice.setText(rs.getString("price"));
                labelPhone.setText(rs.getString("phone"));

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }


        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back){
            setVisible(false);
            //new Dashboard(" ");
        }
    }

    public static void main(String[] arg){
        new ViewPackage(" ");
    }
}
