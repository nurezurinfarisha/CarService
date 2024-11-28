package CarServiceAppointmentManagementSystem;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FullService extends Services{
    protected double fullCharge = 532.50;
    private String typepayment;
    public FullService() {

    }

    public FullService(double fullCharge, String typepayment) {
        this.fullCharge = fullCharge;
        this.typepayment = typepayment;
    }

    public FullService(double fullCharge, String typepayment, String totalTimeServices, double SSTCharge, double currentMilleage) {
        super(totalTimeServices, SSTCharge, currentMilleage);
        this.fullCharge = fullCharge;
        this.typepayment = typepayment;
    }

    public double getFullCharge() {
        return fullCharge;
    }

    public void setFullCharge(double fullCharge) {
        this.fullCharge = fullCharge;
    }

    public String getTypePayment() {
        return typepayment;
    }

    public void setTypePayment(String typepayment) {
        this.typepayment = typepayment;
    }

    public double getFullService(){
        double fullService = fullCharge + (fullCharge * SSTCharge);
        BigDecimal bd = new BigDecimal(fullService).setScale(2, RoundingMode.HALF_UP);
        double newFullService = bd.doubleValue();
        return newFullService;
    }

    public String printFullCharge(){
       return("\nFull Charge (INCLUDED  6% SST): RM " + getFullService() + "\nType Payment: " + getTypePayment() +toString());
    }
}
