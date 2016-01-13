package funPaint;


public class StatusReporter
{
  static Shape.Color getDescriptiveColor(final Shape.Color color) //Must be final: otherwise, Cannot refer to the non-final local variable color defined in an enclosing scope
  {
    class DescriptiveColor extends Shape.Color
    {
      public String toString()
      {
        return "You selected a color with RGB values " + color;
      }
    }
    //Here, the DescriptiveColor class has already been defined. But not before!!!
    return new DescriptiveColor(); // Returns an instance of DescriptiveColor, because it is a subclass of Shape.Color

  }

  static Shape.Color getAnonymousDescriptiveColor(final Shape.Color color) //Must be final: otherwise, Cannot refer to the non-final local variable color defined in an enclosing scope
  {
    //Here, the DescriptiveColor class has already been defined. But not before!!!
    return new Shape.Color() // The class keyword is not needed
    {
      public String toString()
      {
        return "You selected an anonymous color with  RGB values " + color;
      }
    };
  }

  public static void main(String[] args)
  {
    Shape.Color descriptiveColor = StatusReporter.getDescriptiveColor(new Shape.Color(155, 155, 155)); // The toString() method used is the overrided method in DescriptiveColor.
    System.out.println(descriptiveColor);

    Shape.Color descriptiveAnonimousColor = StatusReporter.getAnonymousDescriptiveColor(new Shape.Color(155, 155, 155)); // The toString() method used is the overrided method in DescriptiveColor.
    System.out.println(descriptiveAnonimousColor);
  }
}
