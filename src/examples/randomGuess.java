package examples;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class randomGuess {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

       Random rand = new Random();
       int choice;
       int rand1 = rand.nextInt(100)+1;
       System.out.println("please pick a number between 1 and 10 >>>>>");
       choice=input.nextInt();

       if (choice == rand1){
           System.out.println("you got it");
       }
       else if (choice > rand1){
           System.out.println("too high " + rand1);


       }
       else if (choice < rand1){
           System.out.println("too low " + rand1);
       }


    }
}
