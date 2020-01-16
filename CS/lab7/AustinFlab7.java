import java.util.Scanner;

class lab7 {

    public static void fillprimearray(int[] fillarray) {
        int prime = 0;

        for (int i = 0; i < 1000; i++) {
            prime = getprime(prime);
            fillarray[i] = prime;
        }
    } // fillprimearray

    private static int getprime(int prime) {
        while (!isprime(prime)) {
            prime += 1;
        }

        return prime;
    } // getprime

    private static boolean isprime(int prime) {
        boolean isprime = true;

        for (int i = 0; i < prime; i++) {
            if (prime % i == 0) {
                isprime = false;
            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        int primearray[] = new int[1000];

        fillprimearray(primearray);

        for (int i = 0; i < 1000; i++) {
            System.out.print(primearray[i] + " ");
        }
		// programs(primearray);
    } // main

    private static void programs(int[] primearray) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("which program do you want to run? \n 1. find prime \n 2. primes between \n 3. prime factors");
        int program = in.nextInt();
        
        switch (program) {
            case 1:
                findprime(primearray);
                programs(primearray);
            case 2:
                primesbetween();
                programs(primearray);
            case 3:
                primefactors();
                programs(primearray);
        } 
    }

    private static void primefactors() {
    }

    private static void primesbetween() {
    }

    private static void findprime(int[] primearray) {
        Scanner in = new Scanner(System.in);

        System.out.println("which prime do you want?");
        int prime = in.nextInt();
            if (prime < 1 || prime > 1000) {
                System.out.print("please input a number between 1 and 1000");
                findprime(primearray);
            } // keep the input between 1 and 1000
        
        System.out.println(primearray[prime - 1]);
    }
} // lab 7