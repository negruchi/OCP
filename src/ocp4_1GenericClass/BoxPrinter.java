package ocp4_1GenericClass;

public class BoxPrinter
{
  Object val;

  BoxPrinter(Object val)
  {
    this.val = val;
  }

  public static void main(String[] args)
  {
    BoxPrinter bpString = new BoxPrinter("This is a String");
    BoxPrinter bpInteger = new BoxPrinter(new Integer(10));

    System.out.println(bpString);
    System.out.println(bpInteger);
  }

  public String toString()
  {
    return this.toString();

  }
}
