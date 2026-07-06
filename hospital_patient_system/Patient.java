package hospital_patient_system;

abstract class Patient {
    private int patientId; 
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        if (age >= 0 && age <= 120) {
           this. age = age; 
        } else {
            throw new IllegalArgumentException("Invalid Age");
        }
        
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract double calculateBill();

    public void printBill() {
        System.out.println("Patient Name: " + getName());
        System.out.println("Patient ID:" + getPatientId());
        System.out.println("Patient Age: " + getAge());
        System.out.println("Hospital Bill: " + calculateBill());
    }
}

class GeneralPatient extends Patient {
    private int numberOfDays;

    public GeneralPatient(int patientId, String name, int age, int numberOfDays) {
        super(patientId, name, age);
        this.numberOfDays = numberOfDays;
    }

    public int getNumberofdays() {
        return numberOfDays;
    }

    public void setNumberofdays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    public double calculateBill() {
        return (1000 * getNumberofdays());
    }
}

class SurgeryPatient extends Patient {
    private int numberOfDays;

    public SurgeryPatient(int patientId, String name, int age, int numberOfDays) {
        super(patientId, name, age);
        this.numberOfDays = numberOfDays;
    }

    public int getNumberofdays() {
        return numberOfDays;
    }

    public void setNumberofdays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    public double calculateBill() {
        return (1000 * getNumberofdays() + 15000);
    }
}

class ICUPatient extends Patient {
    private int numberOfDays;

    public ICUPatient(int patientId, String name, int age, int numberOfDays) {
        super(patientId, name, age);
        this.numberOfDays = numberOfDays;
    }

    public int getNumberofdays() {
        return numberOfDays;
    }

    public void setNumberofdays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    public double calculateBill() {
       return (5000 * getNumberofdays()); 
    }
}

class Main {
    public static void main(String[] args) {
        Patient[] patients = {
            new GeneralPatient(002, "Gaurav Chaudhari", 23, 3),
            new SurgeryPatient(312, "Rohit Chaudhari", 18, 2),
            new ICUPatient(31312, "Satya", 29, 3)
        };
        
        for(Patient p : patients) {
            p.printBill();
            System.out.println("-----------------");
        }
        
    }
}
