import java.io.*;

class charread {
    public static void main(String args[]) throws IOException {
        int charval = 0;
        char mychar;
        
        System.out.println("Please enter a character");
        
        charval = System.in.read();
        
        mychar = (char) charval;
        
        System.out.println("Letter value read was " + charval + " character is " + mychar);
    } // main
}// charread

class lab5 {
    public static void problem1() {



    } // problem1

    public static void main(String[] args) {
        System.out.print("which problem do you want to run?")
    }
} // class