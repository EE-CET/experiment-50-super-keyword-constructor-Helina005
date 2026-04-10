


class Person {
    // Constructor of the parent class
    public Person() {
        System.out.println("Person class");
    }
}

class Student extends Person {
    // Constructor of the child class
    public Student() {
        // The super() call must be the first statement in the constructor
        super(); 
        System.out.println("Student class");
    }
}
public class SuperConstructorDemo {
    public static void main(String[] args) {
        // Creating an object of the child class automatically triggers 
        // the constructor chain (Student -> Person)
        Student student = new Student();
    }
}