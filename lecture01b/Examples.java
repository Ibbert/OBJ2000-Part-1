package lecture01b;

import javax.swing.JOptionPane;

public class Examples{
    
    void jhfg(){
       int x = 3;
       int a = 6757; 
    }
    
    public static void main(String args[]){
        int x = 5;
        int y = 7;
        double z, m, n;
        int a = 2, b = 5, c;
        boolean isItPayday = false;
        int creditDays = 30;
        boolean isBigger = b > a;
        
        char myMiddleInitial = 'M';
        c = b - a;
        x = y * c - 2;
        
        x = 5;
        x = 7;
        
        System.out.println("Value of x is " + x + "!");
        JOptionPane.showMessageDialog (null, "Value of x is " + x + "!");
        
        final double PI = 3.14;
        double radius = 5.0, area;
        area = radius * radius * PI;
        
        System.out.println("Area of the circle is " + area + "!");
        
        int threshold = 3000;
        int ammount = 5000;
        boolean exceeded;
        exceeded = ammount > threshold;
    }
}
