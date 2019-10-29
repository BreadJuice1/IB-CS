import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

class menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File folder = new File(System.getProperty("user.dir"));
File[] listOfFiles = folder.listFiles();
for (int i = 0; i < listOfFiles.length; i++) {
  if (listOfFiles[i].isFile()) {
    System.out.println("File " + listOfFiles[i].getName());
  } else if (listOfFiles[i].isDirectory()) {
    System.out.println("Directory " + listOfFiles[i].getName());
  }
}
in.close();
    } // main
} // class