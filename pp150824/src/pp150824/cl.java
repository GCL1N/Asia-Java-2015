package pp150824;

import  java.awt.*;  
import  java.awt.event.*;  
import  javax.swing.*;  

public  class  cl{
    static  int  i=0;
    public  static  void  main(String[]  args){
        JFrame  jf=new  JFrame("test")  ;  
        final  JLabel  jL  =  new  JLabel("test")  ;  
        jf.getContentPane().add(jL);
        jf.setSize(100,100);
        jf.setLocation(100,100);
        jf.setVisible(true)  ;  
        new  Timer(1000,new  ActionListener(){public  void  actionPerformed(ActionEvent  e){jL.setText("abc  "+(++i));}}).start();
    }

}