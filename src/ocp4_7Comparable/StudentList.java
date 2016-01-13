package ocp4_7Comparable;

import java.util.Arrays;

public class StudentList
{
  Student[] students = new Student[4];

  public static void main(String[] args)
  {
    StudentList sl = new StudentList();
    sl.students[0] = new Student(2022, "Ringo", "Starr");
    sl.students[1] = new Student(4000, "George", "Harrison");
    sl.students[2] = new Student(3000, "Paul", "Mcartney");
    sl.students[3] = new Student(1001, "John", "Lennon");

    System.out.println("Not ordered: \n" + "ID \t NAME \t SURNAME");
    System.out.println(sl.toString());

    Arrays.sort(sl.students);
    System.out.println("Now ordered: ");
    System.out.println(sl.toString());

    System.out.println("Now sorted: ");
    Arrays.sort(sl.students, new SurnameComparator());
    System.out.println(sl.toString());
  }

  public String toString()
  {
    String list = "";
    for (int i = 0; i < this.students.length; i++)
      list += this.students[i] + "\n";
    return list;
  }

}
