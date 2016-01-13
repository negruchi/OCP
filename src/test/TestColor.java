package test;

import funPaint.Shape;

public class TestColor
{
  public static void main(String[] args)
  {
    //Shape shape = new Shape(); it is abstract!
    //Color white = new Color(255, 255, 255); //Color cannot be resolved to a type
    Shape.Color white = new Shape.Color(255, 255, 255); //Static inner class
    System.out.println("White color has values: " + white.toString());

    // Access the members of a static nested class
    white.getRed();
    Shape.Color.getBrightness();


  }
}
