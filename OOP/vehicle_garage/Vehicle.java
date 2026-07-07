package OOP.vehicle_garage;
class Vehicle {
    private String brand;
    private int speed;

    //constructor
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        // if (speed > 0) {
        //     this.speed = speed;
        // } else {
        //     System.out.println("Speed must be positve");
        // }
        this.speed = speed;
        
    }

    //getter
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    //setter
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            System.out.println("Speed must be positive");
        }
    }

    public void describe() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed());
    }
}

class Car extends Vehicle {

    public Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Type: Car");
    }

}

class Bike extends Vehicle {

    public Bike(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Type: Bike");
    }
    
}

class Main {
    public static void main(String[] args) {
        Vehicle[] garage = {new Car("Toyota", 120), new Bike("Bajaj", 180)};
        for (Vehicle v : garage) {
            v.describe();
            System.out.println("----");
        }
    }
}