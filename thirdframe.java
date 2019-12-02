
package vehicle_insurance;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class thirdframe extends Frame{
    BufferedImage bi;
    public void myframe(){
       
            try {
                bi=ImageIO.read(new File("C:\\Users\\admin\\Documents\\NetBeansProjects\\VEHICLE_INSURANCE\\Images\\payment.png"));
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
    public static void main (String[]args){
       thirdframe tf=new thirdframe();
                   tf.setVisible(true);
                   tf.setSize(400,350);
                   tf.setTitle("PAYMENT");
                   tf.setLocation(500,200);
                   tf.setLayout(null);
}
}

