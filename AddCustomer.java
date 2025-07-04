package TravelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class AddCustomer extends JFrame implements ActionListener {

    JLabel labelUsername, labelName;
    JComboBox comboId ;
    JTextField tfNumber,tfCountry, tfAddress, tfEmail, tfPhone;
    JRadioButton rmale, rfemale;
    JButton add, back;

    AddCustomer(String username){

        //Creating a frame
        setBounds(450, 200, 850, 550);
        setLayout(null);
        getContentPane().setBackground(new Color(255 , 236 , 242 ));

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

        //creating a drop down menu using Jcombobox
        comboId =  new JComboBox(new String[] {"Passport", "Aadhar Card", "Pan Card", "Ration Card"});
        comboId.setBounds(220, 90, 150, 25);
        comboId.setBackground(Color.WHITE);
        add(comboId);

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

        //Creating a radio button for taking the input gender "MALE" from  user
        rmale = new JRadioButton("Male");
        rmale.setBounds(220, 210 , 70, 25);
        rmale.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 14));
        rmale.setBackground(new Color(255 , 236 , 242 ));
        add(rmale);

        //Creating a radio button for taking the input gender "FEMALE" from  user
        rfemale = new JRadioButton("Female");
        rfemale.setBounds(300, 210 , 100, 25);
        rfemale.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 14));
        rfemale.setBackground(new Color(255 , 236 , 242 ));
        add(rfemale);

        //Grouping the button so theyu work dependently
        ButtonGroup bg = new ButtonGroup();
        bg.add(rfemale);
        bg.add(rmale);


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


        //Adding button to add the details
        add = new JButton("Add");
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
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(450,400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 40, 400, 420);
        add(image);


        //To get the username and name from the datababse
        try{

            Conn c = new Conn();
            ResultSet rs =  c.stmt.executeQuery("SELECT * FROM account WHERE username = '"+username+"'");
            while (rs.next()){
                labelUsername.setText(rs.getString("username"));
                labelName.setText(rs.getString("name"));
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
            String id =(String) comboId.getSelectedItem();
            String number = tfNumber.getText();
            String name = labelName.getText();
            String gender = null;
            if(rmale.isSelected()){
                gender = "Male";
            }
            else{
                gender = "Female";
            }
            String country = tfCountry.getText();
            String address = tfAddress.getText();
            String phone = tfPhone.getText();
            String email = tfEmail.getText();

            try{
                Conn c = new Conn();
                String query = "INSERT INTO customer VALUES ('"+username+"', '"+id+"', '"+number+"', '"+name+"', '"+gender+"', '"+country+"', '"+address+"', '"+phone+"', '"+email+"')";
                c.stmt.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
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
        new AddCustomer(" ");
    }
}
