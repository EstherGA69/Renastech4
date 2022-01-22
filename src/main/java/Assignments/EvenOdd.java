package Assignments;
import java.util.Scanner;
public class EvenOdd {


    public static void main(String[] args) {
        int num;
        System.out.println("Enter an integer number");

        Scanner input = new Scanner (System.in);
        num = input.nextInt();

        if (num % 3==0)
        System.out.println("You got the lucky number");

        else
        System.out.println("Next time");


    }




}
