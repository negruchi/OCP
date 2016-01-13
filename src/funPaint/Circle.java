package funPaint;

public class Circle
{
  private Point center;
  private int radius;

  public Circle(int xPos, int yPos, int r)
  {
    center = new Point(xPos, yPos);// Ganesh says that you need to prefix with a reference to the Outer class, but it SEMMS IT IS NOT NECESSARY!!  `
    //center = this.new Point(xPos, yPos)
  }

  class Point
  {
    private int xPos, yPos;

    public Point(int xPos, int yPos)
    {
      this.xPos = xPos;
      this.yPos = yPos;
    }

    public String toString()
    {
      return " (xPos: " + xPos + ", yPos: " + yPos + ")";
    }
  }

  public String toString()
  {
    return "mid point: " + center + " radius: " + radius;
  }

  public static void main(String[] args)
  {
    System.out.println(new Circle(10, 10, 20));
  }
}
