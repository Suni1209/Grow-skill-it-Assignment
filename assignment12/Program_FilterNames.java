package assignment12;
import java.util.Arrays;
import java.util.List;

public class Program_FilterNames {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Aman", "Riya", "Ankit", "Tushar");

        list.stream()
            .filter(name -> name.endsWith("a"))
            .forEach(System.out::println);

	}

}
