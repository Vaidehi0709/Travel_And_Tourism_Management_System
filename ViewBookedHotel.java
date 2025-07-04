package TravelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewBookedHotel extends JFrame implements ActionListener {


    //Buttons
    JButton back;

    //labes those store the heading
    JLabel lblUsername, lbldays , lblid, lblac, lblfood ,lblHotel, lblPersons ,lblNumber, lblPhone, lblPrice;

    //labels those store the data in the heading
    JLabel labelUsername, labeldays, labelId, labelac, labelfood ,labelHotel , labelPersons ,labelNumber,  labelPhone, labelPrice;

    ViewBookedHotel(String username){
        //Creating frame
        setBounds(400, 200, 1000, 600);
        setLayout(null);
        getContentPane().setBackground(new Color(255 , 236 , 242 ));


        //Creating label for heading
        JLabel text = new JLabel("VIEW BOOKED HOTEL DETAILS");
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


        //Creating label for the type of hotel name
        lblHotel = new JLabel("Hotel Name");
        lblHotel.setBounds(30, 90, 150, 25);
        lblHotel.setForeground(new Color(170, 51 ,106));
        lblHotel.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblHotel);

        //creating label that stores the type package
        labelHotel = new JLabel();
        labelHotel.setBounds(220, 90, 150, 25);
        labelHotel.setForeground(new Color(170, 51 ,106));
        labelHotel.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelHotel);


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


        //Creating label for the no of days
        lbldays = new JLabel("Total Days");
        lbldays.setBounds(30, 170, 150, 25);
        lbldays.setForeground(new Color(170, 51 ,106));
        lbldays.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lbldays);

        //creating label that stores the no of days
        labeldays = new JLabel();
        labeldays.setBounds(220, 170, 150, 25);
        labeldays.setForeground(new Color(170, 51 ,106));
        labeldays.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labeldays);



        //Creating label for the ac rooms
        lblac = new JLabel("AC / Non-AC");
        lblac.setBounds(30, 210, 150, 25);
        lblac.setForeground(new Color(170, 51 ,106));
        lblac.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblac);

        //creating label that stores the ac room
        labelac = new JLabel();
        labelac.setBounds(220, 210, 150, 25);
        labelac.setForeground(new Color(170, 51 ,106));
        labelac.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelac);


        //Creating label for the food
        lblfood = new JLabel("Food Included ?");
        lblfood.setBounds(30, 250, 150, 25);
        lblfood.setForeground(new Color(170, 51 ,106));
        lblfood.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblfood);

        //creating label that stores the food
        labelfood = new JLabel();
        labelfood.setBounds(220, 250, 150, 25);
        labelfood.setForeground(new Color(170, 51 ,106));
        labelfood.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelfood);



        //Creating label for the id
        lblid = new JLabel("Id");
        lblid.setBounds(30, 290, 150, 25);
        lblid.setForeground(new Color(170, 51 ,106));
        lblid.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblid);

        //creating label that stores the id
        labelId = new JLabel();
        labelId.setBounds(220, 290, 150, 25);
        labelId.setForeground(new Color(170, 51 ,106));
        labelId.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelId);


        //Creating label for the id number
        lblNumber = new JLabel("Id Number");
        lblNumber.setBounds(30, 330, 150, 25);
        lblNumber.setForeground(new Color(170, 51 ,106));
        lblNumber.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblNumber);

        //creating label that stores the id number
        labelNumber = new JLabel();
        labelNumber.setBounds(220, 330, 150, 25);
        labelNumber.setForeground(new Color(170, 51 ,106));
        labelNumber.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelNumber);


        //Creating label for the phone
        lblPhone = new JLabel("Phone");
        lblPhone.setBounds(30, 370, 150, 25);
        lblPhone.setForeground(new Color(170, 51 ,106));
        lblPhone.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblPhone);

        //creating label that stores the phone
        labelPhone = new JLabel();
        labelPhone.setBounds(220, 370, 150, 25);
        labelPhone.setForeground(new Color(170, 51 ,106));
        labelPhone.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelPhone);


        //Creating label for the total price
        lblPrice = new JLabel("Total Price");
        lblPrice.setBounds(30, 410, 150, 25);
        lblPrice.setForeground(new Color(170, 51 ,106));
        lblPrice.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblPrice);

        //creating label that stores the total price
        labelPrice = new JLabel();
        labelPrice.setBounds(220, 410, 150, 25);
        labelPrice.setForeground(new Color(170, 51 ,106));
        labelPrice.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelPrice);


        //Adding the back button
        back = new JButton("Back");
        back.setBounds(130, 460, 100, 25);
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
            String query = "SELECT * FROM bookhotel WHERE username = '"+username+"'";
            ResultSet rs =  c.stmt.executeQuery(query);
            while (rs.next()){
                labelUsername.setText(rs.getString("username"));
                labelId.setText(rs.getString("id"));
                labelNumber.setText(rs.getString("idNumber"));
                labelHotel.setText(rs.getString("name"));
                labelPersons.setText(rs.getString("persons"));
                labelPrice.setText(rs.getString("price"));
                labelPhone.setText(rs.getString("phone"));
                labelfood.setText(rs.getString("food"));
                labelac.setText(rs.getString("ac"));
                labeldays.setText(rs.getString("days"));


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
        new ViewBookedHotel("SRK");
    }
}
