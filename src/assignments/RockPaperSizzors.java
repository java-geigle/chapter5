package assignments;

import javax.swing.*;
import java.util.Random;

public class RockPaperSizzors {
    public static void main(String[] args){

        String input=JOptionPane.showInputDialog(null,"enter rock paper or scissors ");

        Random rand = new Random();
        int rps = rand.nextInt(3)+1;
        meth(rps,input);

    }
    public static void meth(int rps,String input){
        String result=null;
        String comprps=null;

        if(rps==1)
            comprps="rock";
        if(rps==2)
            comprps="paper";
        if(rps==3)
            comprps="scissors";
        switch(input){
            case("rock"):
                if(rps==1)
                    result="it was a tie";
                if(rps==2)
                    result="you lose";
                if (rps==3)
                    result="a winner is you";
                break;
            case("paper"):
                if(rps==1)
                    result="A WINNER IS YOU!";
                if(rps==2)
                    result="a tie";
                if (rps==3)
                    result="you lose";
                break;
            case("scissors"):
                if(rps==1)
                    result="you lost";
                if(rps==2)
                    result="A WINNER IS YOU";
                if (rps==3)
                    result="a tie";
                break;
        }
        JOptionPane.showMessageDialog(null,"your choice: " + input + "\n" + "computers choice: " + comprps + "\n" + "result: "+result);
    }
    
}

