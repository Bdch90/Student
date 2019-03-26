import java.util.Scanner;

public class Student
{
    private int studentID;
    private String studentName;
    private String studentGender;
    private double mathPoint;
    private double physicsPoint;
    private double chemistryPoint;

    public Student(){}
    public Student(int studentID, String studentName, String studentGender, double mathPoint,
                   double physicsPoint, double chemistryPoint)
    {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentGender = studentGender;
        this.mathPoint = mathPoint;
        this.chemistryPoint = chemistryPoint;
        this.physicsPoint = physicsPoint;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }


    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public String getStudentGender() {
        return this.studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }


    public double getMathPoint() {
        return this.mathPoint;
    }

    public void setMathPoint(double mathPoint) {
        this.mathPoint = mathPoint;
    }


    public double getPhysicsPoint() {
        return this.physicsPoint;
    }

    public void setPhysicsPoint(double physicsPoint) {
        this.physicsPoint = physicsPoint;
    }


    public double getChemistryPoint() {
        return this.chemistryPoint;
    }

    public void setChemistryPoint(double chemistryPoint) {
        this.chemistryPoint = chemistryPoint;
    }


    public String displayStudent()
    {
        return "Student : " + this.getStudentName() + " , gender : " + this.getStudentGender()
                + " , ID : " + this.getStudentID() + " Math points : " + this.getMathPoint()
                + " , Chemistry points : " + this.getChemistryPoint() + " , Physics points : "
                + this.getPhysicsPoint();
    }
    public void createProfileOfStudent()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student ID :");
        int studentId = scanner.nextInt();
        this.setStudentID(studentId);

        scanner.nextLine();
        System.out.println("Enter student name :");
        String name = scanner.nextLine();
        this.setStudentName(name);

        System.out.println("Student gender :");
        String gender = scanner.nextLine();
        this.setStudentGender(gender);

        System.out.println("Math points :");
        Double math = scanner.nextDouble();
        this.setMathPoint(math);

        System.out.println("Chemistry points :");
        Double chemistry = scanner.nextDouble();
        this.setChemistryPoint(chemistry);

        System.out.println("Physics points :");
        Double physics = scanner.nextDouble();
        this.setPhysicsPoint(physics);
    }
}
