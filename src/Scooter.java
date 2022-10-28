public class Scooter extends Vehicle {

    public Scooter(String registrationNumber, int passengerCapacity) {
        super(registrationNumber, passengerCapacity =1);
    }
    

    public String toString(){
        String message = String.format("Vehicle = Scooter");
        return message;
    }
    
}
