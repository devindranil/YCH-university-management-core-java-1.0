
import java.sql.*;
public class Conn {
    /*
     * JDBC Connection has 4 Stages
     *  (1)-Register the Driver Class
     *  (2)-Creating Connection String
     *  (3)-Creating Statement
     *  (4)-Executing MySQL Queries
     *  (5)-Closing the Connection
     */

    Connection c; //reference variable
    Statement s; //
    Conn(){

        try{
            // (1)-Register the Driver Class
            //Class.forName("com.mysql.cj.jdbc.Driver");
            //Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            System.out.println("Driver Loaded");
            // (2)-Creating Connection String
            /*
             * Connection String provides the information in which database you have connect
             */
            c= DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem","root", "123456789");
            System.out.println("Connection Established");
            // (3)
            s= c.createStatement();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /*public static java.beans.Statement createStatement() {
        return null;
    }*/
}
