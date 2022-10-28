public class Task2 {
    public static void main(String[] args){



        Person person = new Person("Anders", "Andersson", 23);

        // --------------------- CAR

        System.out.println("Creating car with driver: ");
    
        Car car = new Car("ABC123", 5, null);
        person.setDriversLicense("B");
        car.setDriver(person);
        System.out.println(car);
        System.out.println("Add random passenger: ");
        
        car.addPassenger(Person.getRandomPerson());
        car.addPassenger(Person.getRandomPerson());
        car.addPassenger(Person.getRandomPerson());
        car.addPassenger(Person.getRandomPerson());
        for (Person c: car.passengers){
            System.out.println(c);
        }
        
        System.out.println("Try to add one more than max capacity: ");
        car.addPassenger(Person.getRandomPerson());
        System.out.println("What is the authorization to drive this vechicle?: " + car.getAuthorizationClass());

        // --------------------- Scooter
        System.out.println("Creating scooter with driver: ");
        Scooter scooter = new Scooter("AIK123", 0);
        scooter.setDriver(person);
        System.out.println(scooter);
        System.out.println("Try to add passenger to scooter: ");
        scooter.addPassenger(Person.getRandomPerson());

    }
}
