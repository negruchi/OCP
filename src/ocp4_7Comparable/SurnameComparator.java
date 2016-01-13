package ocp4_7Comparable;

import java.util.Comparator;

public class SurnameComparator implements Comparator<Student>
{

  @Override
  public int compare(Student o1, Student o2)
  {
    return o1.surname.compareTo(o2.surname);
  }

}
