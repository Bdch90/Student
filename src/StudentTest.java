import java.util.Scanner;
import java.util.ArrayList;

public class StudentTest implements IStudentTest{
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> studentsList = new ArrayList<Student>();
    int index;
    int studentId;

    @Override
    public void addStudent(Student student)
    {
        studentsList.add(student);
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
        studentsList.remove(getIndex(studentId));
    }

    @Override
    public void changeProfileOfStudent(int studentId) {
        studentsList.get(getIndex(studentId)).createProfileOfStudent();
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
