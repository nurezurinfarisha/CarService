package CarServiceAppointmentManagementSystem;

public class Services {
    protected String totalTimeServices = "5 hours";
    protected double SSTCharge=0.06;
    protected double currentMilleage =25000;
 
  
    public Services(){
       }
    
    public Services (String totalTimeServices, double SSTCharge, double currentMilleage){
        this.totalTimeServices =  totalTimeServices;
        this.SSTCharge = SSTCharge;
        this.currentMilleage = currentMilleage;  
    }
    
    public String getTotalTimeServices(){
        return totalTimeServices;
    }
    
    public void setTotalTimeServices(String totalTimeServices){
        this.totalTimeServices = totalTimeServices;   
    }
    
    public double getSSTCharge(){
        return SSTCharge;
    }
    
    public void setSSTCharge(double SSTCharge){
        this.SSTCharge =SSTCharge;   
    }
    
    public double getCurrentMilleage() {
        return currentMilleage;
    }

    public void setCurrentMilleage(double currentMilleage) {
        this.currentMilleage =currentMilleage;
    }
   
    
    @Override
    public String toString() {
        return "\nTotal Time for Car Service:  " +totalTimeServices +"\nSST Charge: "+SSTCharge+"\nCurrent Milleage to have service is every : "+currentMilleage+" km";
    }
    
    
}
