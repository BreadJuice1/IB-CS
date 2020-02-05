import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

class Student {
    long studentid;
    int grade;
    String lastname;
    String firstname;
    String gender;

    Student(int studentid, int grade, String lastname, String firstname, String gender) {
        this.studentid = studentid;
        this.grade = grade;
        this.lastname = lastname;
        this.firstname = firstname;
        this.gender = gender;
    } // student
} // student class

class Lab8 {
    public static void main(String[] args) throws FileNotFoundException {
        int studentamount;
        String filename;
        Scanner maininput = new Scanner(System.in);
        System.out.println("input file name");
        filename = maininput.next();
        // studentamount = filelength(filename);
        Student[] students = new Student[Integer.MAX_VALUE - 5];
        //Student[] students = new student(studentid, grade, lastname, firstname, gender);
        Scanner classlist = new Scanner(new File(filename));
        int i = 0;

        int id;
        int grade;
        String lastname;
        String firstname;
        String gender;
        
        while (classlist.hasNext()) {
             id = classlist.nextInt();
             grade = classlist.nextInt();
             lastname = classlist.next();
             firstname = classlist.next();
             gender = classlist.next();
             i++;
             students[i] = new Student(id, grade, lastname, firstname, gender);
        }

        System.out.print("\n" + students[2].firstname);
    } // main

    public static int filelength(String filename) throws FileNotFoundException {
        Scanner filesize = new Scanner(new File(filename));
        int filelenth = 0;

        while (filesize.hasNextLine()) {
            filelenth += 1;
        }
        filesize.close();
        return filelenth;
    } // filelenth
} // lab8