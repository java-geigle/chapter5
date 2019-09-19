package assignments;

import javax.swing.*;

public class evenOdd {
    public static void main(String[] args){
        int numb;
        String temp = JOptionPane.showInputDialog(null,"enter a number");
        numb=Integer.parseInt(temp);
        String result;
        if (numb %2== 0){
            result= "even";

        }
        else
            result = "odd";
        message(result);
        input("x");

    }
    public static void message(String ALPHA){
        JOptionPane.showMessageDialog(null,ALPHA);

    }
    public static void input(String BRAVO) {
       int CHARLIE;
        String temp=JOptionPane.showInputDialog(null, BRAVO);
//       input type to convert it
        CHARLIE=Integer.parseInt(temp);
    }

}
