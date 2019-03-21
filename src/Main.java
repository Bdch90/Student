import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("1. Add student");
        System.out.println("2. Show studentsList");
        System.out.println("3. Search student by ID");
        System.out.println("4. Sort");
        System.out.println("5. Delete student");
        System.out.println("0. Stop");

        StudentTest studentTest = new StudentTest();
        int studentId;
        int x = 1;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("---------------");
            System.out.println("Enter a number:");
            x = scanner.nextInt();
            switch (x)
            {
                case 0 : 
                    System.exit(0);
                    break;
                case 1 :
                    studentTest.addStudent();
                    System.out.println("added.");
                    break;
                case 2 :
                    System.out.println("List of students :");
                    studentTest.studentList();
                    break;
                case 3:
                    System.out.println("Enter ID of student:");
                    studentId = scanner.nextInt();
                    studentTest.searchStudentById(studentId);
                    break;
                case 4 : 
                    studentTest.sortStudentList();
                    System.out.println("Sort done.");
                    break;
                case 5:
                    System.out.println("Enter ID of student to delete:");
                    studentId = scanner.nextInt();
                    studentTest.deleteStudentById(studentId);
                    System.out.println("Deleted");
                    break;
                default:
                    System.exit(0);
            }
        }while (x != 0);
    }

}
