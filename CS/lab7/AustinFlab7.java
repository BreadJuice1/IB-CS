import java.util.Scanner;

class lab7 {

    public static void main(String[] args) {
   fillprimearray(primearray);
    } // main

    public static void fillprimearray(long[] primearray) {
        primearray = new long[1000];

        for (int i = 0; i < 1000; i++) {
            if (i % primearray[i - 1] == 0) {
                primearray[i] = i;
             }
        }
    } // fillprimearray
} // Primes