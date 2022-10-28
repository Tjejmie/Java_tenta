
import java.util.ArrayList;
import java.util.Collections;
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
        String randomFirstName = firstNames[random.nextInt(firstNames.length)];
        String randomLastName = lastNames[random.nextInt(lastNames.length)];

        ArrayList<String> randomL = new ArrayList<>();
        randomL.add("A");
        randomL.add("B");
        randomL.add("C");
        randomL.add("D");

        String driverLicense = null;
        ArrayList<String> newList = new ArrayList<>();
        
        // Random nummer, 0 = inget körtkort
        int randomNum =  random.nextInt(randomL.size());
        for(int i = 0; i < randomNum; i++){
            int randomIndex = random.nextInt(randomL.size());
            newList.add(randomL.get(randomIndex));
            // Tar bort så det inte blir dupes
            randomL.remove(randomIndex);
        }
        Collections.sort(newList);
        driverLicense = String.join("", newList);
        
        person.setName(randomFirstName, randomLastName);
        int randomAge = random.nextInt(81);
        person.setAge(randomAge);
        person.setDriversLicense(driverLicense);

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
        if (license == null){
            this.driversLicense = null;
        }
        else if (license.toUpperCase().contains("A") || license.toUpperCase().contains("B") || license.toUpperCase().contains("C") || license.toUpperCase().contains("D")){
            this.driversLicense = license;
        }
        else{
            this.driversLicense = null;
        }
        
    }
    public String getDriversLicense(){
        return driversLicense;
    }
    public String toString(){
        String message = String.format("%s %s, %s (%s)", firstName, lastName, age, driversLicense);
        return message;
    }
}
