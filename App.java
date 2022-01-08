public class App {
    public static void main(String[] args) throws Exception
    {

        //first way to create a thread 

        MyThread thread1 = new MyThread();

        //second way to create a thread

        MRunnable runnable = new MRunnable();
        Thread thread2 = new Thread(runnable);

        //time to start the threads 

        thread1.start();
        thread2.start();

    }
}
