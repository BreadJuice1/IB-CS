import java.util.Scanner;
import java.io.*;

class lab7 {
    public static int[] getfactors(int number) {
        int factor = 0;
        int factors[] = new int[number];
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                factors[factor] = i;
            factor++;
        }
        return factors;
    } // getfactors

    public static void fillprimearray(int[] fillarray) {
        int prime = 3;

        fillarray[0] = 2;
        fillarray[1] = 3;
        for (int i = 2; i < 1000; i++) {
            prime = getprime(prime + 2);

            fillarray[i] = prime;
        }
    } // fillprimearray

    private static int getprime(int prime) {
        while (!isprime(prime)) {
            prime += 2;
        }

        return prime;
    } // getprime

    private static boolean isprime(int input) {
        boolean itisprime = true;

        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                itisprime = false;
            }
        }
        return itisprime;
    }

    public static void main(String[] args) {
        int primearray[] = new int[1000];

        fillprimearray(primearray);
        programs(primearray);
    } // main

    private static void programs(int[] primearray) {
        Scanner in = new Scanner(System.in);

        System.out.println(
                "which program do you want to run? \n 1. find prime \n 2. primes between \n 3. prime factors \n input anything else to exit");
        int program = in.nextInt();

        switch (program) {
        case 1:
            findprime(primearray);
            programs(primearray);
        case 2:
            primesbetween(primearray);
            programs(primearray);
        case 3:
            primefactors(primearray);
            programs(primearray);
        default:
            break;
        }
    }

    private static void primefactors(int[] primearray) {
        Scanner in = new Scanner(System.in);
        int input;
        int factors[];

        System.out.println("what number do you want to factor?");
        input = in.nextInt();
        factors = getfactors(input);

        try {
            for (int i = 0; i <= factors.length; i++) {
                if (isprime(factors[i]) && factors[i] != 0)
                    System.out.println(factors[i]);
            }
        } catch (Exception ArrayIndexOutOfBoundsException) {
        }

    }

    private static void primesbetween(int primearray[]) {
        Scanner in = new Scanner(System.in);
        int boundary[] = new int[2];
        int buffer[] = new int[2];

        System.out.println("please input the boundarys");
        buffer[0] = in.nextInt();
        buffer[1] = in.nextInt();

        if (buffer[1] > buffer[0]) {
            boundary[0] = buffer[0];
            boundary[1] = buffer[1];
        }

        if (buffer[0] > buffer[1]) {
            boundary[1] = buffer[0];
            boundary[0] = buffer[1];
        }

        for (int i = 0; i < 1000; i++) {
            if (primearray[i] >= boundary[0] && primearray[i] <= boundary[1]) {
                System.out.println(primearray[i] + " ");
            }
        }

    } // primesbetween

    private static void findprime(int[] primearray) {
        Scanner in = new Scanner(System.in);

        System.out.println("which prime do you want?");
        int prime = in.nextInt();
        if (prime < 1 || prime > 1000) {
            System.out.print("please input a number between 1 and 1000");
            findprime(primearray);
        } // keep the input between 1 and 1000

        System.out.println(primearray[prime - 1]);
    } // findprime
} // lab 7