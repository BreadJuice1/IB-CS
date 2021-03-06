import java.io.*;
import java.util.Random;
import java.util.Scanner;

class AustinFlab6 {
    public static void pyramid(String[] args) {
        int height = 0;
        int i = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("what number do you want to start at?");
        height = in.nextInt();

        for (int j = height - 1; j > 0; j--) {
            for (i = j; i <= height; i++) {
                System.out.print(j + "   ");
            }
            System.out.println();
        }
    } // method

    public static void game(String[] args) {
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
    } // method

    public static void box(String[] args) {
        int height;
        int width;
        String box = "";
        Scanner in = new Scanner(System.in);

        System.out.print("input the height and width seperated by a space:");
        height = in.nextInt();
        width = in.nextInt();

        int w = width;
        int h = height;
        while (w > 0) {
            box += "*";
            w--;
        } // top
        System.out.println(box);

        box = "*";

        while (h > 2) {

            w = width;

            while (w > 2) {
                box += " ";
                w--;
            } // middle
            if (w != 1) {
                box += "*";
            }
            System.out.println(box);
            box = "*";
            h--;
        } // height

        box = "";
        w = width;

        if (h != 1) {
            while (w > 0) {
                box += "*";
                w--;
            } // bottom
        }
        System.out.println(box);

    } // method

    public static void factorials(String[] args) {
        long sum = 1;
        int number;
        int counter;
        Scanner in = new Scanner(System.in);

        System.out.print("input a number:");
        number = in.nextInt();
        counter = 0;

        for (int j = number; j > 0; j--) {
            for (int i = j; i > 0; i--) {
                System.out.print(i);
                sum = sum * i;
                if (i == j) {
                    System.out.print("! = " + i);
                }
                if (i != 1) {
                    System.out.print(" x ");
                } // if
            } // i
            System.out.println(" = " + sum);
            sum = 1;
        } // j
    } // method

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int prognum;

        System.out.print(
                "which program do you want to run? \n 1. guessing game \n 2. pyramid \n 3. rectangle \n 4. factorials \n 5. exit \n");
        prognum = in.nextInt();

        switch (prognum) {
        case 1:
            game(args);
            main(args);
            break;
        case 2:
            pyramid(args);
            main(args);
            break;
        case 3:
            box(args);
            main(args);
            break;
        case 4:
            factorials(args);
            main(args);
            break;
        case 5:
            break;
        } // switch

    } // main

} // class