package funPaint;

public abstract class Shape
{
  //Each Shape can be drawn inside another Shape object
  private Shape parentShape;
  int serial;

  //protected static class Color //Watch out! The type Shape.Color is not visible to test.TestColor
  //static class Color //Watch out! The type Shape.Color is not visible to test.TestColor
  //public/*static*/class Color //No enclosing instance of type Shape is accessible. Must qualify the allocation with an enclosing instance of type Shape (e.g. x.new A() where x is an instance of Shape).
  public static class Color
  {
    int red, green, blue;
    static int brightness = 0;

    public Color()
    {
      this(0, 0, 0);
    }

    public Color(int red, int green, int blue)
    {
      this.red = red;
      this.green = green;
      this.blue = blue;
    }

    public String toString()
    {
      return " red: " + red + " green:" + green + " blue: " + blue;
    }

    public int getRed()
    {
      return red;
    }

    public static int getBrightness()
    {
      return brightness;
    }


  }

  public abstract double area();

  // parentShape
  public void setParentShape(Shape parentShape)
  {
    this.parentShape = parentShape;
  }

  public static void main(String[] args)
  {
    Color color = new Color();
  }
}
