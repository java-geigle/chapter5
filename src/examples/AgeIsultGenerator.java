package examples;

import javax.swing.*;

public class AgeIsultGenerator {
    public static void main(String[]args) {
        int age;
        String inputS = JOptionPane.showInputDialog(null, "enter your age ",
                "dialog", JOptionPane.INFORMATION_MESSAGE);
        age = Integer.parseInt(inputS);
        if (age < 12) {
            JOptionPane.showMessageDialog(null, "no kids on my christan minecraft server ");
        }
        else if (age >= 12 || age < 19) {
            JOptionPane.showMessageDialog(null, "you ficken frick when will you learn, when will you learn, your" +
                    " actions have cosquences");
        }
        else if (age >= 19 || age <25) {
            JOptionPane.showMessageDialog(null, "now listen here bucko you better get you some learn before you make words at me");

        }
        else if(age >= 25|| age <35) {
            JOptionPane.showMessageDialog(null, "According to all known laws of aviation, there is no known way a bee should fly");
        }
        else if (age >= 35 || age <45){
            JOptionPane.showMessageDialog(null,"do you are have stupid");
//            45  55 55+



        }



    }
}
