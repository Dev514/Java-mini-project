/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle_insurance;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Devendra
 */
public class secondframe extends Frame{

    BufferedImage bi;
    public void myframe(){
       
            try {
                bi=ImageIO.read(new File("C:\\Users\\admin\\Documents\\NetBeansProjects\\VEHICLE_INSURANCE\\Images\\car1.jpg"));
            } catch (java.io.IOException ex) {
                Logger.getLogger(secondframe.class.getName()).log(Level.SEVERE, null, ex);
            }
       
          setSize(600,550);
          setVisible(true);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(bi,0,0,getWidth(),getHeight(),null);
    }
   
    public static void main (String[]args)
    {
      new secondframe().myframe();
    secondframe fr = new secondframe(); 
         fr.setTitle("VEHICLE DEAILS");
         fr.setLayout(null);
         fr.setLocation(500,200);
         fr.setSize(500,350);
         fr.setVisible(true);
    


    }  

}