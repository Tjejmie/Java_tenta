import java.util.ArrayList;

public abstract class Vehicle {
    
    protected String registrationNumber;
    protected int passengerCapacity;
    protected Person driver;
    protected ArrayList<Person> passengers = new ArrayList<>();

    public Vehicle(String registrationNumber, int passengerCapacity) {
        this.registrationNumber = registrationNumber;
        this.passengerCapacity = passengerCapacity;
    }

    public Vehicle(String registrationNumber, int passengerCapacity, Person driver) {
        this.registrationNumber = registrationNumber;
        this.passengerCapacity = passengerCapacity;
        this.driver = driver;
    }

    public void changeDriver(Person person){
        driver = getDriver();
        addPassenger(driver);
        setDriver(person);
    }

    public ArrayList<Person> getPassengers(){
        return passengers;
    }

    public void addPassenger(Person person){

        if (passengers.size() +1 >= passengerCapacity){
            System.out.println("Too many passengers already");
        }
        else{
            passengers.add(person);
        }
    }

    public void setDriver(Person driver){
        this.driver = driver;
    }

    public Person getDriver(){
        return driver;
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }
    public int getPassengerCapacity(){
        return passengerCapacity;
    }
    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }
    public void setPassengerCapacity(int passengerCapacity){
        this.passengerCapacity = passengerCapacity;
    }

    public String toString(){
        String message = String.format("Registration number: %s, driver: %s, passengers: %s, passenger capacity with driver: %s", 
        registrationNumber, driver, passengers.size(), passengerCapacity);
        return message;
    }



}
