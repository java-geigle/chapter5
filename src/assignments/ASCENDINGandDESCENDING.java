package assignments;

import javax.swing.*;

public class ASCENDINGandDESCENDING {
    public static void main(String[] args){
        int entry1;
        int entry2;
        int entry3;
       String temp= JOptionPane.showInputDialog(null,"enter first number");
       entry1= Integer.parseInt(temp);
       String temp2= JOptionPane.showInputDialog(null,"enter second number");
       entry2= Integer.parseInt(temp2);
       String temp3= JOptionPane.showInputDialog(null,"enter third number");
       entry3= Integer.parseInt(temp3);
       String result="NOT ";
       String result2="VALID ";
       if (entry1 > entry2 && entry1 >entry3) {
           if (entry2 > entry3) {
                result = "ascending order " + entry3 + " " + entry2 + " " + entry1;
               result2 = "Descending order " + entry1 + " " + entry2 + " " + entry3;
            }
            else {
                result = "ascending order " + entry1 + " " + entry3 + " " + entry2;
                result2 = "Descending order " + entry3 + " " + entry1 + " " + entry2;
            }
        }
       else if(entry2 > entry1 && entry2 >entry3) {
           if (entry1 > entry3) {
               result = "ascending order " + entry3 + " " + entry1 + " " + entry2;
               result2 = "descending order " + entry2 + " " + entry1 + " " + entry3;
           } else {
               result = "ascending order " + entry1 + " " + entry3 + " " + entry2;
               result2 = "descending order " + entry2 + " " + entry3 + " " + entry1;

           }
       }
           else if(entry3 > entry1 && entry3 > entry2){
          if(entry1> entry2 ){
              result = "ascending order " + entry2 + " " + entry1 + " " + entry3;
              result2 = "descending order " + entry3 + " " + entry1 + " " + entry2;
          }
          else{
              result = "ascending order " + entry1 + " " + entry2 + " " + entry3;
              result2 = "descending order " + entry3 + " " + entry2 + " " + entry1;

          }
       }
        JOptionPane.showMessageDialog(null,result+"\n"+result2);
    }
    }