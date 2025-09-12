// TODO: Define PrinterTask class that implements Runnable
class PrinterTask implements Runnable {
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(Thread.currentThread().getName() + " Running task " + i);
        }
    }
}
