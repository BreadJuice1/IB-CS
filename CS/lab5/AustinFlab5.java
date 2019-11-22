import java.io.IOException;

// Austin Frost

class lab5 {
    public static void one() throws IOException {
        int charval = 0;
        char mychar;

        while (true) {
            System.out.println("Please enter a character");

            charval = System.in.read();

            if (charval > 31) {

                mychar = (char) charval;

                System.out.println("Letter value read was " + charval + " character is " + mychar);
            }
        }
    } // one

    public static void two() throws IOException {
         
        int numbers[] = new int[2];
        int startchar;
        int endchar;

        System.out.print("input a start character and an end chacter:");

        numbers[0] = System.in.read();

        while (numbers[1] > 32 && numbers[1] < 127) {
            numbers[1] = System.in.read();
        }

        startchar = numbers[1] > numbers[0] ? numbers[1] : numbers[0];
        endchar = numbers[1] > numbers[0] ? numbers[0] : numbers[1];  

        for (int i = startchar; i <= endchar; i++) {
            System.out.print(i + " ");
            System.out.print((char) i + "\n");
        }

    } // two

    public static void three() throws IOException {
        int integer[] = new int[13];
        int number1 = 0;
        int number2 = 0;
        int sum = 0;

        System.out.print("Please enter two numbers separated by a space. Each number should be 6 or fewer digits");

        for (int i = 0; i < 13; i++) {
            integer[i] = System.in.read();
        }

        int counter[] = new int[2];

    } // three

    public static void main(String[] args) throws IOException {
        System.out.print("what problem do you want to run?");
        int prognum = (System.in.read() - 48);

        switch (prognum) {
        case 1:
            one();
            break;
        case 2:
            two();
            break;
        case 3:
            three();
            break;
        }
    }
} // class