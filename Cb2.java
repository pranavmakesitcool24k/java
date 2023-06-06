/* Write a program to develop a frame to select the different states of india using Jcombobox @pranav*/
import javax.swing.*;   
public class Cb2 {   
 
Cb2(){   
  JFrame f=new JFrame();   
    String s[]={"Maharashtra","Punjab","Gujrat","TamilNadu"};       
    JComboBox cb=new JComboBox(s);   
    cb.setBounds(50, 50,90,20);   
    f.add(cb);       
    f.setLayout(null); 
    f.setTitle("States");  
    f.setSize(400,400);   
    f.setVisible(true);       
}   
public static void main(String[] args) {   
    new Cb2();       
}   
}