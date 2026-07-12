package day15;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Program_Datetime {
	public static void main(String[] args) {
		
		DateTimeFormatter formatter=
				DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
		LocalDateTime today=LocalDateTime.parse("20/05/2026 16:30:00",formatter);
		System.out.println(today);
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getHour());
		
		LocalDateTime current=LocalDateTime.now();
		System.out.println(current);
		
		
				

	}

}
