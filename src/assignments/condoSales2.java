package assignments;

import javax.swing.*;

public class condoSales2 {
    public static void main(String[] args){
        int cost;
        int optCost=0;
        int total;
       String temp = JOptionPane.showInputDialog(null,"enter 1 for park view \n"+"2 for golf course view \n"+"3 for lake view");
        int input =Integer.parseInt(temp);




       if(input== 1){
           cost = 150000;
        JOptionPane.showMessageDialog(null,"you've chosen park view");}
       else if(input== 2){
            cost = 170000;
        JOptionPane.showMessageDialog(null,"you've chosen golf course view");}
       else if(input== 3){
            cost = 210000;
            JOptionPane.showMessageDialog(null,"you've chosen lake view");}
       else{
           cost =0;}

        String temp2 = JOptionPane.showInputDialog(null,"enter 1 for garage \n"+" 2 for parking space ");
        int option =Integer.parseInt(temp2);

        if(option==1) {
            optCost = 5000;
            JOptionPane.showMessageDialog(null, "you've chosen garage witch charges an additional $5000"); }
        else {

            JOptionPane.showMessageDialog(null, "you've chosen parking space");
        }

       total=cost+optCost;
       JOptionPane.showMessageDialog(null,"the total is "+total);




    }
}
