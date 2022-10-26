import java.util.ArrayList;
import java.util.Vector;

public class Student extends Account {
    private ArrayList<Course> courses=new ArrayList<>();//list of courses available to a student's account
    private ArrayList<Integer> grades = new ArrayList<>();
    private int studentNumber;
    public Student(String name, int cellNumber, String email, int studentNumber) {

        super(name, cellNumber, email);
        this.studentNumber = studentNumber;
        //TODO Auto-generated constructor stub
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }
    public ArrayList<Integer> getGrades() {
        return grades;
    }
    public int getStudentNumber() {
        return studentNumber;
    }

    



    
    
}
