package TravelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BookPackage extends JFrame implements ActionListener{

    //Dropdown for selecting the type of teh package
    Choice cpackage;

    //The textfeilds used for input from user
    JTextField tfpeople;

    //Labels
    JLabel labelUsername ,labelId, labelNumber, labelPhone, labelPrice;

    //Buttons
    JButton chechPrice, bookPackage, back;

    String username;
    BookPackage(String username ){
        this.username = username;

        //creating frame
        setBounds(350, 200, 1100, 500);
        setLayout(null);
        getContentPane().setBackground(new Color(255 , 236 , 242 ));

        //Creating the label for the book package class
        JLabel text = new JLabel("BOOK PACKAGE");
        text.setBounds(100, 10, 200, 30);
        text.setForeground(new Color(170, 51 ,106));
        text.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 20));
        add(text);


        //Creating label for the username
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(40, 70, 100, 20);
        lblUsername.setForeground(new Color(170, 51 ,106));
        lblUsername.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(lblUsername);

        //creating label that stores the original username
        labelUsername = new JLabel();
        labelUsername.setBounds(250, 70, 100, 20);
        labelUsername.setForeground(new Color(170, 51 ,106));
        labelUsername.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(labelUsername);


        //Creating label for the select package
        JLabel lblSelectPackage = new JLabel("Select Package");
        lblSelectPackage.setBounds(40, 110, 150, 20);
        lblSelectPackage.setForeground(new Color(170, 51 ,106));
        lblSelectPackage.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(lblSelectPackage);

        //Drodown for the package type
        cpackage = new Choice();
        cpackage.add("Platinum Package");
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.setBounds(250, 110, 200, 25);
        add(cpackage);


        //Creating label for the Total no of persons
        JLabel lblpeople = new JLabel("Total Persons");
        lblpeople.setBounds(40, 150, 150, 20);
        lblpeople.setForeground(new Color(170, 51 ,106));
        lblpeople.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(lblpeople);

        //Creating a text feld for taking the input of total persons
        tfpeople = new JTextField();
        tfpeople.setBounds(250,150,200,25);
        add(tfpeople);


        //Creating label for the id type
        JLabel lblId = new JLabel("Id");
        lblId.setBounds(40, 190, 100, 20);
        lblId.setForeground(new Color(170, 51 ,106));
        lblId.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(lblId);

        //creating label that stores the original idd type
        labelId = new JLabel();
        labelId.setBounds(250, 190, 200, 20);
        labelId.setForeground(new Color(170, 51 ,106));
        labelId.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(labelId);


        //Creating label for the id number
        JLabel lblNumber = new JLabel("Id Number");
        lblNumber.setBounds(40, 230, 100, 20);
        lblNumber.setForeground(new Color(170, 51 ,106));
        lblNumber.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(lblNumber);

        //creating label that stores the original idd number
        labelNumber = new JLabel();
        labelNumber.setBounds(250, 230, 200, 20);
        labelNumber.setForeground(new Color(170, 51 ,106));
        labelNumber.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(labelNumber);


        //Creating label for the phone
        JLabel lblPhone = new JLabel("Phone");
        lblPhone.setBounds(40, 270, 150, 20);
        lblPhone.setForeground(new Color(170, 51 ,106));
        lblPhone.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(lblPhone);

        //creating label that stores the original phone
        labelPhone = new JLabel();
        labelPhone.setBounds(250, 270, 200, 20);
        labelPhone.setForeground(new Color(170, 51 ,106));
        labelPhone.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(labelPhone);


        //Creating label for the price
        JLabel lblPrice = new JLabel("Total Price");
        lblPrice.setBounds(40, 310, 150, 20);
        lblPrice.setForeground(new Color(170, 51 ,106));
        lblPrice.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(lblPrice);

        //creating label that stores the original price
        labelPrice = new JLabel();
        labelPrice.setBounds(250, 310, 200, 20);
        labelPrice.setForeground(new Color(170, 51 ,106));
        labelPrice.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(labelPrice);


        //Button for checking the price of package
        chechPrice = new JButton("Check Price");
        chechPrice.setBounds(60, 380, 120, 25);
        chechPrice.setForeground(new Color(255 , 209 , 220 ));
        chechPrice.setFont(new Font("CENTURY GOTHIC" , Font.BOLD, 14));
        chechPrice.setBackground(Color.DARK_GRAY);
        chechPrice.addActionListener(this);
        //create.setBorder(new LineBorder(new Color(170, 51 ,106)));
        add(chechPrice);


        //Button for booking the package
        bookPackage = new JButton("Book Package");
        bookPackage.setBounds(200, 380, 200, 25);
        bookPackage.setForeground(new Color(255 , 209 , 220 ));
        bookPackage.setFont(new Font("CENTURY GOTHIC" , Font.BOLD, 14));
        bookPackage.setBackground(Color.DARK_GRAY);
        bookPackage.addActionListener(this);
        //create.setBorder(new LineBorder(new Color(170, 51 ,106)));
        add(bookPackage);


        //Button for back
        back = new JButton("Back");
        back.setBounds(420, 380, 120, 25);
        back.setForeground(new Color(255 , 209 , 220 ));
        back.setFont(new Font("CENTURY GOTHIC" , Font.BOLD, 14));
        back.setBackground(Color.DARK_GRAY);
        back.addActionListener(this);
        //create.setBorder(new LineBorder(new Color(170, 51 ,106)));
        add(back);


        //Adding image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500,300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(550, 50, 500, 300);
        add(image);



        //taking the data from the database
        try{

            Conn c = new Conn();
            String query = "SELECT * FROM customer WHERE username = '"+username+"'";
            ResultSet rs =  c.stmt.executeQuery(query);
            while (rs.next()){
                labelUsername.setText(rs.getString("username"));
                labelId.setText(rs.getString("id"));
                labelNumber.setText(rs.getString("idNumber"));
                labelPhone.setText(rs.getString("phone"));

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }




        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == chechPrice){

            String pack = cpackage.getSelectedItem();
            int cost = 0;
            if(pack.equals("Platinum Package")){
                cost += 112000 ;
            }
            else if (pack.equals("Gold Package")) {
                cost +=  98000;
            }
            else if(pack.equals("Silver Package")){
                cost += 86000 ;
            }

            int persons = Integer.parseInt(tfpeople.getText());
            cost *= persons;

            labelPrice.setText("Rs "+ cost);

        }
        else if (ae.getSource() == bookPackage){

            try{
                Conn c = new Conn();
                c.stmt.executeUpdate("INSERT INTO bookpackage values('"+labelUsername.getText()+"', '"+cpackage.getSelectedItem()+"', '"+tfpeople.getText()+"', '"+labelId.getText()+"', '"+labelNumber.getText()+"', '"+labelPhone.getText()+"', '"+labelPrice.getText()+"' )");

                JOptionPane.showMessageDialog(null, "Package Booked Successfully");
                setVisible(false);
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
        else if (ae.getSource() == back){

            setVisible(false);
        }
    }


    public static void main(String[] main){
        new BookPackage("SRK");
    }
}
