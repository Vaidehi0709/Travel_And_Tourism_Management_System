package TravelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateCustomer extends JFrame implements ActionListener {

    JLabel labelUsername, labelName;
    JComboBox comboId ;
    JTextField tfNumber,tfCountry, tfAddress, tfEmail, tfPhone, tfId, tfGender;
    JRadioButton rmale, rfemale;
    JButton add, back;

    UpdateCustomer(String username){

        //Creating a frame
        setBounds(500, 200, 850, 550);
        setLayout(null);
        getContentPane().setBackground(new Color(255 , 236 , 242 ));

        //creating a label for heading
        JLabel text = new JLabel("UPDATE CUSTOMER DETAILS");
        text.setBounds(50, 0, 300,25);
        text.setForeground(new Color(170, 51 ,106));
        text.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 20));
        add(text);

        //Creating a label for username heading
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(30, 50, 150, 25);
        lblUsername.setForeground(new Color(170, 51 ,106));
        lblUsername.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblUsername);

        //Creating a label for username  answer(taken from the database)
        labelUsername = new JLabel();
        labelUsername.setBounds(220, 50, 150, 25);
        labelUsername.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelUsername);

        //Creating a label for id heading
        JLabel lblId = new JLabel("Id");
        lblId.setBounds(30, 90, 150, 25);
        lblId.setForeground(new Color(170, 51 ,106));
        lblId.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblId);

        //Adding the textfeild for the id
        tfId = new JTextField();
        tfId.setBounds(220,90,150,25);
        add(tfId);


        //Creating a label for id number
        JLabel lblNumber = new JLabel("Id Number");
        lblNumber.setBounds(30, 130, 150, 25);
        lblNumber.setForeground(new Color(170, 51 ,106));
        lblNumber.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblNumber);

        //Creating a text feld for taking the input of id number from  user
        tfNumber = new JTextField();
        tfNumber.setBounds(220,130,150,25);
        add(tfNumber);

        //Creating a label for name heading
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30, 170, 150, 25);
        lblname.setForeground(new Color(170, 51 ,106));
        lblname.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblname);

        //Creating a label for name  answer(taken from the database)
        labelName = new JLabel();
        labelName.setBounds(220, 170, 150, 25);
        labelName.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(labelName);

        //Creating a label for gender
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30, 210, 150, 25);
        lblgender.setForeground(new Color(170, 51 ,106));
        lblgender.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblgender);

        //Creating a text feld gender
        tfGender = new JTextField();
        tfGender.setBounds(220,210,150,25);
        add(tfGender);



        //Creating a label for country
        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(30, 250, 150, 25);
        lblcountry.setForeground(new Color(170, 51 ,106));
        lblcountry.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblcountry);

        //Creating a text feld for taking the input of country from  user
        tfCountry = new JTextField();
        tfCountry.setBounds(220,250,150,25);
        add(tfCountry);


        //Creating a label for address
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(30, 290, 150, 25);
        lbladdress.setForeground(new Color(170, 51 ,106));
        lbladdress.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lbladdress);

        //Creating a text feld for taking the input of adress from  user
        tfAddress = new JTextField();
        tfAddress.setBounds(220,290,150,25);
        add(tfAddress);


        //Creating a label for address
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(30, 330, 150, 25);
        lblphone.setForeground(new Color(170, 51 ,106));
        lblphone.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblphone);

        //Creating a text feld for taking the input of adress from  user
        tfPhone = new JTextField();
        tfPhone.setBounds(220,330,150,25);
        add(tfPhone);


        //Creating a label for email
        JLabel lblemail = new JLabel("E-Mail");
        lblemail.setBounds(30, 370, 150, 25);
        lblemail.setForeground(new Color(170, 51 ,106));
        lblemail.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 14));
        add(lblemail);

        //Creating a text feld for taking the input of country from  user
        tfEmail = new JTextField();
        tfEmail.setBounds(220,370,150,25);
        add(tfEmail);


        //Adding button to update  the details
        add = new JButton("Update");
        add.setBounds(70, 430, 100, 25);
        add.setForeground(new Color(255 , 209 , 220 ));
        add.setFont(new Font("CENTURY GOTHIC" , Font.BOLD, 14));
        add.setBackground(Color.DARK_GRAY);
        add.addActionListener(this);
        //create.setBorder(new LineBorder(new Color(170, 51 ,106)));
        add(add);


        //Adding button to go back
        back = new JButton("Back");
        back.setBounds(220, 430, 100, 25);
        back.setForeground(new Color(255 , 209 , 220 ));
        back.setFont(new Font("CENTURY GOTHIC" , Font.BOLD, 14));
        back.setBackground(Color.DARK_GRAY);
        back.addActionListener(this);
        //create.setBorder(new LineBorder(new Color(170, 51 ,106)));
        add(back);

        //Adding image to frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update1.png"));
        Image i2 = i1.getImage().getScaledInstance(400,400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 40, 400, 400);
        add(image);


        //To get the username and name from the datababse
        try{

            Conn c = new Conn();
            ResultSet rs =  c.stmt.executeQuery("SELECT * FROM customer WHERE username = '"+username+"'");
            while (rs.next()){
                labelUsername.setText(rs.getString("username"));
                labelName.setText(rs.getString("name"));
                tfId.setText(rs.getString("id"));
                tfNumber.setText(rs.getString("idNumber"));
                tfGender.setText(rs.getString("gender"));
                tfCountry.setText(rs.getString("country"));
                tfAddress.setText(rs.getString("address"));
                tfPhone.setText(rs.getString("phone"));
                tfEmail.setText(rs.getString("email"));


            }
        }
        catch (Exception e){
            e.printStackTrace();
        }


        setVisible(true);

    }


    public void actionPerformed (ActionEvent ae){
        if(ae.getSource() == add){

            String username = labelUsername.getText();
            String id = tfId.getText();
            String number = tfNumber.getText();
            String name = labelName.getText();
            String gender = tfGender.getText();
            String country = tfCountry.getText();
            String address = tfAddress.getText();
            String phone = tfPhone.getText();
            String email = tfEmail.getText();

            try{
                Conn c = new Conn();
                String query = "UPDATE customer SET username = '"+username+"', id ='"+id+"',idNumber = '"+number+"', name = '"+name+"', gender = '"+gender+"', country = '"+country+"',address =  '"+address+"',phone = '"+phone+"', email =  '"+email+"'";
                c.stmt.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");
                setVisible(false);
            }
            catch (Exception e){
                e.printStackTrace();
            }


        } else if (ae.getSource() == back) {

            setVisible(false);

        }
    }


    public static void main(String [] arg){
        new UpdateCustomer(" ");
    }
}
