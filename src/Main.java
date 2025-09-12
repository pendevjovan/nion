public class Main {
    public static void main(String[] args) throws InterruptedException {
        // TODO: Create a single PrinterTask object
        PrinterTask pt = new PrinterTask();

        Thread w1 = new Thread(pt);
        w1.setName("Worker-1");
        Thread w2 = new Thread(pt);
        w2.setName("Worker-2");

        // TODO: Create two threads using the same task
        // Name them "Worker-1" and "Worker-2"

        // TODO: Start both threads
        w1.start();
        w2.start();

        w1.join();
        w2.join();

        // TODO: Use join() to wait for both threads to finish
    }
}
