import java.io.IOException;

class nextString {
    public static next() throws IOException {
        int i = 0;
        int code = System.in.read();
        String character[] = new String[12];
        String nextString;
        if ( code > 32 && code < 127) {
            character[counter] = (char) code;
            nextString += character[counter];
            counter++;
            }
        return nextString;
    } // next

    public static void main(String[] args) {
        System.out.print(next());
    } // main
} // class
