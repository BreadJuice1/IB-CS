import java.io.IOException;

class pyramid {
    public static void main(String[] args) throws IOException {
        int height = 0;
        int i = 1;

        System.out.println("what number do you want to start at?");
        height = System.in.read() - 48;

        for (int j = height; j >= 0; j--) {
            for (i = 1; i <= height; i++) {
                System.out.print(j);
            }
        }   System.out.println();
    }
}