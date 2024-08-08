package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JTextField textName, textFName, textEmail, textAd, textcity, textpin, textstate;
    JButton next;
    JDateChooser dateChooser;
    JRadioButton r1,r2,m1,m2,m3;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelname = new JLabel("Name :");
        labelname.setFont(new Font("Raleway", Font.BOLD,20));
        labelname.setBounds(100,190,100,30);
        add(labelname);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelfname = new JLabel("Father's Name :");
        labelfname.setFont(new Font("Raleway",Font.BOLD,20));
        labelfname.setBounds(100,240,200,30);
        add(labelfname);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(300,240,400,30);
        add(textFName);

        JLabel labeldob = new JLabel("Date of Birth :");
        labeldob.setFont(new Font("Raleway",Font.BOLD,20));
        labeldob.setBounds(100,340,200,30);
        add(labeldob);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email Address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,440,100,30);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,440,100,30);
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(620,440,90,30);
        add(m3);

        ButtonGroup buttonGroupm = new ButtonGroup();
        buttonGroupm.add(m1);
        buttonGroupm.add(m2);
        buttonGroupm.add(m3);

        JLabel labelAd = new JLabel("Address :");
        labelAd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAd.setBounds(100,490,200,30);
        add(labelAd);

        textAd = new JTextField();
        textAd.setFont(new Font("Raleway",Font.BOLD,14));
        textAd.setBounds(300,490,400,30);
        add(textAd);

        JLabel labelcity = new JLabel("City :");
        labelcity.setFont(new Font("Raleway",Font.BOLD,20));
        labelcity.setBounds(100,540,200,30);
        add(labelcity);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD,14));
        textcity.setBounds(300,540,400,30);
        add(textcity);

        JLabel labelpin = new JLabel("Pin Code :");
        labelpin.setFont(new Font("Raleway",Font.BOLD,20));
        labelpin.setBounds(100,590,200,30);
        add(labelpin);

        textpin = new JTextField();
        textpin.setFont(new Font("Raleway",Font.BOLD,14));
        textpin.setBounds(300,590,400,30);
        add(textpin);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Raleway",Font.BOLD,20));
        labelstate.setBounds(100,640,200,30);
        add(labelstate);

        textstate = new JTextField();
        textstate.setFont(new Font("Raleway",Font.BOLD,14));
        textstate.setBounds(300,640,400,30);
        add(textstate);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,710,80,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected())
            gender="Male";
        else if(r2.isSelected())
            gender="Female";
        String email=textEmail.getText();
        String marital=null;
        if(m1.isSelected()){
            marital="Married";
        }
        else if(m2.isSelected()){
            marital="Unmarried";
        }
        else if(m3.isSelected()){
            marital="Other";
        }
        String address=textAd.getText();
        String city=textcity.getText();
        String pincode=textpin.getText();
        String state=textstate.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
            else{
                Con con1 = new Con();
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }

        }catch(SQLException E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args){

        new Signup();
    }


}
