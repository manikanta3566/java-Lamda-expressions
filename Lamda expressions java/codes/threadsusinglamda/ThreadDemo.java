package codes.threadsusinglamda;

public class ThreadDemo {
    public static void main(String[] args) {

        // using anonymous class
        // Runnable thread1 = new Runnable() {
        // @Override
        // public void run() {
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i);
        // try {
        // Thread.sleep(2000);
        // } catch (InterruptedException e) {

        // e.printStackTrace();
        // }
        // }

        // }

        // };
        // Thread t1=new Thread(thread1);
        // t1.start();

        Runnable thread1 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        };
        Thread t1=new Thread(thread1);
        t1.start();

    }

}
