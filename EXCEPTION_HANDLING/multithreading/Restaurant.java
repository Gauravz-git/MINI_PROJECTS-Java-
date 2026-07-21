package multithreading;

/**
 * MyThread
 */
class CookingTask extends Thread {
    private String task;

    public CookingTask(String task) {
        this.task = task;
    }

    //run() method
    public void run() {
        System.out.println(task + " is being prepared by " + Thread.currentThread().getState());
    }
}

public class Restaurant {
    public static void main(String[] args) {
        Thread t1 = new CookingTask("Pasta");
        Thread t2 = new CookingTask("VadaPav");
        Thread t3 = new CookingTask("Pizza");
        Thread t4 = new CookingTask("Chicken");
        Thread t5 = new CookingTask("Lapinos");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}

