package assignment12;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program_SortNumbers {

	public static void main(String[] args) {
		
		 List<Integer> list = Arrays.asList(40, 10, 30, 20);

	        Collections.sort(list);

	        list.forEach(System.out::println);

	}

}
