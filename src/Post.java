import java.util.Scanner;
import java.util.StringTokenizer;

public class Post {
    private String tag;
    private String generalVisbility; // visible to either the professor only or the entire class
   
    

    public Post(String tag, String generalVisibility){
        this.tag = tag;
        this.generalVisbility = generalVisibility;
       
       
    }
    public String getGeneralVisbility() {
        return generalVisbility;
    }
    public String getTag() {
        return tag;
    }

  
}
