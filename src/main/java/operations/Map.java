package operations;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

  static class Student {
    int age;
    String name;

    Student(int age, String name) {
      this.age = age;
      this.name = name;

    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }

  public static void main(String[] args) {
    Student s1 = new Student(22, "Adit");
    Student s2 = new Student(23, "Ankit");
    Student s3 = new Student(24, "Shivam");
    Student s4 = new Student(25, "Satyam");

    List<Student> studentList = Arrays.asList(s1, s2, s3, s4);

    List<Integer> ages = studentList.stream().map(student -> student.getAge())
      .collect(Collectors.toList());

    ages.forEach(System.out::println);

  }
}
