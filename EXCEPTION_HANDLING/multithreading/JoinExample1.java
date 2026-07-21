
public class JoinExample1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new InnerJoinExample1());
        t.start();
        t.join();
        System.out.println("Main thread completed");
    }
}

/**
 * InnerJoinExample1
 */
class InnerJoinExample1 implements Runnable{

    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                // wrap in unchecked exception or handle interruption
                throw new RuntimeException(e);
            }
            
        }
    }
    
}
