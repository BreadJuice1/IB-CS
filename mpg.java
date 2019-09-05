import java.io.*;import java.util.Random;import java.util.Scanner;

class mpg { 
     public static void main(String[] args) {
    
        // set vars
    Scanner in = new Scanner(System.in);
    System.out.println("input starting fuel:");
    Double startfuel = in.nextDouble();
    System.out.println("input ending fuel:");
    Double endfuel = in.nextDouble();
    System.out.println("input starting odometer:");
    Double startodometer = in.nextDouble();
    System.out.println("input ending odometer:");
    Double endodometer = in.nextDouble();
        
        // math
    Double distance = endodometer - startodometer;
    Double fuelused = startfuel - endfuel;
    Double mpg = fuelused / distance;

        // return mpg
    System.out.println("mpg is " +mpg);


    } // main
} // class