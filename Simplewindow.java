package simplewindow;

import javax.swing.*; 
import java.awt.*; 

public class Simplewindow extends JFrame 
{ 
    public static final int WIDTH = 300; 
    public static final int HEIGHT = 200; 
    public Simplewindow() 
    { 
        setSize(WIDTH,HEIGHT); 
        Container contentPane = getContentPane(); 
        JLabel label = new JLabel 
        ("Roberto Cervantes"); 
        contentPane.add(label); 
        contentPane.setBackground(Color.CYAN); 
        addWindowListener(new WindowDestroyer()); 
    } 
    public static void main(String[] args) 
    { 
        Simplewindow window = new Simplewindow(); 
        window.setVisible(true); 
    } 
}