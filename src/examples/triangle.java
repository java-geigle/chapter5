package examples;

import javax.swing.*;

public class triangle {
    public static void main(String[]args){
        int input;
        int input2;
        String in= JOptionPane.showInputDialog(null,"what are you solving for: \n" + "1 right triangle \n"+"2 for isosceles \n" +
                "3 for equilateral","woeugw",JOptionPane.INFORMATION_MESSAGE);
        input =Integer.parseInt(in);




        if(input == 1){
            String in2= JOptionPane.showInputDialog(null,"enter 1 to solve for perimeter or \n"+" enter 2 to solve side length ","wugw",JOptionPane.INFORMATION_MESSAGE);
            input2 =Integer.parseInt(in2);
            if(input2 == 2){
                right();
            }
            if (input2== 1){
                perimiter();
            }

        }
        if(input == 2){
            String in2= JOptionPane.showInputDialog(null,"enter 1 to solve for perimeter or \n"+" enter 2 to solve for height ","wugw",JOptionPane.INFORMATION_MESSAGE);
            input2 =Integer.parseInt(in2);
            if(input2 == 2){
                height();
            }
            if (input2== 1){
                perimiter();
            }

        }
        if(input == 3){
            String in2= JOptionPane.showInputDialog(null,"enter 1 to solve for perimeter or \n"+"enter 2 to solve for height ","wugw",JOptionPane.INFORMATION_MESSAGE);
            input2 =Integer.parseInt(in2);
            if(input2 == 2){
                height();
            }
            if (input2== 1){
                perimiter();
            }
            else{
                JOptionPane.showMessageDialog(null,"No");

        }

        }
    }
    public static void right() {
        double side1;
        double side2;
        String choice = JOptionPane.showInputDialog(null, "what side do you want to solve for \n" + "side a\n" + "side b \n" + "side c");

        if (choice.equalsIgnoreCase("a") ) {

            String temp = JOptionPane.showInputDialog(null, "please enter for side b");
            side1 = Double.parseDouble(temp);
            String temp1 = JOptionPane.showInputDialog(null, "please enter for side c");
            side2 = Double.parseDouble(temp1);
            rightMath(side1, side2, choice);

            }
        if (choice.equalsIgnoreCase("b") ) {

            String temp = JOptionPane.showInputDialog(null, "please enter for side a");
            side1 = Double.parseDouble(temp);
            String temp1 = JOptionPane.showInputDialog(null, "please enter for side c");
            side2 = Double.parseDouble(temp1);
            rightMath(side1, side2, choice);

        }
        if (choice.equalsIgnoreCase("c") ) {

            String temp = JOptionPane.showInputDialog(null, "please enter for side a");
            side1 = Double.parseDouble(temp);
            String temp1 = JOptionPane.showInputDialog(null, "please enter for side b");
            side2 = Double.parseDouble(temp1);
            rightMath(side1, side2, choice);
        }
    }
        public static void rightMath ( double side1, double side2,String choice){
                double notc;
                notc = Math.sqrt((side2 * side2) - (side1 * side1));
                JOptionPane.showMessageDialog(null,"the side "+choice +" is "+notc+".");


        }
        public static void rightMathc ( double side1, double side2,String choice) {
        double c;
        c = Math.sqrt((side2 * side2) + (side1 * side1));
        JOptionPane.showMessageDialog(null, "the side " + choice + " is " + c + ".");
    }

    public static void perimiter(){
        double side1;
        double side2;
        double side3;
        double total;
        String temp =JOptionPane.showInputDialog(null,"enter base");
        side1 = Double.parseDouble(temp);
        String temp1 =JOptionPane.showInputDialog(null,"enter side ");
        side2 = Double.parseDouble(temp1);
        String temp2 =JOptionPane.showInputDialog(null,"enter side 2");
        side3 = Double.parseDouble(temp2);
        total= side1 +side2+ side3;
        JOptionPane.showMessageDialog(null,"the perimeter is "+total+".");

    }
    public static void height(){
        double side1;
        double side2;
        double total;
        String temp =JOptionPane.showInputDialog(null,"enter base");
        side1 = Double.parseDouble(temp);
        String temp1 =JOptionPane.showInputDialog(null,"enter side ");
        side2 = Double.parseDouble(temp1);
        total = (side2*side2)-(side1/2);
        JOptionPane.showMessageDialog(null,"the height is "+total);





    }



}
