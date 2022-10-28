public class Task3 {
    public static void main(String[] args) throws VehicleException{

        Car car = new Car("ABC123", 5, null);
        Person person = new Person("Marie", "Andersson", 17);
        Scooter scooter = new Scooter("AIK123", 0);
      
        // ------ CAR
        System.out.println("Try to set person with wrong age as driver: ");
        try {
            car.setDriver(person);
        } catch (VehicleException e) {
            System.err.println(e.getMessage());
        }
        person = new Person("Marie", "Andersson", 18);
        System.out.println("Try to set person with no license as driver: ");
        try {
            car.setDriver(person);
        } catch (VehicleException e) {
            System.err.println(e.getMessage());
        }
        person.setDriversLicense("CD");
        
        person.setDriversLicense("B");
        try {
            car.setDriver(person);
        } catch (VehicleException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(car);
        person = new Person("Adam", "Karlsson", 18);
        person.setDriversLicense("CD");
        System.out.println("Try to change driver to someone with wrong license: ");
        car.changeDriver(person);
        System.out.println(car);

        // --------- Scooter
        person = new Person("Marie", "Andersson", 14);
        System.out.println("Add person that is under 15");
        try {
            scooter.setDriver(person);
        } catch (VehicleException e) {
            System.err.println(e.getMessage());
        }
        person = new Person("Marie", "Andersson", 15);
        try {
            scooter.setDriver(person);
        } catch (VehicleException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(scooter);
      
        

    }
}