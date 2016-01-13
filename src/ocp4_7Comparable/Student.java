package ocp4_7Comparable;

public class Student implements Comparable<Student>
{
  Integer studentID;
  String name;
  String surname;

  public Student(Integer studentID, String name, String surname)
  {
    super();
    this.studentID = studentID;
    this.name = name;
    this.surname = surname;
  }

  public String toString()
  {
    return studentID + "\t" + name + "\t" + surname + "\r";
  }

  public int compareTo(Student that)
  {
    return this.studentID.compareTo(that.studentID);
  }
}
