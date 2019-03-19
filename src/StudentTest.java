import java.util.Scanner;
import java.util.ArrayList;

public class StudentTest implements IStudentTest{
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> studentsList = new ArrayList<Student>();
    int input;
    int index;
    @Override
    public void addStudent()
    {
        Student student = new Student();
        studentsList.add(student);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student ID :");
        int id = scanner.nextInt();
        student.setStudentID(id);

//        scanner.nextLine();
//        System.out.println("Enter student name :");
//        String name = scanner.nextLine();
//        student.setStudentName(name);
//
//        System.out.println("Student gender :");
//        String gender = scanner.nextLine();
//        student.setStudentGender(gender);
//
//        System.out.println("Math points :");
//        Double math = scanner.nextDouble();
//        student.setMathPoint(math);
//
//        System.out.println("Chemistry points :");
//        Double chemistry = scanner.nextDouble();
//        student.setChemistryPoint(chemistry);
//
//        System.out.println("Physics points :");
//        Double physics = scanner.nextDouble();
//        student.setPhysicsPoint(physics);
        System.out.println("added.");
    }
    @Override
    public void studentList()
    {
        System.out.println("List of students :");
        for (Student student : studentsList)
        {
            System.out.println(student.displayStudent() + "\n");
        }
    }

    @Override
    public  void sortStudentList()
    {
        for (int indexX = 0; indexX < studentsList.size(); indexX++)
        {
            for (int indexy = 0; indexy <studentsList.size(); indexy++)
            {
                if ((studentsList.get(indexX)).getStudentID() < (studentsList.get(indexy)).getStudentID())
                {
                    int temp = (studentsList.get(indexX)).getStudentID();
                    (studentsList.get(indexX)).setStudentID((studentsList.get(indexy)).getStudentID());
                    (studentsList.get(indexy)).setStudentID(temp);
                }
            }
        }
        System.out.println("Sort done.");
    }

    @Override
    public void deleteStudentById()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID of student to delete:");
        input = scanner.nextInt();
        getIndex(input);
        studentsList.remove(index);
        System.out.println("Deleted");
    }

    public void searchStudentById() {
        System.out.println("Enter ID of student:");
        input = scanner.nextInt();
        if (getIndex(input) >= 0)
        {
            System.out.println(studentsList.get(getIndex(input)).displayStudent());
        }
        else
        {
            System.out.println("Not found.");
        }
    }

    public int getIndex(int input)
    {
        for (index = 0; index < studentsList.size(); index++)
        {
            if (studentsList.get(index).getStudentID() == input)
            {
                return index ;
            }
        }
        return -1;
    }
}
