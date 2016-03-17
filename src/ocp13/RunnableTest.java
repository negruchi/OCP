package ocp13;

public class RunnableTest
{
  Thread myThread = new Thread(new MyThread());
  public static void main(String[] args)
  {
    MyThread r1 = new MyThread();
    Thread pepe = new Thread(r1);
    pepe.setName("Pepe");
    MyThread2 r2 = new MyThread2();
    Thread luis = new Thread(r2);
    luis.setName("Luis");

    System.out.println("Main thread name is " + Thread.currentThread().getName());
    pepe.start();
    luis.start();
    //pepe.start(); //IllegalThreadStateException,
    death(pepe);
    System.out.println("Pepe is " + pepe.getState());

  }

  static void death(Thread t)
  {
    System.out.println("Now, the state of " + t.getName() + " is " + t.getState());
  }
}
