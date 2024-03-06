
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    // globally declared login and cancel button to solve the error inside
    // actionPerformed class
    JButton login, cancel;
    JTextField tfusername, tfpassword;

    Login() {
        /*
         * use to set the background color of the Log in Frame
         */
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);// no use of swing layout
        /*
         * To write something on the Frame we use Jlabel class
         * create a JLable class username
         * we want our own custom layout
         * so above wright the code setLayout(null)-- this will be hide the swing layout
         * now after that you need to place the component explicitely on the frame
         * for that use the function setBounds
         * To create a Text Input field use JTextField class
         * To create a Password Input field use JPaawordField class
         */

        // label and Input Field for User Name
        JLabel username = new JLabel("Username");
        username.setBounds(40, 20, 100, 20);
        add(username);
        // Input Filed
        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150, 20);
        add(tfusername);

        // label and Input Field for password
        JLabel password = new JLabel("Password");
        password.setBounds(40, 70, 100, 20);
        add(password);
        // Input Filed
        tfpassword = new JPasswordField();
        tfpassword.setBounds(150, 70, 150, 20);
        add(tfpassword);

        // create a login button
        login = new JButton("Login");
        login.setBounds(40, 140, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        /* Set Action Listner in the log In button */
        login.addActionListener(this);
        login.setFont(new Font("serif", Font.BOLD, 15));
        add(login);

        // create a Cancel button
        cancel = new JButton("Cancel");
        cancel.setBounds(180, 140, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        /* Set Action Listner in the Cancel button */
        cancel.addActionListener(this);
        cancel.setFont(new Font("serif", Font.BOLD, 15));
        add(cancel);

        // Insert a Image in the Log in Frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);

        /*----------------------------- */
        setSize(600, 300);
        setLocation(500, 250);
        setVisible(true);

    }

    /*
     * when you click the button addActionListner function call
     * addActionListner function call the actionPerformed function internally
     * so if you want the working of the buttons
     * then wright your logic inside the actionPerformed function
     * Now Login button and Cancel button both use the same function
     * so to differnetiate that when which button is click
     * we use ActionEvent class
     * ActionEvent class track the source of the button
     */
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            // we want the username and password
            String username = tfusername.getText();
            String password = tfpassword.getText();

            // MySQL Querie
            String query = "select * from login where username='" + username + "'and password='" + password + "'";
            // Execute the query
            try {
                //first create the connection with mysql
                //create a object of the mySql class
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);

                if(rs.next())
                {
                    setVisible(false);
                    new Project();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Invalid Username & Password");
                    setVisible(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == cancel) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
