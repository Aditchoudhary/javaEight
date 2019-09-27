import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Adit Choudhary
 * Stream.flatMap() helps in converting Collection<Collection<T>> to Collection<T>.
 * <p>
 * flatMap() = map() + Flattening
 * Convert list of lists to single list
 */
public class FlatMap {
  public static void main(String[] args) {

    List<String> charWithStringA = Arrays.asList("Adobe", "Adit", "And", "Asia");
    List<String> charWithStringB = Arrays.asList("Bhuvi", "Bangalore", "Bombay");
    List<String> charWithStringC = Arrays.asList("Calcutta", "coimbatore", "chicago");

    List<List<String>> chars = Arrays.asList(charWithStringA, charWithStringB, charWithStringC);

    List<String> results = chars.stream()
      //.flatMap(e-> e.stream().filter(f->f.equals("Adobe")))
      .flatMap(e -> e.stream())
      .filter(e -> e.equals("Adobe"))
      .map(String::toUpperCase)
      .collect(Collectors.toList());

    results.forEach(System.out::println);

  }
}
