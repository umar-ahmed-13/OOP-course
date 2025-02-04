import java.time.LocalDateTime ;


public class Car{
    private String type ;
    private String model;
    private LocalDateTime maintenanceTimeDuration;
    private LocalDateTime rentStart;
    private LocalDateTime rentEnd;
    private Double rentRate;
    public boolean CarStatus;
    
    public boolean GetCarStatus() {
        return CarStatus;
    }
    public static void main(String[] args) {
    }

    public String GetType(Car takenObj){
        return this.type;
    }
    public String GetModel(Car takenObj){
        return this.model;
    }
    public LocalDateTime GetRentEndTime(Car takenObj){
        return this.rentEnd;
    }
    public LocalDateTime GetMaintenanceEndTime(Car takenObj){
        return this.maintenanceTimeDuration;
    }
    public Double GetRentRate(Car takenObj){
        return this.rentRate;
    }
    public void setCarStatus(boolean carStatus) {
        this.CarStatus = carStatus;
    }
    public void SetName(String type){
        this.type = type;
    }
    public void SetModel(String model){
        this.model = model;
    }
    public void SetRate(Double rate){
        this.rentRate = rate;
    }

    public void SetMaintenenceTime(int days){
        if(maintenanceTimeDuration!=null){
            System.out.println("Car is in maintenance");
        }

        if(days<0){
            throw new ArithmeticException("Duration cannot be negative");
        }

        // if(rentEnd.isAfter(LocalDateTime.now()) && rentEnd!=null){
        //     System.out.println("Car is out for rent");
        // }
        this.maintenanceTimeDuration = LocalDateTime.now();
        this.maintenanceTimeDuration = LocalDateTime.now().plusDays(days);
    }
    public void SetRentStartTime(int days){
        if(days<0){
            throw new ArithmeticException("Duration cannot be negative");
        // if(rentStart.isBefore(maintenanceTimeDuration)){
        //     System.out.println("Sorry the car is in maintenance");
        // }
        // if(rentEnd!=null){
        //     System.out.println("Sorry the car is not available for rent");
        }
        this.rentStart = LocalDateTime.now();
        this.rentEnd = this.rentStart.plusDays(days);
        
    



    }
    

}