import java.io.*;
import java.util.Random;

class fillarrayexample {

	public static boolean isprime(int candidate) {
		int i = 0;
		boolean itisprime = true;

		for (i = 2; i < candidate; i++) {
			if ((candidate % i) == 0)
				itisprime = false;
		}

		return itisprime;
	}// isprime

	public static int getnextprime(int curprime) {
		
		while (!isprime(curprime))
			curprime += 2; // keep incrementing by 2 until "isprime" returns us a prime.

		return curprime;

	}// getnextprime

	public static void fillprimearray(int[] arraytofill) {
		int i;
		int curprime = 3;

		arraytofill[0] = 2;
		arraytofill[1] = 3;
		for (i = 2; i < 1000; i++) {
			curprime = getnextprime(curprime + 2); // because the next prime has to be at least 2 more than the current
													// prime!...all primes are odd (except for the number 2)
			arraytofill[i] = curprime;
		}
	}// fillprimearray

	public static void main(String args[]) {

		int i; // used to walk the primearray after we fill it.

		// Create the array
		int[] primearray = new int[1000];

		fillprimearray(primearray);

		for (i = 0; i < 100; i++) {
			System.out.print(primearray[i] + "  ");
			if ((i % 20 == 0))
				System.out.println();
		}

	}// main

}// fillarrayexample