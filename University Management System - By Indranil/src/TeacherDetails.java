import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class TeacherDetails extends JFrame implements ActionListener {
    Choice cempID;
    JTable table;
    JButton search, print, update, add, cancel;

    TeacherDetails() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Search by Employee ID");
        heading.setBounds(20, 20, 150, 20);
        add(heading);

        cempID = new Choice();
        cempID.setBounds(180, 20, 150, 20);
        add(cempID);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from teacher");
            while (rs.next()) {
                cempID.add(rs.getString("empID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        table = new JTable();

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from teacher");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 900, 700);
        add(jsp);

        search = new JButton("Search");
        search.setBounds(20, 70, 80, 20);
        search.addActionListener(this);
        add(search);

        print = new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        print.addActionListener(this);
        add(print);

        add = new JButton("Add");
        add.setBounds(220, 70, 80, 20);
        add.addActionListener(this);
        add(add);

        update = new JButton("Update");
        update.setBounds(320, 70, 80, 20);
        update.addActionListener(this);
        add(update);

        cancel = new JButton("Cancel");
        cancel.setBounds(420, 70, 80, 20);
        cancel.addActionListener(this);
        add(cancel);
        setSize(900, 700);
        setLocation(300, 100);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == search) {
            try {
                Conn c = new Conn();
                String str = "select * from teacher where empID = '" + cempID.getSelectedItem() + "'";
                ResultSet rs = c.s.executeQuery(str);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception ae) {
                ae.printStackTrace();
            }
        } else if (e.getSource() == print) {
            try {
                table.print();
            } catch (Exception ae) {
                ae.printStackTrace();
            }
        } else if (e.getSource() == add) {
            setVisible(false);
            new AddTeacher();
        } else if (e.getSource() == update) {
            setVisible(false);
            new UpdateTeacher();
        } else if (e.getSource() == cancel) {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new TeacherDetails();
    }
}
