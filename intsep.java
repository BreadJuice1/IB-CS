import java.util.Scanner; 

class intsep {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    // get number
    do { 
    System.out.print("input any amount of any alphanumeric character: ");
    String number = in.next();

    // seperate digits and print
    for (int i = 1; i <= number.length(); i++) {
        System.out.print(number.substring(i-1,i) +"   ");
        } // for
        System.out.println();
        } while (true);
    } // main
} // class