import java.util.Scanner;
import java.lang.Math;

// Austin Frost

class lab4 {
    public static void sigma() {
        Scanner in = new Scanner(System.in);

        System.out.print("input number:");
        double num = in.nextDouble();
        in.close();

        double sum = 0;
        for (double i = 1; i <= num; i++) {
            sum = sum + i;
            if (i < num) {
                System.out.print(i + " +" + " ");
            } else {
                System.out.print(i);
            }
        } // for

        System.out.print("=" + sum);

    } // sigma

    public static void grades() {
        Scanner grades = new Scanner(System.in);

        int grade = 0;
        int average = 0;
        int counter = 0;
        String averageGrade = "";
        int amountA = 0;
        int amountB = 0;
        int amountC = 0;
        int amountD = 0;
        int amountF = 0;

        do {
            System.out.print("input grade:");

            grade = extracted(grades);

            if (grade != -1) {
                average = (average * counter + grade) / (counter + 1);

                if (grade >= 90) {
                    amountA++;
                } else if (grade >= 80 && grade < 90) {
                    amountB++;
                } else if (grade >= 70 && grade < 80) {
                    amountC++;
                } else if (grade >= 60 && grade < 70) {
                    amountD++;
                } else {
                    amountF++;
                }
            }
            counter++;

        } while (grade != -1);

        if (average >= 90) {
            averageGrade = "A";
        } else if (average >= 80 && average < 90) {
            averageGrade = "B";
        } else if (average >= 70 && average < 80) {
            averageGrade = "C";
        } else if (average >= 60 && average < 70) {
            averageGrade = "D";
        } else {
            averageGrade = "F";
        }

        System.out.println("the average is " + averageGrade);
        System.out.println(amountA + " studnets got an A");
        System.out.println(amountB + " students got a B");
        System.out.println(amountC + " students got a C");
        System.out.println(amountD + " students got a D");
        System.out.println(amountF + " students got a F");

        grades.close();
    } // grades

    public static void reciprocal() {

        Scanner in = new Scanner(System.in);

        double num = 0;
        double sum = 0;
        double recip = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.print("input a number:");
            num = in.nextDouble();
            if (num == 0) {
                System.out.println("do you want to stop adding numbers? y or n");
                String ans = in.next();
                if (ans.contains("y")) {
                    System.out.print(sum);
                }
            } else {
                recip = 1 / num;
                sum += recip;
                System.out.println(sum);
            }
        }
        in.close();
    } // reciprocal

    public static void lcm() {
        Scanner in = new Scanner(System.in);
        System.out.print("plesase input two numbers:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        in.close();
        int LCM = (num1 > num2) ? num1 : num2;
        int gcd = 1;

        // LCM
        while (!((LCM % num1) == 0 && (LCM % num2 == 0))) {

            if ((LCM % num1) == 0 && (LCM % num2 == 0)) {
                System.out.print("the LCM is " + LCM);
            } else {
                LCM++;
            }
        }

        // GCD
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }
        System.out.print("\n the GCD is " + gcd);

    } // lcm

    public static void sqrt() {
        Scanner in = new Scanner(System.in);
        System.out.print("input a number: ");
        int num = in.nextInt();
        System.out.print("input the number of iterations: ");
        int iterations = in.nextInt();
        in.close();

        // initial guess
        double guess;
        int length;

        length = Double.valueOf(num).toString().length();
        guess = Math.pow(1, (length / 2));

        // iterations
        int counter = 1;
        while (counter <= iterations) {
            guess = (guess + num / guess) / 2;
            System.out.println(guess);
            counter++;
        }
        System.out.print("the square root is " + guess);

    } // sqrt

    public static void main(String[] args) {
        Scanner program = new Scanner(System.in);
        int prognum;

        while (true) {

            System.out.println("which problem do you want to run?");

            prognum = program.nextInt();

            switch (prognum) {
            case 1:
                sigma();
                break;
            case 2:
                grades();
                break;
            case 3:
                reciprocal();
                break;
            case 4:
                lcm();
                break;
            case 5:
                sqrt();
                break;
            } // switch
        } // while
    } // main

    private static int extracted(Scanner program) {
        int prognum;
        prognum = program.nextInt();
        return prognum;
    }
} // class