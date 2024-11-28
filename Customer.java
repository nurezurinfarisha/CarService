package CarServiceAppointmentManagementSystem;

public class Customer {

    String name, email, address, gender,phoneNo;
    
    
    public Customer (String name, String phoneNo, String email, String address, String gender){
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.address = address;
        this.gender = gender;
    }
      
    
    public String toString () {
        return "Customer Details :" + " \nName:" + name + "\nPhone No: " +phoneNo + "\nEmail: " +email + "\nAddress: " + address + "\nGender: " +gender;   
    }
}
