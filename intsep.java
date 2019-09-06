import java.util.Scanner; 

class intsep {
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);

    // get number
    System.out.print("input a 5 digit number: ");
    String number = in.next();

    // check length 
    if (number.length() > 5) {
        System.exit(0);
    }

    // seperate digits and print
    System.out.print(number.substring(0,1) +"   ");  
    System.out.print(number.substring(1,2) +"   ");    
    System.out.print(number.substring(2,3) +"   ");
    System.out.print(number.substring(3,4) +"   ");
    System.out.print(number.substring(4,5) +"   ");
    in.close();
    } // main
} // class