import bank.*;   // import everything from bank package

class Student {
    String name;
    int age;

    // Method
    public void printInfo() {
        System.out.println(name);
        System.out.println(age);
    }

    // Copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    // Default constructor
    Student() {
    }
}

public class Demo1 {
    public static void main(String args[]) {
        // Student object
        Student s1 = new Student();
        s1.name = "Roshan";
        s1.age = 12;

        // Print s1 info
        s1.printInfo();

        // Use copy constructor
        Student s2 = new Student(s1);
        s2.printInfo();

    }
}
