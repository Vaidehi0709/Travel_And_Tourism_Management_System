package TravelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {

    JButton addPersonalDetails , updatePersonaldetails, viewPersonalDetails , deletePersonalDetails, checkPackages, bookPackages, viewPackages , viewHotels , bookHotels, viewBookHotels, destinations, payment, calculator, notepad, about;

    String username;

    Dashboard( String username){
        this.username = username;

        //Creating frame
        //setBounds(0, 0,1600, 1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);//This gives a full screen without hardcoding the values
        setLayout(null);

        //Creating a panel
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(225 , 105 , 150));
        p1.setBounds(0, 0 , 1600, 63);
        add(p1);

        //Adding image at dashboard
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70,70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);

        //Creating a label for heading
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.DARK_GRAY);
        heading.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 30));
        p1.add(heading);


        //Creating panel for the different menu
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(225 , 182 , 193));
        p2.setBounds(0, 65 , 300, 900);
        add(p2);

        //Adding button for adding personal details
        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 0, 300, 50);
        addPersonalDetails.setBackground(new Color(225 , 182 , 193));
        addPersonalDetails.setForeground(Color.DARK_GRAY );
        addPersonalDetails.setFont(new Font("CENTURY GOTHIC" , Font.PLAIN, 20));
        addPersonalDetails.setMargin(new Insets(0, 0, 0 , 60));
        addPersonalDetails.addActionListener(this);
        //addPersonalDetails.setBorder(new LineBorder(new Color(170, 51 ,106)));
        p2.add(addPersonalDetails);


        //Adding button for updating personal details
        updatePersonaldetails = new JButton("Update Personal Details");
        updatePersonaldetails.setBounds(0, 50, 300, 50);
        updatePersonaldetails.setBackground(new Color(225 , 182 , 193));
        updatePersonaldetails.setForeground(Color.DARK_GRAY );
        updatePersonaldetails.setFont(new Font("CENTURY GOTHIC" , Font.PLAIN, 20));
        updatePersonaldetails.setMargin(new Insets(0, 0, 0 , 30));
        updatePersonaldetails.addActionListener(this);
        //addPersonalDetails.setBorder(new LineBorder(new Color(170, 51 ,106)));
        p2.add(updatePersonaldetails);

        //Adding button for viewing personal details
        viewPersonalDetails = new JButton("View Personal Details");
        viewPersonalDetails.setBounds(0, 100, 300, 50);
        viewPersonalDetails.setBackground(new Color(225 , 182 , 193));
        viewPersonalDetails.setForeground(Color.DARK_GRAY );
        viewPersonalDetails.setFont(new Font("CENTURY GOTHIC" , Font.PLAIN, 20));
        viewPersonalDetails.setMargin(new Insets(0, 0, 0 , 50));
        viewPersonalDetails.addActionListener(this);
        //addPersonalDetails.setBorder(new LineBorder(new Color(170, 51 ,106)));
        p2.add(viewPersonalDetails);

        //Adding button for deleting personal details
        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 150, 300, 50);
        deletePersonalDetails.setBackground(new Color(225 , 182 , 193));
        deletePersonalDetails.setForeground(Color.DARK_GRAY );
        deletePersonalDetails.setFont(new Font("CENTURY GOTHIC" , Font.PLAIN, 20));
        deletePersonalDetails.setMargin(new Insets(0, 0, 0 , 35));
        deletePersonalDetails.addActionListener(this);
        //addPersonalDetails.setBorder(new LineBorder(new Color(170, 51 ,106)));
        p2.add(deletePersonalDetails);

        //Adding button for checking the available packages
        checkPackages = new JButton("Check Packages");
        checkPackages.setBounds(0, 200, 300, 50);
        checkPackages.setBackground(new Color(225 , 182 , 193));
        checkPackages.setForeground(Color.DARK_GRAY );
        checkPackages.setFont(new Font("CENTURY GOTHIC" , Font.PLAIN, 20));
        checkPackages.setMargin(new Insets(0, 0, 0 , 90));
        checkPackages.addActionListener(this);
        //addPersonalDetails.setBorder(new LineBorder(new Color(170, 51 ,106)));
        p2.add(checkPackages);

        //Adding button for Booking the available packages
        bookPackages = new JButton("Book Packages");
        bookPackages.setBounds(0, 250, 300, 50);
        bookPackages.setBackground(new Color(225 , 182 , 193));
        bookPackages.setForeground(Color.DARK_GRAY );
        bookPackages.setFont(new Font("CENTURY GOTHIC" , Font.PLAIN, 20));
        bookPackages.setMargin(new Insets(0, 0, 0 , 110));
        bookPackages.addActionListener(this);
        //addPersonalDetails.setBorder(new LineBorder(new Color(170, 51 ,106)));
        p2.add(bookPackages);

        //Adding button for veiwing the booked packages
        viewPackages = new JButton("View Booked Packages");
        viewPackages.setBounds(0, 300, 300, 50);
        viewPackages.setBackground(new Color(225 , 182 , 193));
        viewPackages.setForeground(Color.DARK_GRAY );
        viewPackages.setFont(new Font("CENTURY GOTHIC" , Font.PLAIN, 20));
        viewPackages.setMargin(new Insets(0, 0, 0 , 25));
        viewPackages.addActionListener(this);
        //addPersonalDetails.setBorder(new LineBorder(new Color(170, 51 ,106)));
        p2.add(viewPackages);

        //Adding button for veiwing the hotels
        viewHotels = new JButton("View Hotels");
        viewHotels.setBounds(0, 350, 300, 50);
        viewHotels.setBackground(new Color(225 , 182 , 193));
        viewHotels.setForeground(Color.DARK_GRAY );
        viewHotels.setFont(new Font("CENTURY GOTHIC" , Font.PLAIN, 20));
        viewHotels.setMargin(new Insets(0, 0, 0 , 140));
        viewHotels.addActionListener(this);
        //addPersonalDetails.setBorder(new LineBorder(new Color(170, 51 ,106)));
        p2.add(viewHotels);

        //Adding button for booking the hotels
        bookHotels = new JButton("Book Hotels");
        bookHotels.setBounds(0, 400, 300, 50);
        bookHotels.setBackground(new Color(225 , 182 , 193));
        bookHotels.setForeground(Color.DARK_GRAY );
        bookHotels.setFont(new Font("CENTURY GOTHIC" , Font.PLAIN, 20));
        bookHotels.setMargin(new Insets(0, 0, 0 , 140));
        bookHotels.addActionListener(this);
        //addPersonalDetails.setBorder(new LineBorder(new Color(170, 51 ,106)));
        p2.add(bookHotels);

        //Adding button for veiwing booked hotels
        viewBookHotels = new JButton("Veiw Booked Hotels");
        viewBookHotels.setBounds(0, 450, 300, 50);
        viewBookHotels.setBackground(new Color(225 , 182 , 193));
        viewBookHotels.setForeground(Color.DARK_GRAY );
        viewBookHotels.setFont(new Font("CENTURY GOTHIC" , Font.PLAIN, 20));
        viewBookHotels.setMargin(new Insets(0, 0, 0 , 60));
        viewBookHotels.addActionListener(this);
        //addPersonalDetails.setBorder(new LineBorder(new Color(170, 51 ,106)));
        p2.add(viewBookHotels);

        //Adding button for veiwing destinations
        destinations = new JButton("Destinations");
        destinations.setBounds(0, 500, 300, 50);
        destinations.setBackground(new Color(225 , 182 , 193));
        destinations.setForeground(Color.DARK_GRAY );
        destinations.setFont(new Font("CENTURY GOTHIC" , Font.PLAIN, 20));
        destinations.setMargin(new Insets(0, 0, 0 , 140));
        destinations.addActionListener(this);
        //addPersonalDetails.setBorder(new LineBorder(new Color(170, 51 ,106)));
        p2.add(destinations);

        //Adding button for payment
        payment = new JButton("Payments");
        payment.setBounds(0, 550, 300, 50);
        payment.setBackground(new Color(225 , 182 , 193));
        payment.setForeground(Color.DARK_GRAY );
        payment.setFont(new Font("CENTURY GOTHIC" , Font.PLAIN, 20));
        payment.setMargin(new Insets(0, 0, 0 , 160));
        payment.addActionListener(this);
        //addPersonalDetails.setBorder(new LineBorder(new Color(170, 51 ,106)));
        p2.add(payment);


        //Adding button for calculator
        calculator = new JButton("Calculator");
        calculator.setBounds(0, 600, 300, 50);
        calculator.setBackground(new Color(225 , 182 , 193));
        calculator.setForeground(Color.DARK_GRAY );
        calculator.setFont(new Font("CENTURY GOTHIC" , Font.PLAIN, 20));
        calculator.setMargin(new Insets(0, 0, 0 , 160));
        calculator.addActionListener(this);
        //addPersonalDetails.setBorder(new LineBorder(new Color(170, 51 ,106)));
        p2.add(calculator);

        //Adding button for notepad
        notepad = new JButton("Notepad");
        notepad.setBounds(0, 650, 300, 50);
        notepad.setBackground(new Color(225 , 182 , 193));
        notepad.setForeground(Color.DARK_GRAY );
        notepad.setFont(new Font("CENTURY GOTHIC" , Font.PLAIN, 20));
        notepad.setMargin(new Insets(0, 0, 0 , 170));
        notepad.addActionListener(this);
        //addPersonalDetails.setBorder(new LineBorder(new Color(170, 51 ,106)));
        p2.add(notepad);

        //Adding button for exiting
        about = new JButton("About");
        about.setBounds(0, 700, 300, 50);
        about.setBackground(new Color(225 , 182 , 193));
        about.setForeground(Color.DARK_GRAY );
        about.setFont(new Font("CENTURY GOTHIC" , Font.PLAIN, 20));
        about.setMargin(new Insets(0, 0, 0 , 190));
        about.addActionListener(this);
        //addPersonalDetails.setBorder(new LineBorder(new Color(170, 51 ,106)));
        p2.add(about);


        //Adding image on teh right side of the menu
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home1.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds( 0 , 0, 1650, 1000);
        add(image);

        //Label for the text on the image
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400, 70, 1200, 70);
        text.setForeground(new Color(255, 245, 238));
        text.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 50));
        image.add(text);



        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addPersonalDetails){
            new AddCustomer(username);
        }
        else if (ae.getSource() == viewPersonalDetails) {
            new ViewCustomer(username);
        }
        else if (ae.getSource() == updatePersonaldetails) {
            new UpdateCustomer(username);
        }
        else if (ae.getSource() == checkPackages) {
            new CheckPackage();
        }
        else if (ae.getSource() == bookPackages) {
            new BookPackage(username);
        }
        else if(ae.getSource() == viewPackages){
            new ViewPackage(username);
        }
        else if(ae.getSource() == viewHotels){
            new CheckHotels();
        }
        else if (ae.getSource() == destinations) {
            new Destinations();
        }
        else if(ae.getSource() == bookHotels){
            new BookHotels(username);
        }
        else if(ae.getSource() == viewBookHotels){
            new ViewBookedHotel(username);
        }
        else if(ae.getSource() == payment){
            new Payment();
        }
        else if(ae.getSource() == calculator){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if (ae.getSource() == notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == about){
            new About();
        }
        else if(ae.getSource() == deletePersonalDetails){
            new DeleteDetails(username);
        }
    }

    public static void main(String[] arg){
        new Dashboard(" ");
    }
}
