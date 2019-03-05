import java.util.Scanner;
public class Displayer {
    static Scanner keyboard = new Scanner(System.in);
    static boolean whileOne = true;
    static boolean whileTwo = true;
    public static void main(String[] args) {
        System.out.println("Welcome to GCF/Factor Finder!");
        //currently only works with ints, add float support later
        System.out.println("This program can find the factors of an integer, or the GCF (greatest common factor) of two integers!");
        while(whileOne) {
            whileTwo = true;
            while (whileTwo) {
                System.out.print("Type 'factor' for factor finder, and 'gcf' for GCF finder: ");
                String choice = keyboard.next();
                if (choice.equals("factor")) {
                    whileTwo = false;
                    System.out.print("Enter the integer to factor: ");
                    int choiceNum = keyboard.nextInt();
                    factors(choiceNum);
                }
                else if (choice.equals("gcf")) {
                    whileTwo = false;
                    System.out.print("Enter the first integer: ");
                    int choiceNum = keyboard.nextInt();
                    System.out.print("Enter the second integer: ");
                    int choiceNum2 = keyboard.nextInt();
                    gcf(choiceNum, choiceNum2);
                }
                else {
                    whileTwo = true;
                    System.out.println("Please enter a valid input.");
                }
            }
            System.out.print("Play again? Type 'y' for yes and 'n' for no: ");
            String playAgain = keyboard.next();
            if (playAgain.equals("n")) {
                whileOne = false;
            }
            else{
                whileOne = true;
            }
        }
    }
    public static void factors(int num) {
        for (int i = num; i > 0; i--) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
    public static void gcf(int num1, int num2) {
        if (num1 > num2) {
            for (int i = num2; i > 0; i--) {
                if (num1 % i == 0 && num2 % i == 0) {
                    System.out.println("The GCF of " + num1 + " and " + num2 + " is " + i);
                    break;
                }
            }
        }
        else if (num1 < num2) {
            for (int i = num1; i > 0; i--) {
                if (num1 % i == 0 && num2 % i == 0) {
                    System.out.println("The GCF of " + num1 + " and " + num2 + " is " + i);
                    break;
                }
            }
        }
        else{
            for (int i = num1; i > 0; i--) {
                if (num1 % i == 0 && num2 % i == 0) {
                    System.out.println("The GCF of " + num1 + " and " + num2 + " is " + i);
                    break;
                }
            }
        }
    }
}
