package Java;

public class JavaRecord {
    public static void main(String[] args) {
        Person person = new Person("Anshika", 23);
        System.out.println(person.name());
        System.out.println(person.age());
    }
}

record Person(String name, int age){};


// We can also define records insdie the class such as below


// public class Company {
//     private final String name;
    
//     public Company(String name) {
//         this.name = name;
//     }

//     // Nested record inside the Company class
//     public record Employee(String name, int age) {}
// }
