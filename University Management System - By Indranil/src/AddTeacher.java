import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;
//import com.toedter.calendar.JDateChooser;

public class AddTeacher extends JFrame implements ActionListener {
    JTextField tfname, tffname, tffaddress, tfphone, tfemail, tfX, tfXII, tfAdhar, tfdob;
    JLabel labelEmpID;
    JComboBox<String> cbCourse, cbBranch;
    JButton btnSubmit, btnCancel;
    // JDateChooser dobChooser;
    /*
     * create a object for random class
     * which create some random number for roll number
     */

    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);

    AddTeacher() {

        // for layout
        setSize(900, 700);
        setLocation(350, 50);
        setLayout(null); // cause we want our own layout

        // for heading
        JLabel heading = new JLabel("New Teacher Details");
        heading.setBounds(310, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);

        // name label
        JLabel labelName = new JLabel("Name");
        labelName.setBounds(50, 150, 100, 30);
        labelName.setFont(new Font("serif", Font.BOLD, 20));
        add(labelName);
        // name input box
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);

        // father name label
        JLabel labelFName = new JLabel("Fathers Name");
        labelFName.setBounds(400, 150, 200, 30);
        labelFName.setFont(new Font("serif", Font.BOLD, 20));
        add(labelFName);
        // father name input box
        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);

        // roll name label
        JLabel lblEmpID = new JLabel("Employee ID");
        lblEmpID.setBounds(50, 200, 200, 30);
        lblEmpID.setFont(new Font("serif", Font.BOLD, 20));
        add(lblEmpID);
        setVisible(true);

        // roll nameinput box
        labelEmpID = new JLabel("101" + first4);
        labelEmpID.setBounds(200, 200, 200, 30);
        labelEmpID.setFont(new Font("serif", Font.BOLD, 20));
        add(labelEmpID);
        setVisible(true);

        // date of birth
        JLabel lblDob = new JLabel("Date of Birth");
        lblDob.setBounds(400, 200, 200, 30);
        lblDob.setFont(new Font("serif", Font.BOLD, 20));
        add(lblDob);

        // date of birth input box
        tfdob = new JTextField();
        tfdob.setBounds(600, 200, 150, 30);
        add(tfdob);

        // date of birth input box
        /*
         * dobChooser = new JDateChooser();
         * dobChooser.setBounds(600, 200, 150, 30);
         * add(dobChooser);
         */

        // address label
        JLabel labeladdress = new JLabel("Address Name");
        labeladdress.setBounds(50, 250, 200, 30);
        labeladdress.setFont(new Font("serif", Font.BOLD, 20));
        add(labeladdress);
        // address name input box
        tffaddress = new JTextField();
        tffaddress.setBounds(200, 250, 150, 30);
        add(tffaddress);

        // phone number label
        JLabel labelPhone = new JLabel("Phone Number");
        labelPhone.setBounds(400, 250, 200, 30);
        labelPhone.setFont(new Font("serif", Font.BOLD, 20));
        add(labelPhone);
        // phone number input box
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);

        // Email Id
        JLabel labelemail = new JLabel("Email Id");
        labelemail.setBounds(50, 300, 200, 30);
        labelemail.setFont(new Font("serif", Font.BOLD, 20));
        add(labelemail);
        // Email Id input box
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);

        // Class X label
        JLabel labelX = new JLabel("Class X(%)");
        labelX.setBounds(400, 300, 200, 30);
        labelX.setFont(new Font("serif", Font.BOLD, 20));
        add(labelX);
        // Class X input box
        tfX = new JTextField();
        tfX.setBounds(600, 300, 150, 30);
        add(tfX);

        // Class XII label
        JLabel labelXII = new JLabel("Class XII(%)");
        labelXII.setBounds(50, 350, 200, 30);
        labelXII.setFont(new Font("serif", Font.BOLD, 20));
        add(labelXII);
        // Class XII input box
        tfXII = new JTextField();
        tfXII.setBounds(200, 350, 150, 30);
        add(tfXII);

        // Adhar Number label
        JLabel labelAdhar = new JLabel("Adhar Number");
        labelAdhar.setBounds(400, 350, 200, 30);
        labelAdhar.setFont(new Font("serif", Font.BOLD, 20));
        add(labelAdhar);
        // Adhar Number input box
        tfAdhar = new JTextField();
        tfAdhar.setBounds(600, 350, 150, 30);
        add(tfAdhar);

        // dropdown for course
        /*
         * JLabel labelCourse = new JLabel("Course");
         * labelCourse.setBounds(50, 400, 200, 30);
         * labelCourse.setFont(new Font("serif", Font.BOLD, 20));
         * add(labelCourse);
         * String course[] = { "B.Tech", "M.Tech", "BBA", "MBA", "BCA", "MCA" };
         * cbCourse = new JComboBox(course);
         * cbCourse.setBounds(200, 400, 150, 30);
         * cbCourse.setBackground(Color.WHITE);
         * add(cbCourse);
         */

        // dropdown for high education
        JLabel labelCourse = new JLabel("Highest Education");
        labelCourse.setBounds(50, 400, 200, 30);
        labelCourse.setFont(new Font("serif", Font.BOLD, 20));
        add(labelCourse);

        String course[] = { "B.Tech", "M.Tech", "BBA", "MBA", "BCA", "MCA" };
        cbCourse = new JComboBox<>(course);
        cbCourse.setBounds(200, 400, 150, 30);
        cbCourse.setBackground(Color.WHITE);
        add(cbCourse);

        // dropdown for department
        JLabel labelBranch = new JLabel("Department");
        labelBranch.setBounds(400, 400, 200, 30);
        labelBranch.setFont(new Font("serif", Font.BOLD, 20));
        add(labelBranch);

        String[] branch = { "CSE", "ECE", "EEE", "ME", "CE", "IT", "Not Applicable" };
        cbBranch = new JComboBox<>(branch);
        cbBranch.setBounds(600, 400, 150, 30);
        cbBranch.setBackground(Color.WHITE);
        add(cbBranch);

        // submit button
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(200, 450, 150, 30);
        btnSubmit.setBackground(Color.BLACK);
        btnSubmit.setForeground(Color.WHITE);
        btnSubmit.addActionListener(this);
        add(btnSubmit);

        // cancel button
        btnCancel = new JButton("Cancel");
        btnCancel.setBounds(400, 450, 150, 30);
        btnCancel.setBackground(Color.BLACK);
        btnCancel.setForeground(Color.WHITE);
        btnCancel.addActionListener(this);
        add(btnCancel);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnSubmit) {
            // taking all the values
            String fname = tfname.getText();
            String ffname = tffname.getText();
            String rollno = labelEmpID.getText();
            String dob = tfdob.getText();
            String address = tffaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String class_x = tfX.getText();
            String class_xii = tfXII.getText();
            String adhar = tfAdhar.getText();
            String course = (String) cbCourse.getSelectedItem();
            String branch = (String) cbBranch.getSelectedItem();

            // inserting into database

            try {
                String query = "insert into teacher values('"+fname+"', '"+ffname+"', '"+rollno+"', '"+dob+"', '"+address+"', '"+phone+"', '"+email+"', '"+class_x+"', '"+class_xii+"', '"+adhar+"', '"+course+"', '"+branch+"')";

                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Teacher Details Inserted Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }

    
        } else {
            setVisible(false);

        }
    }

    public static void main(String[] args) {
        new AddTeacher();
    }
}
