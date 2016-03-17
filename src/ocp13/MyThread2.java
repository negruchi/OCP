package ocp13;

public class MyThread2 implements Runnable
{

  @Override
  public void run()
  {
    System.out.println("Calculating a number");
    int i = 5;
    int result = 1;
    while (i > 0) {
      result = result * i;
      i--;
    }
    System.out.println("Result is " + result);
  }

}