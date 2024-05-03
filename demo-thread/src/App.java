public class App {
    public static void main(String[] args) throws Exception {
        
        //Approach 1: A class to implement Runnable interface (Thread constructor)
        Task task = new Task("Thread no 1");
        Task task2 = new Task("Thread no 2");
        Task task3 = new Task("Thread no 3");

        //Approach 2: :Lambda to create a runnable object
        // Runnable task2 = () ->{
        //     System.out.println("I'm task 2, and running");
        // };

        //Approach 3: MyThread extends Thread
        MyThread myThread = new MyThread();
        myThread.start();// 

        Thread th1 = new Thread(task);
        th1.start(); //trigger run method()...

        Thread th2 = new Thread(task2);
        th2.start();

        Thread th3 = new Thread(task3);
        th3.start();

        try{
            th1.join();
            th2.join();
            th3.join();
        } catch(InterruptedException e){
            
        }

        System.out.println("main ends");
    }
}
