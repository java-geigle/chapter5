package examples;

import javax.swing.*;

public class weekDay {
    public static void main(String[] args){
        String result;
        String day= JOptionPane.showInputDialog(null,"enter day of week");


        switch(day){

            case"monday":
                result = "reserve room for friday meeting ";
                break;
            case"tuesday":
                result = "prepare powerpoint slides";
                break;
            case"wednesday":
                result = "send out reminders ";
                break;
            case"thursday":
                result = "getting ready for football friday ";
                break;
            case"friday":
                result = "wear spirit wear for game SPACE THEME";
                break;
            default:
                result ="invalid";


        }
        JOptionPane.showMessageDialog(null,result);



    }
}
