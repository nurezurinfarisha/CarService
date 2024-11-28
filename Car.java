package CarServiceAppointmentManagementSystem;

import com.toedter.calendar.JDateChooser;
import java.util.Calendar;



public class Car {

    //variable
    String carModel, carType, carColor, carPlate, carService, cost, dateService, timeService;
    Object jDateChooser1;
    
    //constructor
    public Car(String carModel, String carType, String carColor, String carPlate, String carService, String cost, String dateService, String timeService,JDateChooser jDateChooser1) {
        this.carModel = carModel;
        this.carType = carType;
        this.carColor = carColor;
        this.carPlate = carPlate;
        this.carService = carService;
        this.cost = cost;
        this.dateService = dateService;
        this.timeService = timeService;
       
    }

  
    @Override
    public String toString() {
        return "\nCar Model: " + carModel + "\nCar Type: " + carType + "\nCarModel: " + carModel
                + "\nCar Color: " + carColor + "\nCar Plate: " + carPlate + "\nCar Sevice: " + carService +"\n Total Cost: " + cost
                + "\nDate Service: " + dateService + "\nTime Service: " + timeService;

    }

}
