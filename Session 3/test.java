import java.time.LocalDateTime;

public class test {
    public static void main(String[] args) {
    //    Car newcar = new Car();
    //    newcar.SetName("BMW");
    //    newcar.SetModel("M3");
    //    newcar.SetRate(1200.0);
    //    System.out.println(newcar.GetModel(newcar));
    //    System.out.println(newcar.GetRentRate(newcar));
    //    System.out.println(newcar.GetType(newcar));
    //    newcar.SetMaintenenceTime(2);
    //    System.out.println(newcar.GetMaintenanceEndTime(newcar));
    //    System.out.println(newcar.GetMaintenanceEndTime(newcar));
    //    newcar.SetRentStartTime(10);
    //    System.out.println(newcar.GetRentEndTime(newcar));
       User user1 = new User();
       
      
       user1.setAllContent("movie1");
       user1.setAllContent("movie2");
       user1.setAllContent("movie3");
    //    user1.setWatchedContent("movie1");
       user1.getWatchedContent();
    //    user1.setWatchedContent("movie2");
       user1.getWatchedContent();
       user1.setWatchedContent("movie4");
       user1.getWatchedContent();
       user1.getRatings();
       user1.setRating("movie4",1);
       user1.getRatings();
       



    }
}
