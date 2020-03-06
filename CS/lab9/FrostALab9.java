
import java.util.Scanner;

class FrostALab9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int program;

        System.out.println(
                "\n sum | 1 \n tables | 2 \n fibonacci sequence | 3 \n interest rate | 4 \n pattern | 5 \n yet more pics | 6 \n pot shots at pi | 7 \n ");
        program = in.nextInt();

        switch (program) {
            case 1:
                sum();
                main(args);
            case 2:
                tables();
                main(args);
            case 3:
                fibonacci();
                main(args);
            case 4:
                interest();
                main(args);
            case 5:
                pattern();
                main(args);
            case 6:
                pics();
                main(args);
            default:
                break;
        }
    }

    public static void sum() {
        long sum = 0;
        for (int i = 0; i <= 70000; i++) {
            sum += i;
        }
        System.out.println("the sum is " + sum);
    }

    public static void tables() {
        Scanner tables = new Scanner(System.in);
        int i;
        int j;
        int w;
        int h;
        System.out.print(" \n input the table dimensions (height then width): ");
        h = tables.nextInt();
        w = tables.nextInt();

        for (i = 1; i <= h; i++) {
            for (j = 1; j <= w; j++) {
                System.out.print(i * j + " ");
            }
            System.out.print("\n");
        }
    } // tables

    public static void fibonacci() {
        Scanner in = new Scanner(System.in);
        int n;
        int i;
        long [] fib = new long[3];
        fib[0] = 0;
        fib[1] = 1;
        System.out.print(" \n which number in the sequence do you want to find?");
        n = in.nextInt();
        for (i = 0; i < n; i++) {
            System.out.print(fib[0] + " ");
            fib[2] = fib[0] + fib[1];
            fib[0] = fib[1];
            fib[1] = fib[2];
        }

        System.out.println(fib[0]);
    } // fibonacci

    public static void interest() {
        double cash;
        double amount;
        double rate;
        Scanner in = new Scanner(System.in);

        System.out.print("\n" + "input the starting amount and rate (in that order)");
        cash = in.nextInt();
        rate = in.nextInt();

        amount = cash * Math.pow((1+rate/100),(30));
        double rounded = Math.round(amount * 100.0) / 100.0;
        System.out.print("\n" + "after 30 years, the amount is $" + rounded);
    } // interest

    public static void pattern() {
        int height;
        int width;
        Scanner in = new Scanner(System.in);
        System.out.print("\n" + "Enter the height then width: ");
        height = in.nextInt();
        width = in.nextInt();

        for (int i = 0; i < height; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < (width/2); j++) {
                    System.out.print("*");
                    System.out.print("0");
                } 
            } else if (i % 2 == 0) {
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }      
            }
            System.out.print("\n");
        }
        
    } // pattern

     public static void pics() {
        Scanner in = new Scanner(System.in);
        int height;
        int shape = -1;
        String strShape;
        do {
        System.out.println("\n" + "do you want to make an X or a diamond?");
        strShape = in.next();
        if (strShape.contains("x")) {
            shape = 0;
        } else if (strShape.contains("diamond")) {
            shape = 1;
        } else {
            System.out.println("\n" + "please choose a shape"); 
        }
        } while (shape < 0);

        System.out.println("\n" + "input height");
        height = in.nextInt();

        if (shape == 0) {
            xshape(height);
        } else if (shape == 1) {
           // diamond(height);
        } else {
            System.out.println("\n" + "bruh moment");
        }
     } // pics

     public static void xshape(int height) {
        int bruh;
        for (int i = -height; i <= height; i++) {
            System.out.print("*");
            if (Math.abs(i) % 2 == 0) System.out.print("\n");
            bruh = Math.abs(i);
            while (bruh > 0) {
                System.out.print(" ");
                bruh--;
            }
        }
     }
}