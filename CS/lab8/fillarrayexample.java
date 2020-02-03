import java.io.*;
import java.util.Random;


class fillarrayexample {
	//To understand this code, go to the main method and work your way through the code. Study the
	//code in each routine and follow the logic.
	
public static boolean isprime(int candidate) {
	/*This routine's only job is to see if the number passed to it is prime. If any
	  numbers less than the candidate divide the candidate evenly, then it isn't prime.
	  Yes, there are little optimizations we can do but this is meant to show that we
	  have ABSTRACTED out the question of "isprime" to it's own method and now could
	  be used by any other method in my program.
	*/
	int i = 0;
	boolean itisprime = true;
	
	for (i = 2; i<candidate; i++) {
		if ((candidate % i) == 0) itisprime = false;
	}
	
	return itisprime;
}//isprime


public static int getnextprime(int curprime) {
	/* This method assumes it has been sent a prime. It is going to find the
	   next prime and return it.
	*/
	while (!isprime(curprime)) curprime += 2;  //keep incrementing by 2 until "isprime" returns us a prime.
	
	return curprime;
	
}//getnextprime



  public static void fillprimearray(int [] arraytofill) {
	  int i;
	  int curprime = 3;
	  /* Ok. The job of this routine is to fill the array. So, 
	     we will put 1000 primes in the array.Primes are
		 kind of funky with the first prime being 2 (an even number!!) and
		 then 3. Once we are at 3, all primes are odd. NOTICE THIS METHOD DOESN'T
		 CARE ABOUT PRIMENESS. IT ASSUMES THE GETNEXTPRIME ROUTINE WILL HANDLE IT. THIS ROUTINE ASSUMES
		 THE NUMBER RETURNED FROM THE METHOD "GENEXTPRIME" RETURNS A PRIME. 
	  */
	  arraytofill[0] = 2;
	  arraytofill[1] = 3;
	  for (i = 2; i<1000; i++) {
		  curprime = getnextprime(curprime +2); //because the next prime has to be at least 2 more than the current prime!...all primes are odd (except for the number 2)
		  arraytofill[i]=curprime;
	  }	 
  }//fillprimearray


 public static void main(String args[]) {
   
    int i; //used to walk the primearray after we fill it.
	
   
   
   /*This bit of code will fill a 1000 element array with consecutive primes.    
   The array is indexed from 0 to 999 because all arrays start indexing at zero. Then
   each cell in the array has a prime number in it.  It should look something like this:
   Index   0  1  2  3  4  etc.
   Prime   2  3  5  7  11 etc
   
   So,  I need to allocate an array. Then fill it. Filling it will happen in a different
   method.  By saying the first two sentences above, I have abstracted what I need to do:
     1)  Create the array
	 2)  Fill it.
    */
	
  // Create the array
     int [] primearray = new int [1000];
	 
  // Fill the array by calling a method to do it. Not something "main" should do. Give the array to the method to fill.
  // Since the array is an OBJECT, the method will get passed the address of the object on the heap and fill it.
  
     fillprimearray (primearray);
	 
  // Now, the array is filled. The next bit of code just runs a for-loop to show that the contents of the array are good.
  // Lets just print out the first 100 primes to see if we are doing ok.
  
     for (i = 0; i < 100; i++) {
		 System.out.print(primearray[i] + "  ");
		 if ((i % 20 == 0)) System.out.println();
	 }
	 
    
 }//main

    

 }//fillarrayexample 