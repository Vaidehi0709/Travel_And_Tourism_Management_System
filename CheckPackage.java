package TravelManagementSystem;

import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame {

    CheckPackage(){
        //Create frame
        setBounds(450, 200 , 900, 600);

        //Creating an array of string to dynamically allocate the data to the respective packages
        String[] package1 = {"PLATINUM PACKAGE", "6 Days and 7 Nights" , "Airport Assistance", "Half Day City Tours", "Daily Buffet",  "Full Day 3 Island Cruise", "English Speaking Guide", "Free Sightseeing" ,"BOOK PACKAGE", "SUMMER SPECIAL","Rs 1,12,000 onwards", "package1.jpg"};
        String[] package2 = {"GOLD PACKAGE", "5 Days and 6 Nights", "Entrance Free Tickets", "Meet and Greet on Arrival", "Welcome Drinks on Arrival", "Night Safari","Cruised with Dinner","Free Tea, Coffee & Drinks", "BOOK PACKAGE", "WINTER SPECIAL","Rs 98,000 onwards","package2.jpg"};
        String[] package3 = {"SILVER PACKAGE", "4 Days and 5 Nights", "Return Airfare", "Free Clubbing & Bowling", "Free Tea, Coffee & Drinks", "Daily Buffet", "BBQ Dinner", "Night Safari","BOOK PACKAGE","MONSOON SPECIAL", "Rs 86,000 onwards","package3.jpg"};


        //to create a tab
        JTabbedPane tab = new JTabbedPane();

        //Panel for package 1
        JPanel p1 = createPackage(package1);
        //Creating the tab for package 1
        tab.addTab("Package 1 ", null, p1);

        //Panel for package 2
        JPanel p2 = createPackage(package2);
        //Creating the tab for package 2
        tab.addTab("Package 2 ", null, p2);

        //Panel for package
        JPanel p3 = createPackage(package3);
        //Creating the tab for package 3
        tab.addTab("Package 3 ", null, p3);

        add(tab);



        setVisible(true);

    }



    public JPanel createPackage(String[] pack){
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(255 , 236 , 242 ));

        //Label for the package 1
        JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(50, 5 , 300, 30);
        l1.setForeground(new Color(170, 51 ,106));
        l1.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 30));
        p1.add(l1);

        //Label for the First features of package 1
        JLabel f11 = new JLabel(pack[1]);
        f11.setBounds(30, 60 , 300, 30);
        f11.setForeground(new Color(172,33,3));
        f11.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 20));
        p1.add(f11);

        //Label for the second features of package 1
        JLabel f12 = new JLabel(pack[2]);
        f12.setBounds(30, 110 , 300, 30);
        f12.setForeground(new Color(230,117,112));
        f12.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 20));
        p1.add(f12);

        //Label for the third features of package 1
        JLabel f13 = new JLabel(pack[3]);
        f13.setBounds(30, 160 , 300, 30);
        f13.setForeground(new Color(172,33,3));
        f13.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 20));
        p1.add(f13);

        //Label for the fourth features of package 1
        JLabel f14 = new JLabel(pack[4]);
        f14.setBounds(30, 210 , 300, 30);
        f14.setForeground(new Color(230,117,112));
        f14.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 20));
        p1.add(f14);

        //Label for the fifth features of package 1
        JLabel f15 = new JLabel(pack[5]);
        f15.setBounds(30, 260 , 300, 30);
        f15.setForeground(new Color(172,33,3));
        f15.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 20));
        p1.add(f15);

        //Label for the sixth features of package 1
        JLabel f16 = new JLabel(pack[6]);
        f16.setBounds(30, 310 , 400, 30);
        f16.setForeground(new Color(230,117,112));
        f16.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 20));
        p1.add(f16);

        //Label for the seventh features of package 1
        JLabel f18 = new JLabel(pack[7]);
        f18.setBounds(30, 360 , 400, 30);
        f18.setForeground(new Color(172,33,3));
        f18.setFont(new Font("CENTURY GOTHIC", Font.PLAIN, 20));
        p1.add(f18);

        //Label for the book now of package 1
        JLabel f17 = new JLabel(pack[8]);
        f17.setBounds(80, 430 , 300, 30);
        f17.setForeground(new Color(170, 51 ,106));
        f17.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 25));
        p1.add(f17);

        //Label for the Summer Special of package 1
        JLabel f19 = new JLabel(pack[9]);
        f19.setBounds(80, 480 , 300, 30);
        f19.setForeground(new Color(170, 51 ,106));
        f19.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 25));
        p1.add(f19);

        //Label for the price of package 1
        JLabel price1 = new JLabel(pack[10]);
        price1.setBounds(350, 480 , 300, 30);
        price1.setForeground(new Color(107,11,11));
        price1.setFont(new Font("CENTURY GOTHIC", Font.BOLD, 25));
        p1.add(price1);

        //Adding image to package 1
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/"+ pack[11]));
        Image i2 = i1.getImage().getScaledInstance(500,300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 50, 500, 300);
        p1.add(image);


        return p1;
    }


    public static void main(String[] arg){
        new CheckPackage();
    }
}
