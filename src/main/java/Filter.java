import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
  public static void main(String[] args) {
    List<String> names = new ArrayList<String>();
    names.add("Adit");
    names.add("Ankit");
    names.add("Shivam");

    names.add("Satyam");
    names.add("Harshit");

    List<String> sortedNames = names.stream().filter(n -> n.equals("Adit")).collect(Collectors.toList());
    sortedNames.forEach(System.out::println);

  }
}
