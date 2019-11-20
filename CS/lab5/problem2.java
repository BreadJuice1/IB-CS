import java.io.IOException;

class problem2 {
    public static void main(String[] args) throws IOException {
        int numbers[] = new int[2];

        System.out.print("input a start letter and an end letter:");
        numbers[0] = System.in.read();

        numbers[1] = System.in.read();

        for (int i = numbers[0]; i <= numbers[1]; i++) {
            System.out.print(i + " ");
            System.out.print((char) i + "\n");
        }
    }
}