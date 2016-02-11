package ocp12_;

import java.util.ListResourceBundle;

public class ResBundle_it_IT extends ListResourceBundle
{

  private static Object[][] contents = {{"MovieName", "Che Bella Giornata"}, {"GrossRevenue", (Long)43000000L}, // in euros
    {"Year", (Integer)2011}};

  @Override
  protected Object[][] getContents()
  {
    return contents;
  }

}
