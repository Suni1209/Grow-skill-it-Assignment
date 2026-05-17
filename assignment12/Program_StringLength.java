package assignment12;
import java.util.Arrays;
import java.util.List;

public class Program_StringLength {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Automation", "API", "Playwright");

        list.stream()
            .filter(str -> str.length() > 5)
            .forEach(System.out::println);

	}

}
