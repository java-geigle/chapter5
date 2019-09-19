package assignments;
// FixDebugFive3.java
// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher Housewares Department

import java.util.Scanner;
public class FixDebugFive3
{
    public static void main (String args[])
    {

        final int LOW = 111;
        final int HIGH = 9;
        final int CUTOFF = 500;
        Scanner input = new Scanner(System.in);
        calculateOutPut( LOW,HIGH,CUTOFF, input);
    }
    public static void calculateOutPut(int LOW,int HIGH,int CUTOFF,Scanner input)
    {
        int item;
        String output;

        System.out.println("Please enter item number");
        item = input.nextInt();
        if(item < LOW) output = "Item number too low";
        else
        if(item > HIGH)
            output = "Item number too high";
        else
        if(item > CUTOFF)
            output = "Valid - in Automotive Department";
        else
            output = "Valid - Item in Housewares Department";
        System.out.println(output);
    }
}

