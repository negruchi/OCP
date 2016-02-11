package ocp12_;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedMovie
{
  static void printMovieDetails(ResourceBundle rb)
  {
    String movieName = rb.getString("MovieName");
    Long revenue = (Long)rb.getObject("GrossRevenue");
    Integer year = (Integer)rb.getObject("Year");

    System.out.println("Movie " + movieName + " (" + year + ") " + "grossed " + revenue);
  }

  public static void main(String[] args)
  {
    printMovieDetails(ResourceBundle.getBundle("ResBundle", Locale.ITALIAN));
    printMovieDetails(ResourceBundle.getBundle("ResBundle", Locale.getDefault()));

  }
}