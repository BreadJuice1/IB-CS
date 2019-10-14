import java.util.Scanner;

class numcheck2 {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    // get number
    System.out.print("input number: ");
    Double number = in.nextDouble();
    System.out.print("input another number: ");
    Double number_two = in.nextDouble();

    // math
    Boolean check = number % number_two == 0;
    
    // return check
    if (check == true) {
        System.out.print(number +" is a multiple of " +number_two);
    } else {
        System.out.print(number +" is not a multiple of " +number_two);
    }
        in.close();
    } // main
} // class

