
package vehicle_insurance;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author devendra
 */
public class VEHICLE_INSURANCE {

    public static void main(String[] args) {
       firstframe f1 =   new firstframe();
       f1.myframe();
       Label l0=    new Label("USER DETAILS");
       l0.setBounds(220,50,140,20);
       Font myFont0 = new Font("Serif",Font.BOLD,15);
       l0.setFont(myFont0);
       l0.setForeground(Color.black);
        
       
       Label l1=    new Label("NAME");
       l1.setBounds(130,120,100,25);
       Font myFont1 = new Font("Serif",Font.BOLD,12);
       l1.setFont(myFont1);
       l1.setForeground(Color.blue);
       TextField t1=new TextField();
       t1.setBounds(320,120,150,25);
       
       
       Label l2=    new Label("PHONE NO");
       Font myFont2 = new Font("Serif",Font.BOLD,12);
       l2.setFont(myFont2);
       l2.setBounds(130,180,100,25);
       l2.setForeground(Color.blue);
       TextField t2=new TextField();
       t2.setBounds(320,180,150,25);
       
       
       Label l3=    new Label("VEHICLE TYPE");
       l3.setBounds(130,240,100,25);
       Font myFont3 = new Font("Serif",Font.BOLD,12);
       l3.setFont(myFont3);
       l3.setForeground(Color.blue);
       Choice c1 =new Choice();
       c1.add("SELECT");
       c1.add("LMV");
       c1.add("MCWG");
       c1.add("MCWOG");
       c1.setBounds(320,240,100,25);
       
       
       Label l4=    new Label("E-MAIL");
       l4.setBounds(130,300,100,30);
       Font myFont4 = new Font("Serif",Font.BOLD,12);
       l4.setFont(myFont4);
       l4.setForeground(Color.blue);
       TextField t4=new TextField();
       t4.setBounds(320,300,150,25);
       
      
       Button b1=new Button("NEXT");
       b1.setBounds(250,360,60,40);
       Font myFont5 = new Font("Serif",Font.BOLD,12);
       b1.setFont(myFont5);
       
      
       f1.setTitle("USER DEAILS");
       f1.setLayout(null);
       f1.setLocation(500,200);
       f1.setSize(600,550);
       f1.setVisible(true);
       f1.add(l0);f1.add(l1);f1.add(l2);f1.add(l3);f1.add(l4);
       f1.add(t1);f1.add(t2);f1.add(c1);f1.add(t4);
       f1.add(b1);
       
       
       b1.addActionListener(new ActionListener(){
   
           @Override
           public void actionPerformed(ActionEvent event) {
              
       
               if(event.getActionCommand().equals("NEXT")){
                String str1=l1.getText()+":"+t1.getText()+"\r\n";
                String str2=l2.getText()+":"+t2.getText()+"\r\n";    
                String str3=l3.getText()+":"+c1.getSelectedItem()+"\r\n";  
                String str4=l4.getText()+":"+t4.getText()+"\r\n";  
                 
                byte bb1[]=str1.getBytes();
                byte bb2[]=str2.getBytes();
                byte bb3[]=str3.getBytes();
                byte bb4[]=str4.getBytes();
                if(t1.getText().isEmpty()||t2.getText().isEmpty()||t4.getText().isEmpty()||(c1.getSelectedItem()=="SELECT")){
                    if(!t1.getText().isEmpty()&&!t2.getText().isEmpty()&&!t4.getText().isEmpty()&&(c1.getSelectedItem()=="SELECT"))
                    {
                        JOptionPane.showMessageDialog(null, "Please select vehicle Type !");
                        return;
                    }
                    else{
                    JOptionPane.showMessageDialog(null,"Please fill all the field !");
                    return;
                    }
                } 
                
             try{
                 File f1=new File("DATA");
                 f1.mkdir();
                 FileOutputStream f= new FileOutputStream("DATA/"+l0.getText()+".txt");
                 f.write(bb1);
                 f.write(bb2);
                 f.write(bb3);
                 f.write(bb4);
                 }
             
      catch(Exception e)
      {
        System.out.println(e.getMessage());
      }    
        f1.dispose();
        
           
       secondframe fr = new secondframe();
       fr.setTitle("VEHICLE DETAILS");
       fr.setLayout(null);
       fr.setLocation(500,200);
       fr.setSize(400,350);
       fr.setVisible(true);
       fr.myframe();
         
       
       Label l0= new Label("VEHICLE DETAILS");
       l0.setBounds(220,50,140,20);
       Font myFont0 = new Font("Serif",Font.BOLD,15);
       l0.setFont(myFont0);
       l0.setForeground(Color.red);
     
       
       final Label l1=    new Label("MANUFACTURE");
       l1.setBounds(120,120,100,25);
       Font myFont1 = new Font("Serif",Font.BOLD,12);
       l1.setFont(myFont1);
    
       
        final Label l2=    new Label("COMPANY NAME");
       l2.setBounds(120,185,140,25);
        Font myFont2 = new Font("Serif",Font.BOLD,12);
       l2.setFont(myFont2);
       
       
       final Label l3=    new Label("INSURANCE");
       l3.setBounds(120,250,100,25);
        Font myFont3 = new Font("Serif",Font.BOLD,12);
       l3.setFont(myFont3);
     
       
       final Choice c1 =new Choice();
       c1.add("YEAR");
       c1.add("2010");
       c1.add("2011");
       c1.add("2012");
       c1.add("2013");
       c1.add("2014");
       c1.add("2015");
       c1.setBounds(320,120,100,25);
       
       
        final Choice c2 =new Choice();
       c2.add("SELECT");
       c2.add("TOYTOA");
       c2.add("MARUTI");
       c2.add("FORD");
       c2.add("AUDI");
       c2.add("BMW");
       c2.add("PORCHE");
       c2.setBounds(320,185,100,25);
       final Choice c3 =new Choice();
       c3.add("UPTO");
       c3.add("1 YEAR");
       c3.add("2 YEAR");
       c3.add("3 YEAR");
       c3.add("4 YEAR");
       c3.add("5 YEAR");
       c3.add("6 MONTHS");
       c3.setBounds(320,250,100,25);
      
       Button b1=new Button("NEXT");
       b1.setBounds(240,320,60,25);
       Font myFont14= new Font("Serif",Font.BOLD,12);
      
      
       fr.add(l1);fr.add(l2);fr.add(l3);fr.add(l0);
       fr.add(c1);fr.add(c2);fr.add(c3);
       fr.add(b1);
       
       
        b1.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent event) {
          
               
               if(event.getActionCommand().equals("NEXT")){
                   
		
                      String str1=l1.getText()+":"+c1.getSelectedItem()+"\r\n";  
                      String str2=l2.getText()+":"+c2.getSelectedItem()+"\r\n";     
                      String str3=l3.getText()+":"+c3.getSelectedItem()+"\r\n";
                     if(c1.getSelectedItem()=="YEAR"){
                         JOptionPane.showMessageDialog(null, "Please select Year !");
                            return;
                     }
                     if(c2.getSelectedItem()=="SELECT"){
                         JOptionPane.showMessageDialog(null, "Please select COMPANY NAME !");
                         return;
                     }
                     if(c3.getSelectedItem()=="UPTO"){
                         JOptionPane.showMessageDialog(null, "Please select INSURANCE !");
                         return;
                     }
                 
                      byte bb1[]=str1.getBytes();
                      byte bb2[]=str2.getBytes();
                      byte bb3[]=str3.getBytes();
                 try{
                     FileOutputStream f= new FileOutputStream("DATA/"+l0.getText()+".txt");
                     f.write(bb1);
                     f.write(bb2);
                     f.write(bb3);
                      }
                          catch(Exception e)
                          {
                              System.out.println(e.getMessage());
                           }
                 fr.dispose();

                
                thirdframe tf=new thirdframe();
                   tf.setVisible(true);
                   tf.setSize(400,350);
                   tf.setTitle("PAYMENT");
                   tf.setLocation(500,200);
                   tf.setLayout(null);
                  tf.myframe();
                 
                 
                  Label l0=    new Label("PAYMENT");
                  l0.setBounds(230,75,90,25);
                  Font myFont0 = new Font("Serif",Font.BOLD,15);
                  l0.setFont(myFont0);
                  l0.setForeground(Color.red);
                  
                  
                   Label l1=    new Label("INSURANCE");
                  l1.setBounds(120,150,100,20);
                  Font myFont1 = new Font("Serif",Font.BOLD,12);
                  l1.setFont(myFont1);
                  l1.setForeground(Color.blue);
                  
                  
                  
                  Label l2=    new Label("AMOUNT");
                  l2.setBounds(120,190,100,25);
                  Font myFont2 = new Font("Serif",Font.BOLD,12);
                  l2.setFont(myFont2);
                  l2.setForeground(Color.blue);
                  

                  Label l3=    new Label("MODE");
                  l3.setBounds(120,230,100,25);
                  Font myFont3 = new Font("Serif",Font.BOLD,12);
                  l3.setFont(myFont3);
                  l3.setForeground(Color.blue);
                  
                    
                   Choice c1 =new Choice();
                   c1.add("SELECT");
                   c1.add("FIRST PARTY");
                   c1.add("SECOND PARTY");
                   c1.add("FIRST+SECOND");
                   c1.add("COMPREHENSIVE");
                   c1.add("1 + 5 YEARS");
                   c1.add("2 + 2 YEARS");
                   c1.setBounds(320,150,140,25);
                    
               
                    Choice c2 =new Choice();
                   c2.add("SELECT IN ORDER");
                   c2.add("1000");
                   c2.add("2000");
                   c2.add("3000");
                   c2.add("4000");
                   c2.add("5000");
                   c2.add("6000");
                   c2.setBounds(320,190,140,25);
                   
                   
                    Choice c3 =new Choice();
                   c3.add("SELECT");
                   c3.add("CREDIT");
                   c3.add("DEBIT");
                   c3.add("NET BANKING");
                   c3.add("OTHERS");
                   c3.setBounds(320,230,140,25);
                   
                   Label l4= new Label("CAPTCHA");
                   l4.setBounds(120,270,100,25);
                   TextField t4 = new TextField();
                   Random rn = new Random(); 
                   int i = rn.nextInt(5000);
                   System.out.println(i);
                   t4.setText( Integer.toString(rn.nextInt(5000)));
                   t4.setBounds(320,270,100,20);
                   Font myFont4 = new Font("Serif",Font.BOLD,12);
                   l4.setFont(myFont4);
                   l4.setForeground(Color.blue);
                   
                   Label l5= new Label("RE-ENTER");
                   l5.setBounds(120,310,100,20);
                   TextField t5 = new TextField();
                   t5.setBounds(320,310,100,25);
                   Font myFont6 = new Font("Serif",Font.BOLD,12);
                   l5.setFont(myFont6);
                   l5.setForeground(Color.blue);
                   
                   
                   tf.add(l1);tf.add(l2);tf.add(l3);tf.add(l4);
                   tf.add(t4);tf.add(l5);tf.add(t5);
                   
       
                    Button b1=new Button("SUBMIT");
                    b1.setBounds(250,375,60,30);
                    Font myFont7 = new Font("Serif",Font.BOLD,12);
                    b1.setFont(myFont7);

                    
                    tf.add(b1);tf.add(l1);tf.add(l0);
                    tf.add(c1);tf.add(l2);   
                    tf.add(c2);tf.add(l3);
                    tf.add(c3);
    
          
                    
                      b1.addActionListener(new ActionListener(){
                      @Override
                        public void actionPerformed(ActionEvent event) {
                             try{
                                    Integer.parseInt(t5.getText());
                                }catch(Exception e){
                                    JOptionPane.showMessageDialog(null, "Captcha Incorrect");
                                }
                            if(event.getActionCommand().equals("SUBMIT")){
                                if(c1.getSelectedItem()=="SELECT"||c2.getSelectedItem()=="SELECT IN ORDER"||c3.getSelectedItem()=="SELECT"||t5.getText().isEmpty()){
                                        JOptionPane.showMessageDialog(null, "Please fill all the field !");
                                        return;
                                    }
                                
                                else if((Integer.parseInt(t5.getText()))==Integer.parseInt(t4.getText())){
                                    JOptionPane.showMessageDialog(null, "SUCESSFULLY DONE");
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Captcha Incorrect !");
                                    return;
                                }
                                     String str1=l1.getText()+":"+c1.getSelectedItem()+"\r\n";  
                                     String str2=l2.getText()+":"+c2.getSelectedItem()+"\r\n";     
                                     String str3=l3.getText()+":"+c3.getSelectedItem()+"\r\n";
                                    
                                    byte bb1[]=str1.getBytes();
                                    byte bb2[]=str2.getBytes();
                                    byte bb3[]=str3.getBytes();
                                    
                                    
                                    try{
                                    
                                        FileOutputStream f= new FileOutputStream("DATA/"+l0.getText()+".txt");
                                             f.write(bb1);
                                             f.write(bb2);
                                             f.write(bb3);
                                              }
                                    
                                                  catch(Exception e)
                                                  {
                                                    System.out.println(e.getMessage());
                                                  }
                                       tf.dispose();
                 
                                                      
                                                      
                                                      
                                          
                                       
                                               
                                            
                                                   
                            
                                                               }
                                                           }
                                                        });
                                                       }

                                                }

                                                       });        

                                                               }
           }
       });
        
               
    }
}

                                       
 
      
    
                 

