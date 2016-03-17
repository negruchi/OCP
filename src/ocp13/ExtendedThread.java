package ocp13;

public class ExtendedThread extends Thread
{
  public void run()
  {
    System.out.println("Extended Thread");

  }

  public static void main(String[] args)
  {
    ExtendedThread et = new ExtendedThread();
    et.run();
  }
}
