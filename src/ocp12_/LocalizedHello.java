package ocp12_;

import java.util.Locale;
import java.util.ResourceBundle;


public class LocalizedHello
{
  public static void main(String[] args)
  {
    Locale locale = Locale.getDefault();
    ResourceBundle rb = ResourceBundle.getBundle("ResourceBundle", locale);
    System.out.println(rb.getString("Greeting"));
  }
}
