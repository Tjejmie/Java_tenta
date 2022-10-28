public class Car extends Vehicle {

    final String authorizationClass = "B";
    public Car(String registrationNumber, int passengerCapacity, String authorizationClass) {
        super(registrationNumber, passengerCapacity);
        //this.authorizationClass = authorizationClass;
    }

    public String getAuthorizationClass(){
        return authorizationClass;
    }
    public void setDriver(Person driver) throws VehicleException{
     
        if (driver == null){
            throw new VehicleException("Driver doesn't exist");
        }
        if (driver.getAge() < 18){
            throw new VehicleException("You have to be 18 to drive");
        }
        if(driver.getDriversLicense() == null){
            throw new VehicleException("You have to have a drivers license to drive");
        }
        if(!driver.getDriversLicense().contains("B"))
        {
            throw new VehicleException("You dont have the correct drivers license to drive this vehicle");
        }
        this.driver = driver;
    }
    
    public String toString(){
        
        String message = super.toString() + ", Vehicle: Car";
        return message;
    }
    
}
