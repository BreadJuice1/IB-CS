import java.io.IOException;

class pyramid {
    public static void main(String[] args) throws IOException {
        int height = 0;
        int counter = 1;

        System.out.println("what number do you want to start at?");
        height = (char) System.in.read();

        for (int i = height; i >= 0; i--) {
           System.out.print(i);
            }

    }
}