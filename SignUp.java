package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {
    JDateChooser dateChooser;
    JRadioButton r1, r2, r3, r4, r5;
    JButton next;

    JTextField textName, textFname, textemail, textAdd, textCity, textState, textpin;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    SignUp() {

        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("Application Form No." + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(330, 70, 600, 30);
        label2.setFont(new Font("AvantGarde", Font.BOLD, 22));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(290, 90, 600, 40);
        label3.setFont(new Font("AvantGarde", Font.BOLD, 22));
        add(label3);

        JLabel labelName = new JLabel("Name");
        labelName.setBounds(100, 190, 400, 30);
        labelName.setFont(new Font("AvantGarde", Font.BOLD, 22));
        add(labelName);

        textName = new JTextField();
        textName.setBounds(300, 190, 400, 30);
        textName.setFont(new Font("AvantGarde", Font.BOLD, 14));
        add(textName);

        JLabel labelName1 = new JLabel("Father's Name");
        labelName1.setBounds(100, 240, 400, 30);
        labelName1.setFont(new Font("AvantGarde", Font.BOLD, 22));
        add(labelName1);

        textFname = new JTextField();
        textFname.setBounds(300, 240, 400, 30);
        textFname.setFont(new Font("AvantGarde", Font.BOLD, 14));
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth");
        DOB.setBounds(100, 340, 200, 30);
        DOB.setFont(new Font("AvantGarde", Font.BOLD, 22));
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 340, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);

        JLabel g = new JLabel("Gender");
        g.setBounds(100, 290, 200, 30);
        g.setFont(new Font("AvantGarde", Font.BOLD, 20));
        add(g);

        r1 = new JRadioButton("Male");
        r1.setBounds(300, 290, 100, 30);
        r1.setFont(new Font("AvantGarde", Font.BOLD, 20));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(450, 290, 100, 30);
        r2.setFont(new Font("AvantGarde", Font.BOLD, 20));
        add(r2);

        ButtonGroup b = new ButtonGroup();
        b.add(r1);
        b.add(r2);

        JLabel email = new JLabel("Email Id");
        email.setBounds(100, 390, 200, 30);
        email.setFont(new Font("AvantGarde", Font.BOLD, 20));
        add(email);

        textemail = new JTextField();
        textemail.setBounds(300, 390, 400, 30);
        textemail.setFont(new Font("AvantGarde", Font.BOLD, 14));
        add(textemail);

        JLabel Ms = new JLabel("Married Status");
        Ms.setBounds(100, 440, 200, 30);
        Ms.setFont(new Font("AvantGarde", Font.BOLD, 20));
        add(Ms);

        r3 = new JRadioButton("Married");
        r3.setBounds(300, 440, 100, 30);
        r3.setFont(new Font("AvantGarde", Font.BOLD, 20));
        add(r3);

        r4 = new JRadioButton("Unmarried");
        r4.setBounds(450, 440, 170, 30);
        r4.setFont(new Font("AvantGarde", Font.BOLD, 20));
        add(r4);

        r5 = new JRadioButton("Other");
        r5.setBounds(620, 440, 170, 30);
        r5.setFont(new Font("AvantGarde", Font.BOLD, 20));
        add(r5);

        ButtonGroup c = new ButtonGroup();
        c.add(r3);
        c.add(r4);
        c.add(r5);

        JLabel Add = new JLabel("Address");
        Add.setBounds(100, 490, 200, 30);
        Add.setFont(new Font("AvantGarde", Font.BOLD, 20));
        add(Add);

        textAdd = new JTextField();
        textAdd.setBounds(300, 490, 400, 30);
        textAdd.setFont(new Font("AvantGarde", Font.BOLD, 14));
        add(textAdd);

        JLabel City = new JLabel("City");
        City.setBounds(100, 540, 200, 30);
        City.setFont(new Font("AvantGarde", Font.BOLD, 20));
        add(City);

        textCity = new JTextField();
        textCity.setBounds(300, 540, 400, 30);
        textCity.setFont(new Font("AvantGarde", Font.BOLD, 14));
        add(textCity);

        JLabel pin = new JLabel("Pin code");
        pin.setBounds(100, 590, 200, 30);
        pin.setFont(new Font("AvantGarde", Font.BOLD, 20));
        add(pin);

        textpin = new JTextField();
        textpin.setBounds(300, 590, 400, 30);
        textpin.setFont(new Font("AvantGarde", Font.BOLD, 14));
        add(textpin);

        JLabel State = new JLabel("State");
        State.setBounds(100, 640, 200, 30);
        State.setFont(new Font("AvantGarde", Font.BOLD, 20));
        add(State);

        textState = new JTextField();
        textState.setBounds(300, 640, 400, 30);
        textState.setFont(new Font("AvantGarde", Font.BOLD, 14));
        add(textState);

        next = new JButton("next");
        next.setBounds(620, 710, 80, 30);
        next.setFont(new Font("AvantGarde", Font.BOLD, 22));
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        String email = textemail.getText();
        String marital = null;
        if (r3.isSelected()) {
            marital = "Married";
        } else if (r4.isSelected()) {
            marital = "Unmarried";
        } else if (r5.isSelected()) {
            marital = "Other";
        }
        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textpin.getText();
        String state = textState.getText();

        try {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                Con con1 = new Con();
                String q = "insert into SignUp values('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','" + pincode + "','" + state + "')";
                con1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new SignUp();

    }
}
