public class Professor extends Account{

    public Professor(String name, int cellNumber, String email) {
        super(name, cellNumber, email);
        
    }

    public Course createCourse(String courseCode, int semester, String date, boolean status, String description){
        Course course = new Course(courseCode, semester, date, status, description,this);//creating a course requires all these variables and also the instance of this professor passing through it
        return course;

    }
    //Creating a note to be posted by the teacher
    public Note createNote(String title, String description, String tag, String visibility){
        Note note = new Note(tag, visibility, title, description);
        return note;

    }

    //creating a question for the professor only
    public Question createQuestion(String question, String answer,  Question.QuestionStatus status, String generalVisbility, String tag){//status must be of type Question.QuestionStatus for the enum to work properly
        Question newQuestion = new Question(tag, generalVisbility, question, answer, status);
        return newQuestion;
    }

    

}