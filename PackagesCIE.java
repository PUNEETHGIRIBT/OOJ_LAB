import java.util.Scanner;

public class Internals extends Student {

    int[] cieMarks = new int[5];

    public void inputCIEMarks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter CIE marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            cieMarks[i] = s.nextInt();
        }
    }

    public int[] getCieMarks() {
        return cieMarks;
    }
}


package CIE;

import java.util.Scanner;

public class Student {
    protected String usn;
    protected String name;
    protected int sem;

    public void inputStudentDetails() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter USN: ");
        usn = s.nextLine();
        System.out.print("Enter Name: ");
        name = s.nextLine();
        System.out.print("Enter Semester: ");
        sem = s.nextInt();
    }

    public void displayStudentDetails() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + sem);
    }
}

package SEE;

import CIE.Student;
import java.util.Scanner;

public class External extends Student {
    int[] seeMarks = new int[5];

    public void inputSEEMarks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter SEE marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            seeMarks[i] = s.nextInt();
        }
    }

    public int[] getSeeMarks() {
        return seeMarks;
    }
}


import CIE.Internals;
import SEE.External;
import java.util.Scanner;

public class PackagesCIE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine(); 

        Internals[] cieStudents = new Internals[numStudents];
        External[] seeStudents = new External[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            cieStudents[i] = new Internals();
            cieStudents[i].inputStudentDetails();
            cieStudents[i].inputCIEMarks();

            seeStudents[i] = new External();
            seeStudents[i].inputSEEMarks();
        }

        System.out.println("\nFinal marks for each student:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nDetails for student " + (i + 1) + ":");
            cieStudents[i].displayStudentDetails();

            int[] cieMarks = cieStudents[i].getCieMarks();
            int[] seeMarks = seeStudents[i].getSeeMarks();
            int[] finalMarks = new int[5];

            System.out.println("Final marks in each subject:");
            for (int j = 0; j < 5; j++) {
                finalMarks[j] = cieMarks[j] + seeMarks[j];
                System.out.println("Subject " + (j + 1) + ": " + finalMarks[j]);
            }
        }

        sc.close();

    }
}
