
class charat {
    public static void main(String[] args) {
        String bruh[] = new String[2];
        bruh[0] = "ABC";
        bruh[1] = "abc";

        for (int i = 0; i < 2; i++) {
            System.out.println((int) bruh[i].charAt(0) + " " + bruh[i].charAt(0));
        }
    }
}