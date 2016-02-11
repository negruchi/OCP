package ocp12_;

import java.util.ListResourceBundle;

public class ResBundle extends ListResourceBundle
{
  static final Object[][] contents = {{"MovieName", "Avatar"}, {"GrossRevenues", 2334567L}, {"Year", 2009}};

  @Override
  protected Object[][] getContents()
  {
    return contents;
  }


}
