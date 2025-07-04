package TravelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payment extends JFrame implements ActionListener {

    //Button for payment and back operation
    JButton pay , back;


    Payment(){
        //Creating frame
        setBounds(500, 200, 800, 600);
        setLayout(null);



        //Adding image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);//This gives the new height and width to your image
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 600);//This will give the placemdnt coordinates in the frame created
        add(image);


        //Adding the pay button
        pay = new JButton("Pay");
        pay.setBounds(420, 0, 80, 40);
        pay.setForeground(new Color(255 , 209 , 220 ));
        pay.setFont(new Font("CENTURY GOTHIC" , Font.BOLD, 14));
        pay.setBackground(Color.DARK_GRAY);
        pay.addActionListener(this);
        //create.setBorder(new LineBorder(new Color(170, 51 ,106)));
        image.add(pay);


        //Adding the back button
        back = new JButton("Back");
        back.setBounds(520, 0, 80, 40);
        back.setForeground(new Color(255 , 209 , 220 ));
        back.setFont(new Font("CENTURY GOTHIC" , Font.BOLD, 14));
        back.setBackground(Color.DARK_GRAY);
        back.addActionListener(this);
        //create.setBorder(new LineBorder(new Color(170, 51 ,106)));
        image.add(back);

        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == pay){

            setVisible(false);
            new Paytm();

        }
        else if(ae.getSource() == back){
            setVisible(false);
        }
    }

    public static void main(String[] arg){
        new Payment();
    }
}
