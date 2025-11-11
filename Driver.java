/*
 * Name: Dudley Walker
 * ID: 2304910
 * Course: Object Oriented Programming (CIT2004)
 * Date: November 11, 2025
 * Lab Test 1
 */

import java.util.Scanner;

// Guest class - handles hotel guest info
class Guest {
    private String name;
    private String gender;
    private int age;
    private String address;
    private int roomNumber;
    private String creditCard = "DefaultCard123";

    // default constructor
    public Guest() {}

    // constructor with params
    public Guest(String name, String gender, int age, String address, int roomNumber) throws Exception {
        // room number validation
        if (roomNumber > 100) {
            throw new Exception("Error: Room number cannot be greater than 100.");
        }
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.roomNumber = roomNumber;
    }

    // setters
    public void setName(String name) { 
        this.name = name; 
    }
    
    public void setGender(String gender) { 
        this.gender = gender; 
    }
    
    public void setAge(int age) { 
        this.age = age; 
    }
    
    public void setAddress(String address) { 
        this.address = address; 
    }
    
    public void setRoomNumber(int roomNumber) throws Exception {
        if (roomNumber > 100) {
            throw new Exception("Error: Room number cannot be greater than 100.");
        }
        this.roomNumber = roomNumber;
    }

    // prints guest details
    public void display() {
        System.out.println("\n----- Guest Information -----");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Credit Card: " + creditCard);
    }
}

// Supplier class - for hotel suppliers
class Supplier {
    private String name;
    private String gender;
    private int age;
    private String address;

    // constructor
    public Supplier(String name, String gender, int age, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    // update age
    public void setAge(int age) {
        this.age = age;
    }

    // display supplier info
    public void display() {
        System.out.println("\n----- Supplier Information -----");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

// main driver class
public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // get guest info from user
            System.out.println("Enter Guest Information:");
            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Gender: ");
            String gender = input.nextLine();

            System.out.print("Age: ");
            int age = input.nextInt();
            input.nextLine(); // consume newline

            System.out.print("Address: ");
            String address = input.nextLine();

            System.out.print("Room Number: ");
            int roomNumber = input.nextInt();

            // create guest object
            Guest guest1 = new Guest(name, gender, age, address, roomNumber);
            guest1.display();

            // create supplier with hardcoded values
            Supplier supplier1 = new Supplier("Jack Black", "Male", 20,
                    "22 Yard Avenue, Golden Spring, St Andrew");
            supplier1.display();

            // update supplier age and display again
            supplier1.setAge(32);
            System.out.println("\nUpdated Supplier Information:");
            supplier1.display();

        } catch (Exception e) {
            System.out.println("\nException: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
