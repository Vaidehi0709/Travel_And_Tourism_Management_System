package TravelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class DeleteDetails extends JFrame implements ActionListener {


    //Buttons
    JButton delete;

    //labes those store the heading
    JLabel lblUsername, lblId, lblNumber, lblName, lblGender, lblCountry, lblAddress, lblPhone, lblEmail;

    //labels those store the data in the heading
    JLabel labelUsername,labelId , labelNumber, labelName, labelGender, labelCountry , labelAddress, labelPhone, labelEmail;

    String username;

    DeleteDetails(String username){

        this.username = username;
        //Creating frame
        setBounds(450, 180, 870, 625);
        setLayout(null);
        getContentPane().setBackground(new Color(255 , 236 , 242 ));


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


        //Creating label for the type of id
        lblId = new JLabel("Id");
        lblId.setBounds(30, 110, 150, 25);
        lblId.setForeground(new Color(170, 51 ,106));
        lblId.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblId);

        //creating label that stores the type of id
        labelId = new JLabel();
        labelId.setBounds(220, 110, 150, 25);
        labelId.setForeground(new Color(170, 51 ,106));
        labelId.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelId);


        //Creating label for the number of id
        lblNumber = new JLabel("Id Number");
        lblNumber.setBounds(30, 170, 150, 25);
        lblNumber.setForeground(new Color(170, 51 ,106));
        lblNumber.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblNumber);

        //creating label that stores the number of id
        labelNumber = new JLabel();
        labelNumber.setBounds(220, 170, 150, 25);
        labelNumber.setForeground(new Color(170, 51 ,106));
        labelNumber.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelNumber);


        //Creating label for the name
        lblName = new JLabel("Name");
        lblName.setBounds(30, 230, 150, 25);
        lblName.setForeground(new Color(170, 51 ,106));
        lblName.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblName);

        //creating label that stores the name
        labelName = new JLabel();
        labelName.setBounds(220, 230, 150, 25);
        labelName.setForeground(new Color(170, 51 ,106));
        labelName.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelName);


        //Creating label for the gender
        lblGender = new JLabel("Gender");
        lblGender.setBounds(30, 290, 150, 25);
        lblGender.setForeground(new Color(170, 51 ,106));
        lblGender.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblGender);

        //creating label that stores the gender
        labelGender = new JLabel();
        labelGender.setBounds(220, 290, 150, 25);
        labelGender.setForeground(new Color(170, 51 ,106));
        labelGender.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelGender);


        //Creating label for the country
        lblCountry = new JLabel("Country");
        lblCountry.setBounds(510, 50, 150, 25);
        lblCountry.setForeground(new Color(170, 51 ,106));
        lblCountry.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblCountry);

        //creating label that stores the country
        labelCountry = new JLabel();
        labelCountry.setBounds(600, 50, 150, 25);
        labelCountry.setForeground(new Color(170, 51 ,106));
        labelCountry.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelCountry);


        //Creating label for the address
        lblAddress = new JLabel("Address");
        lblAddress.setBounds(510, 110, 150, 25);
        lblAddress.setForeground(new Color(170, 51 ,106));
        lblAddress.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblAddress);

        //creating label that stores the address
        labelAddress = new JLabel();
        labelAddress.setBounds(600, 110, 150, 25);
        labelAddress.setForeground(new Color(170, 51 ,106));
        labelAddress.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelAddress);


        //Creating label for the phone
        lblPhone = new JLabel("Phone");
        lblPhone.setBounds(510, 170, 150, 25);
        lblPhone.setForeground(new Color(170, 51 ,106));
        lblPhone.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblPhone);

        //creating label that stores the phone
        labelPhone = new JLabel();
        labelPhone.setBounds(600, 170, 150, 25);
        labelPhone.setForeground(new Color(170, 51 ,106));
        labelPhone.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelPhone);


        //Creating label for the email
        lblEmail = new JLabel("Email-Id");
        lblEmail.setBounds(510, 230, 150, 25);
        lblEmail.setForeground(new Color(170, 51 ,106));
        lblEmail.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblEmail);

        //creating label that stores the email
        labelEmail = new JLabel();
        labelEmail.setBounds(600, 230, 150, 25);
        labelEmail.setForeground(new Color(170, 51 ,106));
        labelEmail.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelEmail);


        //Adding the delete button
        delete = new JButton("Delete");
        delete.setBounds(350, 350, 100, 25);
        delete.setForeground(new Color(255 , 209 , 220 ));
        delete.setFont(new Font("CENTURY GOTHIC" , Font.BOLD, 14));
        delete.setBackground(Color.DARK_GRAY);
        delete.addActionListener(this);
        //create.setBorder(new LineBorder(new Color(170, 51 ,106)));
        add(delete);


        //Adding Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);//This gives the new height and width to your image
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 400, 600, 200);//This will give the placemdnt coordinates in the frame created
        add(image);

        //Now adding the image in the remaining space

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i5 = i4.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);//This gives the new height and width to your image
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(600, 400, 600, 200);//This will give the placemdnt coordinates in the frame created
        add(image2);


        //taking the data from the database
        try{

            Conn c = new Conn();
            String query = "SELECT * FROM customer WHERE username = '"+username+"'";
            ResultSet rs =  c.stmt.executeQuery(query);
            while (rs.next()){
                labelUsername.setText(rs.getString("username"));
                labelId.setText(rs.getString("id"));
                labelNumber.setText(rs.getString("idNumber"));
                labelName.setText(rs.getString("name"));
                labelGender.setText(rs.getString("gender"));
                labelCountry.setText(rs.getString("country"));
                labelAddress.setText(rs.getString("address"));
                labelPhone.setText(rs.getString("phone"));
                labelEmail.setText(rs.getString("email"));

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }


        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae){
        try{

            Conn c= new Conn();
            c.stmt.executeUpdate("DELETE FROM account WHERE username = '"+username+"'");
            c.stmt.executeUpdate("DELETE FROM customer WHERE username = '"+username+"'");
            c.stmt.executeUpdate("DELETE FROM bookpackage WHERE username = '"+username+"'");
            c.stmt.executeUpdate("DELETE FROM bookhotel WHERE username = '"+username+"'");


            JOptionPane.showMessageDialog(null, "Data Deleted Successfully ");

            setVisible(false);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] arg){
        new DeleteDetails("SRK");
    }
}
