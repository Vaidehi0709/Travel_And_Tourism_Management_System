package TravelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BookHotels extends JFrame implements ActionListener{

    //Dropdown for selecting the type of teh package
    Choice chotel, cac, cfood;

    //The textfeilds used for input from user
    JTextField tfpeople, tfdays;

    //Labels
    JLabel labelUsername ,labelId, labelNumber, labelPhone, labelPrice;

    //Buttons
    JButton chechPrice, bookHotel, back;

    String username;


    BookHotels(String username ){
        this.username = username;

        //creating frame
        setBounds(350, 200, 1100, 600);
        setLayout(null);
        getContentPane().setBackground(new Color(255 , 236 , 242 ));

        //Creating the label for the book package class
        JLabel text = new JLabel("BOOK HOTEL");
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


        //Creating label for the select hotel
        JLabel lblSelectHotel = new JLabel("Select Hotel");
        lblSelectHotel.setBounds(40, 110, 150, 20);
        lblSelectHotel.setForeground(new Color(170, 51 ,106));
        lblSelectHotel.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(lblSelectHotel);

        //Drodown for the hotel
        chotel = new Choice();
        chotel.setBounds(250, 110, 200, 25);
        add(chotel);

        try{

            Conn c = new Conn();
            ResultSet rs = c.stmt.executeQuery("SELECT * FROM hotel ");
            while(rs.next()){
                chotel.add(rs.getString("name"));
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }


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


        //Creating label for the Total no of days
        JLabel lbldays = new JLabel("Total Days");
        lbldays.setBounds(40, 190, 150, 20);
        lbldays.setForeground(new Color(170, 51 ,106));
        lbldays.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(lbldays);

        //Creating a text feld for taking the input of total persons
        tfdays = new JTextField();
        tfdays.setBounds(250,190,200,25);
        add(tfdays);


        //Creating label for the type of hotel ac room or non ac room
        JLabel lblac = new JLabel("AC / Non-AC Room");
        lblac.setBounds(40, 230, 200, 20);
        lblac.setForeground(new Color(170, 51 ,106));
        lblac.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(lblac);


        //Dropdown for the type of hotel room
        //Drodown for the hotel
        cac = new Choice();
        cac.add("AC Room");
        cac.add("Non-AC Room");
        cac.setBounds(250, 230, 200, 25);
        add(cac);


        //Creating label for the food
        JLabel lblFood = new JLabel("Food Included");
        lblFood.setBounds(40, 270, 200, 20);
        lblFood.setForeground(new Color(170, 51 ,106));
        lblFood.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(lblFood);


        //Dropdown for the food included or not
        //Drodown for the food
        cfood = new Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(250, 270, 200, 25);
        add(cfood);


        //Creating label for the id type
        JLabel lblId = new JLabel("Id");
        lblId.setBounds(40, 310, 100, 20);
        lblId.setForeground(new Color(170, 51 ,106));
        lblId.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(lblId);

        //creating label that stores the original idd type
        labelId = new JLabel();
        labelId.setBounds(250, 310, 200, 20);
        labelId.setForeground(new Color(170, 51 ,106));
        labelId.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(labelId);


        //Creating label for the id number
        JLabel lblNumber = new JLabel("Id Number");
        lblNumber.setBounds(40, 350, 100, 20);
        lblNumber.setForeground(new Color(170, 51 ,106));
        lblNumber.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(lblNumber);

        //creating label that stores the original idd number
        labelNumber = new JLabel();
        labelNumber.setBounds(250, 350, 200, 20);
        labelNumber.setForeground(new Color(170, 51 ,106));
        labelNumber.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(labelNumber);


        //Creating label for the phone
        JLabel lblPhone = new JLabel("Phone");
        lblPhone.setBounds(40, 390, 150, 20);
        lblPhone.setForeground(new Color(170, 51 ,106));
        lblPhone.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(lblPhone);

        //creating label that stores the original phone
        labelPhone = new JLabel();
        labelPhone.setBounds(250, 390, 200, 20);
        labelPhone.setForeground(new Color(170, 51 ,106));
        labelPhone.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(labelPhone);


        //Creating label for the price
        JLabel lblPrice = new JLabel("Total Price");
        lblPrice.setBounds(40, 430, 150, 20);
        lblPrice.setForeground(new Color(170, 51 ,106));
        lblPrice.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(lblPrice);

        //creating label that stores the original price
        labelPrice = new JLabel();
        labelPrice.setBounds(250, 430, 200, 20);
        labelPrice.setForeground(new Color(170, 51 ,106));
        labelPrice.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 16));
        add(labelPrice);


        //Button for checking the price of package
        chechPrice = new JButton("Check Price");
        chechPrice.setBounds(60, 490, 120, 25);
        chechPrice.setForeground(new Color(255 , 209 , 220 ));
        chechPrice.setFont(new Font("CENTURY GOTHIC" , Font.BOLD, 14));
        chechPrice.setBackground(Color.DARK_GRAY);
        chechPrice.addActionListener(this);
        //create.setBorder(new LineBorder(new Color(170, 51 ,106)));
        add(chechPrice);


        //Button for booking the package
        bookHotel = new JButton("Book Hotel");
        bookHotel.setBounds(200, 490, 200, 25);
        bookHotel.setForeground(new Color(255 , 209 , 220 ));
        bookHotel.setFont(new Font("CENTURY GOTHIC" , Font.BOLD, 14));
        bookHotel.setBackground(Color.DARK_GRAY);
        bookHotel.addActionListener(this);
        //create.setBorder(new LineBorder(new Color(170, 51 ,106)));
        add(bookHotel);


        //Button for back
        back = new JButton("Back");
        back.setBounds(420, 490, 120, 25);
        back.setForeground(new Color(255 , 209 , 220 ));
        back.setFont(new Font("CENTURY GOTHIC" , Font.BOLD, 14));
        back.setBackground(Color.DARK_GRAY);
        back.addActionListener(this);
        //create.setBorder(new LineBorder(new Color(170, 51 ,106)));
        add(back);


        //Adding image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500,400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(500, 50, 500, 400);
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
            try {
                Conn c = new Conn();
                ResultSet rs = c.stmt.executeQuery("SELECT * FROM hotel WHERE name = '" + chotel.getSelectedItem() + "'");
                while (rs.next()) {
                    int cost = Integer.parseInt(rs.getString("costPerPerson"));
                    int food = Integer.parseInt(rs.getString("foodIncluded"));
                    int ac = Integer.parseInt(rs.getString("acRoom"));


                    int persons = Integer.parseInt(tfpeople.getText());
                    int days = Integer.parseInt(tfdays.getText());

                    String acselected = cac.getSelectedItem();
                    String foodselected = cfood.getSelectedItem();

                    if (persons * days > 0) {
                        int total = 0;
                        total += acselected.equals("AC") ? ac : 0;
                        total += foodselected.equals("Yes") ? food : 0;

                        total += cost;
                        total = total * persons * days;

                        labelPrice.setText("Rs " + total);
                    } else {
                        JOptionPane.showMessageDialog(null, "Please Enter a Valid Number!");
                    }
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if (ae.getSource() == bookHotel){

            try{
                Conn c = new Conn();
                c.stmt.executeUpdate("INSERT INTO bookhotel values('"+labelUsername.getText()+"', '"+chotel.getSelectedItem()+"', '"+tfpeople.getText()+"', '"+tfdays.getText()+"', '"+cac.getSelectedItem()+"', '"+cfood.getSelectedItem()+"', '"+labelId.getText()+"','"+labelNumber.getText()+"', '"+labelPhone.getText()+"', '"+labelPrice.getText()+"' )");

                JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
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
        new BookHotels(" ");
    }
}
