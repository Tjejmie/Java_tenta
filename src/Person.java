
import java.util.HashMap;
import java.util.Random;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String driversLicense = null;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static Person getRandomPerson(){
        Person person = new Person(null, null, 0);
        Random random = new Random();

        String [] firstNames = {"Lisa", "Maria", "Max", "Lukas", "Adam"};
        String [] lastNames = {"Svensson", "Andersson", "Lindquist", "Gunnarsson", "Olsson"};
        String [] driverLicenses = {"license1", "license2", "license3", "license4", "noLicense"};
        String randomFirstName = firstNames[random.nextInt(firstNames.length)];
        String randomLastName = lastNames[random.nextInt(lastNames.length)];
        String randomDriverLicense = driverLicenses[random.nextInt(driverLicenses.length)];
        person.setName(randomFirstName, randomLastName);

        int randomAge = random.nextInt(81);
        person.setAge(randomAge);
      
        person.setDriversLicense(randomDriverLicense);
        return person;
        
    }

    public void setName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setDriversLicense(String license){

        HashMap<String, String> licenses = new HashMap<String, String>();
        licenses.put("license1", "B");
        licenses.put("license2", "AB");
        licenses.put("license3", "BCD");
        licenses.put("license4", "DA");
        licenses.put("noLicense", null);

        this.driversLicense = licenses.getOrDefault(license, null);
  
    }
    public String getDriversLicense(){
        return driversLicense;
    }
    public String toString(){
        String message = String.format("%s %s, %s (%s)", firstName, lastName, age, driversLicense);
        return message;
    }
}
