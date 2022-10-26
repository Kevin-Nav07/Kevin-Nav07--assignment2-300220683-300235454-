public class Question extends Post{
    private String question, answer;
    private QuestionStatus status;
    

    enum QuestionStatus {//enumeration to help organize status activity
        ACTIVE,
        VISIBLE,
        REVIEW, 
        CLOSED,
        HOMEWORK
    }

    public Question(String tag, String generalVisibility, String question, String answer, QuestionStatus status) {
        super(tag, generalVisibility);
        this.question = question;
        this.answer = answer;
        this.status = status;

        //TODO Auto-generated constructor stub
    }

    //getters
    public String getAnswer() {
        return answer;
    }
    public String getQuestion() {
        return question;
    }
    public QuestionStatus getStatus() {
        return status;
    }
    public void setStatus(  QuestionStatus newstatus){
        this.status= newstatus;

    }
    public String toString(){
        return ("------Question------\n"+ question +"\n------------------" );
    }
    ///



    
}