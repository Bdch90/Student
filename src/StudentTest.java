import java.util.Scanner;
import java.util.ArrayList;

public class StudentTest implements IStudentTest{
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> studentsList = new ArrayList<Student>();
    int index;
    int studentId;
    @Override
    public void addStudent()
    {
        Student student = new Student();
        createInfoOfStudent(student);
        studentsList.add(student);
    }

    public void createInfoOfStudent(Student student)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student ID :");
        studentId = scanner.nextInt();
        student.setStudentID(studentId);

        scanner.nextLine();
        System.out.println("Enter student name :");
        String name = scanner.nextLine();
        student.setStudentName(name);

        System.out.println("Student gender :");
        String gender = scanner.nextLine();
        student.setStudentGender(gender);

        System.out.println("Math points :");
        Double math = scanner.nextDouble();
        student.setMathPoint(math);

        System.out.println("Chemistry points :");
        Double chemistry = scanner.nextDouble();
        student.setChemistryPoint(chemistry);

        System.out.println("Physics points :");
        Double physics = scanner.nextDouble();
        student.setPhysicsPoint(physics);
    }

    @Override
    public void studentList()
    {
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
    }

    @Override
    public void deleteStudentById(int studentId)
    {
        getIndex(studentId);
        studentsList.remove(studentId);
    }

    public void searchStudentById(int studentId) {

        if (getIndex(studentId) >= 0)
        {
            System.out.println(studentsList.get(getIndex(studentId)).displayStudent());
        }
        else
        {
            System.out.println("Not found.");
        }
    }

    public int getIndex(int studentId)
    {
        for (index = 0; index < studentsList.size(); index++)
        {
            if (studentsList.get(index).getStudentID() == studentId)
            {
                return index ;
            }
        }
        return -1;
    }
}
