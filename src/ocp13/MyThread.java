package ocp13;

public class MyThread implements Runnable
{

  @Override
  public void run()
  {
    System.out.println("Thread is Runnable");
    for (int i = 1; i < 10; i++) {
      System.out.println(Thread.currentThread().getName() + ": number is " + i);
      //System.out.println(Thread.currentThread().getName() + " state is " + Thread.currentThread().getState()); // WHY its state is runnable? if it is the current thread, should be RUNNING
      //sleep();
    }
  }

  private void sleep()
  {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public static void main(String[] args)
  {
    MyThread r = new MyThread();
    Thread t = new Thread(r);
    t.start();
  }

}
