import java.io.*;
import java.util.Random;
import java.util.Scanner;

class game {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int number = rand.nextInt(1001);
        int guess = 0;

        do {
            System.out.print("guess a number between 0 and 1000:");
            guess = in.nextInt();
            if (guess > number) {
                System.out.println("too high");
            } else if (guess < number) {
                System.out.println("too low");
            }
        } while (guess != number);
        System.out.println("you found the number!");
    } // main
} // class