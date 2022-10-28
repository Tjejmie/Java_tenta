public class Scooter extends Vehicle {

    public Scooter(String registrationNumber, int passengerCapacity) {
        super(registrationNumber, passengerCapacity = 1);
    }
    public void setDriver(Person driver) throws VehicleException{
     
        if (driver == null){
            throw new VehicleException("Driver doesn't exist");
        }
        if (driver.getAge() < 15){
            throw new VehicleException("You have to be 15 to drive");
        }
      
        this.driver = driver;
    }


    public String toString(){
        String message = super.toString() + ", Vehicle: Scooter";
        return message;
    }
    
}
