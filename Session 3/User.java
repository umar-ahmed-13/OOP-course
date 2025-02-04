import java.util.*;
import java.util.Map;

public class User {


    private String userName;
    private ArrayList<String> watchedContent= new ArrayList<String>();
  
    private ArrayList<String> allContent = new ArrayList<String>();

    private HashMap<String,Integer> ratings = new HashMap<String,Integer>();

   
    public static void main(String[] args) {
        
    }
    public void getAllContent() {
        for(int i = 0; i<this.allContent.size();i++){
            System.out.println(i+1+" - "+this.allContent.get(i));
        }
    }
    public void setAllContent(String content) {
        this.allContent.add(content) ;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public void getWatchedContent() {
        if(this.watchedContent == null){
            throw new NullPointerException("Watched list is empty");
        }
        for(int i = 0; i<this.watchedContent.size();i++){
            System.out.println(i+1+" - "+this.watchedContent.get(i));
        }
    }
    public void setWatchedContent(String content) {
        
        if (this.allContent.contains(content)){
            this.watchedContent.add(content) ;
        }
        else if(!this.allContent.contains(content)){
            System.err.println("\""+content+"\""+" is not available to watch");
            System.out.println("These are available");
            getAllContent();
        }
    }
    public void getRatings() {
        if(this.ratings.isEmpty() == true){
            System.out.println("The ratings list is empty");
        }
        else if(this.ratings.isEmpty() == false){
            System.out.println("Your ratings are:");
            for(Map.Entry<String,Integer> item: ratings.entrySet()){
                System.out.println(item.getKey()+" - "+item.getValue());
            }
        }
    }
    public void setRating(String content, int rating) {
        if(this.allContent.contains(content) && rating>=0 && rating<=10){
            this.ratings.put(content, rating);
        }
        else if (!this.allContent.contains(content)){
            System.out.println("Sorry this is not available to rate");
        }
    }

    
}
