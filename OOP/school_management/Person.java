package school_management;

/**
 * Person
 */

abstract class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        if (age >= 5 && age <= 100) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid age. Must be between 5 and 100.");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 5 && age <= 100) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid age. Must be between 5 and 100.");
        }
    }

    abstract public void getRole();

}

class Student extends Person {
    private char grade;

    public Student(String name, int age, char grade) {
        super(name, age);
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public void getRole() {
        System.out.println("Role: Student");
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Grade: " + getGrade());
        getRole();
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void getRole() {
        System.out.println("Role: Teacher");
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Subject: " + getSubject());
        getRole();
    }
    
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Gaurav Chaudhari", 2, 'A');
        Teacher t1 = new Teacher("Kavita Patil", 47, "Maths");
        s1.displayInfo();
        System.out.println("--------------------");
        t1.displayInfo();
    }
}