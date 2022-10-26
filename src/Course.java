public class Course {
    private String courseCode;
    private int semester;
    private String date;
    private boolean status;
    private String description;
    private Professor professor;

    public Course(String courseCode, int semester, String date, boolean status, String description, Professor professor){
        this.courseCode = courseCode;
        this.semester = semester;
        this.date = date;
        this.status = status;
        this.description = description;
        this.professor = professor;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public String getDate() {
        return date;
    }
    public String getDescription() {
        return description;
    }
    public Professor getProfessor() {
        return professor;
    }
    public int getSemester() {
        return semester;
    }
    
}
