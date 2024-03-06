import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;

public class Project extends JFrame implements ActionListener {

    Project() {

        // Insert a Background Image in the Log in Frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/myimage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        /*
         * To create a menubar in the Frame call JMenuBar class
         * To add this meneubar on the frame use setJMenuBar
         * To create a menus use JMenu class [Inside the JMenubar and setJMenuBar]
         * To show the newly created menus use add method in the JMenuBar object
         * and inside the add() pass the JMenu class object
         */
        JMenuBar mb = new JMenuBar();

        /*---------Create the menu--------------------*/
        /*--------------------New Information----------------------------- */
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);

        // Create the list items
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        //add action listener to the menu item
        facultyInfo.addActionListener(this);
        // add the list item inside the Menu where you want to show
        // for that you have to use the menu class object.add(JMenuItem objectName)
        newInformation.add(facultyInfo); // this will add the facultyInfo inside the newInformation

        // Create the list items
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);

        /*--------------------User Details----------------------------- */
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.RED);
        mb.add(details);

        // Create the list items
        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);

        // Create the list items
        JMenuItem studentdetails = new JMenuItem("View Student Deatils");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);

        /*--------------------leave----------------------------- */
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLUE);
        mb.add(leave);

        // Faculty Leave
        JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
        facultyLeave.setBackground(Color.WHITE);
        facultyLeave.addActionListener(this);
        leave.add(facultyLeave);

        // Student Leave
        JMenuItem studentLeave = new JMenuItem("Student Leave");
        studentLeave.setBackground(Color.WHITE);
        studentLeave.addActionListener(this);
        leave.add(studentLeave);

        /*--------------------leave Deatils----------------------------- */
        JMenu leaveDetails = new JMenu("Leave Deatils");
        leaveDetails.setForeground(Color.RED);
        mb.add(leaveDetails);

        // Create the list items
        JMenuItem facultyLeaveDetails = new JMenuItem("Faculty Leave Details");
        facultyLeaveDetails.setBackground(Color.WHITE);
        facultyLeaveDetails.addActionListener(this);
        leaveDetails.add(facultyLeaveDetails);

        // Create the list items
        JMenuItem studentLeaveDetails = new JMenuItem("Student Leave Details");
        studentLeaveDetails.setBackground(Color.WHITE);
        studentLeaveDetails.addActionListener(this);
        leaveDetails.add(studentLeaveDetails);

        /*--------------------Exam----------------------------- */
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLUE);
        mb.add(exam);

        // Create the list items
        JMenuItem examinationDetails = new JMenuItem("Examination Result");
        examinationDetails.setBackground(Color.WHITE);
        examinationDetails.addActionListener(this);
        exam.add(examinationDetails);

        // Create the list items
        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);

        /*--------------------Update Information----------------------------- */
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.RED);
        mb.add(updateInfo);

        // Create the list items
        JMenuItem updatefacultyInfo = new JMenuItem("Update Faculty Information");
        updatefacultyInfo.setBackground(Color.WHITE);
        updatefacultyInfo.addActionListener(this);
        updateInfo.add(updatefacultyInfo);

        // Create the list items
        JMenuItem updateStudentInfo = new JMenuItem("Update Student Information");
        updateStudentInfo.setBackground(Color.WHITE);
        updateStudentInfo.addActionListener(this);
        updateInfo.add(updateStudentInfo);

        /*--------------------Fees Details----------------------------- */
        JMenu fees = new JMenu("Fees Details");
        fees.setForeground(Color.BLUE);
        mb.add(fees);

        // Create the list items
        JMenuItem feesStructure = new JMenuItem("Fees Structure");
        feesStructure.setBackground(Color.WHITE);
        feesStructure.addActionListener(this);
        fees.add(feesStructure);

        // Create the list items
        JMenuItem feesForm = new JMenuItem("Student Fees Form");
        feesForm.setBackground(Color.WHITE);
        feesForm.addActionListener(this);
        fees.add(feesForm);

        /*--------------------Utility----------------------------- */
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.RED);
        mb.add(utility);

        // Create the list items
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        /* Set Action Listner in the Notepad button */
        notepad.addActionListener(this);
        utility.add(notepad);
        // Create the list items
        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setBackground(Color.WHITE);
        /* Set Action Listner in the calculator button */
        calculator.addActionListener(this);
        utility.add(calculator);
        /*--------------------About the Project----------------------------- */
        JMenu about = new JMenu("About");
        about.setForeground(Color.BLUE);
        about.addActionListener(this);
        mb.add(about);

        // Create the list items
        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        /* Set Action Listner in the Exit button */
        ab.addActionListener(this);
        about.add(ab);

        /*--------------------Exit the Project----------------------------- */
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.BLUE);
        mb.add(exit);

        // Create the list items
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        /* Set Action Listner in the Exit button */
        ex.addActionListener(this);
        exit.add(ex);

        setJMenuBar(mb);

        setSize(1540, 850);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand(); // It return the string which call
        if (msg.equals("Exit")) {
            setVisible(false);
        } else if (msg.equals("Calculator")) {
            // to open a calculator
            // there is a chance for exception
            try {
                // If calculator present in the system
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {

            }
        } else if (msg.equals("Notepad"))

        {
            // to open a notepad
            // there is a chance for exception
            try {
                // If notepad present in the system
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {

            }
        } else if(msg.equals("New Faculty Information")) {
            new AddTeacher();
        } else if(msg.equals("New Student Information")) {
            new AddStudent();
        } else if(msg.equals("View Faculty Details")) {
            new TeacherDetails();
        } else if(msg.equals("View Student Deatils")) {
            new StudentDetails();
        } else if(msg.equals("Faculty Leave")) {
            new TeacherLeave();
        } else if(msg.equals("Student Leave")) {
            new StudentLeave();
        } else if(msg.equals("Faculty Leave Details")) {
            new TeacherLeaveDetails();
        } else if(msg.equals("Student Leave Details")) {
            new StudentLeaveDetails();
        } else if(msg.equals("Enter Marks")) {
            new EnterMarks();
        } else if(msg.equals("Examination Result")) {
            new ExaminationDetails();
        } else if(msg.equals("Update Faculty Information")) {
            new UpdateTeacher();
        } else if(msg.equals("Update Student Information")) {
            new UpdateStudent();
        } else if(msg.equals("Fees Structure")) {
            new FeesStructure();
        } else if(msg.equals("About")) {
            new About();
        }  else if(msg.equals("Student Fees Form")) {
            new StudentFeeForm();
        }
    }

    public static void main(String[] args) {
        new Project();
    }
}
