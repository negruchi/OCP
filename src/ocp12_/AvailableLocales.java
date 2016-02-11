package ocp12_;

import java.util.Locale;

public class AvailableLocales
{
  public static void main(String[] args)
  {
    Locale locale = Locale.getDefault();
    System.out.println("The default Locale is " + locale);
    System.out.println("The country is " + locale.getCountry() + " and stands for " + locale.getDisplayCountry());
    String variant = locale.getVariant();
    System.out.println("The variant " + variant);
    System.out.println("Resumed: " + locale.toString());

    Locale[] locales = Locale.getAvailableLocales();
    for (Locale local : locales) {
      System.out.printf("Locale code: %s and it stands for %s %n", local, local.getDisplayName());
    }
  }

}
