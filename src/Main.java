import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        menu();
    }
    public static void menu()
    {
        System.out.println("1. Add student");
        System.out.println("2. Show studentsList");
        System.out.println("3. Search student by ID");
        System.out.println("4. Sort");
        System.out.println("5. Delete student");
        System.out.println("0. Stop");
        checkMenu();
    }
    public static void checkMenu()
    {
        StudentTest studentTest = new StudentTest();
        int x = 1;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("---------------");
            System.out.println("Enter a number:");
            x = scanner.nextInt();
            switch (x)
            {
                case 0 : System.exit(0);
                break;

                case 1 : studentTest.addStudent();
                break;

                case 2 : studentTest.studentList();
                break;

                case 3: studentTest.searchStudentById();
                break;

                case 4 : studentTest.sortStudentList();
                break;

                case 5:
                    studentTest.deleteStudentById();
                    break;
                default:
                    System.exit(0);
            }
        }while (x != 0);
    }
}
