import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


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

public class lab72 {
    public static void main(String[] args) throws IOException {
        int studentamount;
        String filename;
        Scanner maininput = new Scanner(System.in);
        filename = maininput.next();
        Student[] students = new Student[100];
        Scanner classlist = new Scanner(new File(filename));
        int studentAmount = 0;
        int progNum;

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
            studentAmount++;
            students[studentAmount] = new Student(id, grade, lastname, firstname, gender);
        }

        
    } // main

} // lab72