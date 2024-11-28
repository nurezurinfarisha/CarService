package CarServiceAppointmentManagementSystem;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class MajorService extends Services {
    protected double majorCharge = 997.75;
    private String typepayment;

    public MajorService() {

    }

    public MajorService(double majorCharge, String typepayment) {
        this.majorCharge = majorCharge;
        this.typepayment = typepayment;
    }

    public MajorService(double majorCharge, String typepayment, String totalTimeServices, double SSTCharge, double currentMilleage) {
        super(totalTimeServices, SSTCharge, currentMilleage);
        this.majorCharge = majorCharge;
        this.typepayment = typepayment;
    }

    public double getMajorCharge() {
        return majorCharge;
    }

    public void setMajorCharge(double majorCharge) {
        this.majorCharge = majorCharge;
    }

    public String getTypePayment() {
        return typepayment;
    }

    public void setTypePayment(String typepayment) {
        this.typepayment = typepayment;
    }

    public double getMajorService(){
        double majorService = majorCharge +(majorCharge * SSTCharge);
        BigDecimal bd = new BigDecimal(majorService).setScale(2, RoundingMode.HALF_UP);
        double newMajorService = bd.doubleValue();
        return newMajorService;
    }

    public String printMajorCharge(){
       return ("\nMajor Charge (INCLUDED  6% SST): RM " + getMajorService() + "\nType Payment: " + getTypePayment() +toString());
    }
    
}
