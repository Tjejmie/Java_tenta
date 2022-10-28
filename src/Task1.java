import java.io.Console;

public class Task1 {
    public static void main(String[] args) throws Exception {
        Console console = System.console();

        Person person = new Person(null, null, 0);
        Vehicle vehicle = new Vehicle(null, 0, null);

        // --------------- Person -------------
        String firstName = console.readLine("Vilket förnamn ska personen ha?  ");
        String lastName = console.readLine("Vilket efternamn ska personen ha?  ");
        person.setName(firstName, lastName);
        int age = Integer.parseInt(console.readLine("Vilken ålder ska personen ha?  "));
        person.setAge(age);
        String driverLicense = console.readLine("Vilket körkort ska personen ha?  ");
        person.setDriversLicense(driverLicense);
        System.out.println(person);

        // --------------- Veichle -------------
        String regNr = console.readLine("Vilket registreringsnummer ska fordonet ha?  ");
        vehicle.setRegistrationNumber(regNr);
        int maxPassengers = Integer.parseInt(console.readLine("Hur många passagerare ska fordonet ta?  "));
        vehicle.setPassengerCapacity(maxPassengers);
        vehicle.setDriver(person);

        // --------------- Add passengers -------------
        vehicle.addPassenger(Person.getRandomPerson());
        vehicle.addPassenger(Person.getRandomPerson());
        vehicle.addPassenger(Person.getRandomPerson());
        vehicle.addPassenger(Person.getRandomPerson());

        System.out.println(vehicle);
     

        
    }
}
