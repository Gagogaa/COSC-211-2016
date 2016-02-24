public class Program1 {
    public static void main(String[] args) {
        //Driver Program 
        Person p1 = new Person("Tom", 1111);
        System.out.println(p1);

        Person p2 = new Person("Mary", 2222);
        System.out.println(p2);

        Person p3 = new Person(p2);
        System.out.println(p3);

        if (p2.equals(p3)) {
            System.out.println("Persons p2 and p3 are equal");
        } else {
            System.out.println("Persons p2 and p3 are unequal");
        }
        
        System.out.println("Persons p1 and p2 are being modified:");

        Person.setId(p1, 1234);
        p1.setName("Jim");
        System.out.println(p1);

        p2.setId(1234);
        Person.setName(p2, "Jimmy");
        System.out.println(p2);

        if (p1.getName().equals(p2.getName())) {
            System.out.println("Persons p1 and p2 have the same names");
        } else {
            System.out.println("Persons p1 and p2 have different names");
        }
        
        if (p1.getId() == p2.getId()) {
            System.out.println("Persons p1 and p2 have the same id");
        } else {
            System.out.println("Persons p1 and p2 have different id");
        }
    }
}