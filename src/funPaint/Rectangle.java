package funPaint;

public class Rectangle extends Shape
{
  int height, lenght;

  // The abstract method area() in the abstract class shape must be implemented, because Rectangle extends Shape and it is not abstract
  public double area()
  {
    return height * lenght;
  }


}
