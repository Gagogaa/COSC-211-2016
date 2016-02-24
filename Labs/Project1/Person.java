/**
 * Gregory Mann
 * E01457245
 * COSC 211
 * Section: 0
 * Winter 2016
 * 
 * This class simply stores the name and id of a person
 */

public class Person {
    
    private String name;
    private int id;
    
    // Constructor with default vars
    public Person() {
    name = null;
    id = 0;
    }
    
    // Constructor with non default vars
    public Person(String newName, int newId) {
        name = newName;
        id = newId; 
    }
    
    // Copy constructor
    public Person(Person otherPerson) { 
        name = otherPerson.getName();
        id = otherPerson.getId();
    }
    
    // Sets the name of the object
    public void setName(String name) {
        this.name = name;
    }
    
    // Sets the name of a specific Person object 
    public static void setName(Person p, String newName) {
        p.setName(newName);
    }
    
    
    // Returns the name of the given object 
    public String getName() {
        return name;
    }
    
    // Sets the id of the object 
    public void setId(int id) {
        this.id = id;
    }
    
    // Sets the id of the a specific Person object
    public static void setId(Person p, int newId) {
       p.setId(newId);
    }
    
    // Returns the id of the given object
    public int getId() {
        return id;
    }
    
    // Compares two Person objects and returns true if the names and ids are the same
    public boolean equals(Person otherPerson) {
        return name.equalsIgnoreCase(otherPerson.getName());
    }
    
    // Returns a string of the name and id
    public String toString() {
        return name + " " + id;
    }
}

/**
 * Tom 1111
 * Mary 2222
 * Mary 2222
 * Persons p2 and p3 are equal
 * Persons p1 and p2 are being modified:
 * Jim 1234
 * Jimmy 1234
 * Persons p1 and p2 have different names
 * Persons p1 and p2 have the same id
 */