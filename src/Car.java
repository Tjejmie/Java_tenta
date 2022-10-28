public class Car extends Vehicle {

    final String authorizationClass = "B";
    public Car(String registrationNumber, int passengerCapacity, String authorizationClass) {
        super(registrationNumber, passengerCapacity);
        //this.authorizationClass = authorizationClass;
    }

    public String getAuthorizationClass(){
        return authorizationClass;
    }
    public String toString(){
        
        String message = String.format("Vehicle = Car");
        return message;
    }
    
}
