package assignments;

import javax.swing.*;

public class CellPhoneService {
    public static void main(String[] args){

        String result=null;

        String temp=JOptionPane.showInputDialog(null,"how many minutes do you use");
        int min=Integer.parseInt(temp);

        String temp1=JOptionPane.showInputDialog(null,"how many text messages are you going to send");
        int txt=Integer.parseInt(temp1);

        String temp2=JOptionPane.showInputDialog(null,"how many minutes do you use");
        int gb=Integer.parseInt(temp2);

        if (min < 500 && txt == 0 && gb == 0)
            result="plan A for $49";
        else if (min < 500 && txt >= 1 && gb == 0)
            result="plan B for $55";
        else if (min >= 500 && txt <= 100 && gb == 0)
            result="plan C for $61";
        else if (min < 500 && txt >= 100 && gb == 0)
            result="plan D for $70";
        else if (min < 500 && txt >= 1 && gb <= 2)
            result="plan E for $79";
        else if (min < 500 && txt >= 1 && gb >= 2)
            result="plan F for $87";

        JOptionPane.showMessageDialog(null,"");




    }
}
