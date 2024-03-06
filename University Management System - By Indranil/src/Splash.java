//import java.awt.Image;
import javax.swing.*; //swing framework
import java.awt.*; // abstract window tool kit
/*
 * create a Splash class
 * Extends JFrame class
 * implements Multithreading by implements Runnable
 */
public class Splash extends JFrame implements Runnable{
    //declare the Thread class object
    Thread t;
    //create a constructor for the Splash() Class
    Splash(){
        /*
         * set a Image on the frame
         * create a ImageIcon class & object i1 to take the image
         * create a Image class & object i2 to scale the image on the frame
         * create a Jlabel image class object image 
         * pass the Jlabel image in add method
         */
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);//to add the image on the frame
        /*
         * create a the variable object of the thread class
         * to pass the current class reference pass this inside the Thread
         * call start method and start method internally call the run method
         */
        t = new Thread(this);
        t.start();

     //////////////////////////////////////////////////////////////////////////
        //setLocation(150, 0); //to set the location of the frame
        //setSize(1000, 700); //to set the width & height of the frame
    //////////////////////////////////////////////////////////////////////////

        setVisible(true); //to show the frame

        /*
         * we want the dynamic width and height of the image
         * scale the image size form small to large
         * set x =1
         * create a for loop
         * set i=2, i<=half_of_image_length, i++, x++
         * inside the loop put above two methods setLocation & setSize
         * do some random calculation according to your need
         * 
         */
        int x = 1;
        for(int i=2;i<=600; i+=4, x+=1)
        {
            setLocation(600-((i+x)/2),300-(i/2)); //to set the location of the frame
            setSize(i+3*x,i+x/2); //to set the width & height of the frame
            /*
             * we want some slowness to open the frame and image scale
             * for that use concept of multithreading 
             */
            try{
                Thread.sleep(10); //hold or pause the current execution
            }catch(Exception e) {}
        }
    }

    /*--------after openning the frame some second later we want to redirect on the new frame--------------- */
    /*
     * To override the abstract method we need to call that method in our class
     * use multithreading concept
     */
    public void run() {
        try{
            Thread.sleep(7000);
            setVisible(false); //to hide any frame
            //Open the Next Frame
            new Login();
        }catch(Exception e){}
    }
    //call the Splash class
    public static void main(String[] args) {
        new Splash();
    }
}
