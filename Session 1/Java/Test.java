
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

// find max 
// find min salary  
// and average salary
public class Test{
    
    public static void main(String[] args) {
        int max = -1;
        int min = 100000;
        float avg= 0;
        int sum= 0;
        String maxSalary = null;
        String minSalary = null;
        try{
        File CSVfile = new File("salarysheet.csv");
        Scanner reader = new Scanner(CSVfile);
        while (reader.hasNextLine()){
            String data = reader.nextLine();
            String[] info = data.split(",");
              int num = Integer.parseInt(info[1]);
              sum+= num;
              avg +=1;
              if(num> max){
                max = num;
                maxSalary = info[0];
              }
              if (num<min){
                min = num;
                minSalary = info[0];
              }

             
            }
        avg = sum/avg;
        
        System.out.println("Max salary is the "+max+" "+maxSalary);
        System.out.println("Min salary   is "+min+" "+minSalary);
        System.out.println("Average is "+avg);
        reader.close();
        }
        
        catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }

    }
}