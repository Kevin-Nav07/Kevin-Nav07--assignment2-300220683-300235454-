import java.util.Scanner;
import java.util.StringTokenizer;

public class Note extends Post{
    private String title;
    private String description;

    public Note(String tag, String generalVisibility, String title, String description) {
        super(tag, generalVisibility);
      
        this.title = title;
        this.description = description;
       
    }
    

    public void AddDescription(){
        Scanner console = new Scanner(System.in);           

       

       this.description = console.nextLine();

    }
    public String getDescription() {
        return description;
    }
    public String getTitle() {
        return title;
    }
    public String toString(){
        return "-------Note Post------\n" + title + "\n \n" + description + "\n ----------------------"; 

    }
}