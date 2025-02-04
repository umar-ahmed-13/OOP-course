import java.time.LocalDateTime;
import java.util.ArrayList;

public class Assignment {
    private String studentName;
   
    private String studentID;
    
    private LocalDateTime dueDate;
   
    private ArrayList<String> tasks = new ArrayList<String>();
    public static void main(String[] args) {
        
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentID() {
        return this.studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public LocalDateTime getDueDate() {
        return this.dueDate;
    }
    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
    public void addTask(String task){
        this.tasks.add(task);
    }
    public void getTasks(Assignment takenObj){
        System.out.println("Tasks for the assignment:");
        for (String i : takenObj.tasks){
            System.out.println(i);
        }
    }

    public void checkTask(Assignment takenObj,String task){
        for (String i : takenObj.tasks){
            if (task.equals(i) ){
                takenObj.tasks.remove(task);
            }
        }
    }

    
}
