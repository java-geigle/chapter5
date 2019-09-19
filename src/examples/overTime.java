package examples;

import javax.swing.*;

public class overTime {
    public static void main(String[] args){

        double hoursE;
        double pay = 10.50;
        double total;
        double otHours;

        String temp= JOptionPane.showInputDialog(null,"how many hours did you work");
        hoursE= Double.parseDouble(temp);

        if(hoursE > 40){
            otHours= hoursE - 40;
            total = (pay *40) + (otHours* (pay*1.5)) ;
            JOptionPane.showMessageDialog(null,"gross pay equals "+total);
        }
        else{
            total = pay * hoursE;
            JOptionPane.showMessageDialog(null,"your gross pay equals "+ total);
        }


    }

}
