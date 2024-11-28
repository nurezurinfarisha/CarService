package CarServiceAppointmentManagementSystem;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class InterimService extends Services {

    protected double interimCharge = 250.25;
    private String typepayment;

    public InterimService() {

    }

    public InterimService(double interimCharge, String typepayment) {
        this.interimCharge = interimCharge;
        this.typepayment = typepayment;
    }

    public InterimService(double interimCharge, String typepayment, String totalTimeServices, double SSTCharge, double currentMilleage) {
        super(totalTimeServices, SSTCharge, currentMilleage);
        this.interimCharge = interimCharge;
        this.typepayment = typepayment;
    }

    public double getInterimCharge() {
        return interimCharge;
    }

    public void setInterimCharge(double interimCharge) {
        this.interimCharge = interimCharge;
    }

    public String getTypePayment() {
        return typepayment;
    }

    public void setTypePayment(String typepayment) {
        this.typepayment = typepayment;
    }

    public double getInterimService() {
        double interimService = interimCharge + (interimCharge * SSTCharge);
        BigDecimal bd = new BigDecimal(interimService).setScale(2, RoundingMode.HALF_UP);
        double newInterimService = bd.doubleValue();
        return newInterimService;
    }

    public String printInterimCharge() {
        return ("\nInterim Charge (INCLUDED  6% SST) : RM " + getInterimService() + "\nType Payment: " + getTypePayment() + toString());
    }

}
