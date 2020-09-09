package dateTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Set;

import org.testng.annotations.Test;
// Date
// Calendar
// immutable - cannot edit, pass by value - 
// mutable - can be edited, pass by reference - 

public class Learn_LocalDateTime {

	@Test
	public void demo_LocalDate() {
		LocalDate today = LocalDate.now();
		System.out.println(today);

		LocalDate dob = LocalDate.of(1990, 2, 27);
		System.out.println(ChronoUnit.YEARS.between(dob,today));
		
		System.out.print(dob.getDayOfWeek());
		
	}

	@Test
	public void demo_LocalTime() throws InterruptedException {
		LocalTime time1 = LocalTime.now();
		Thread.sleep(2000);
		LocalTime time2 = LocalTime.now(ZoneId.of("US/Pacific"));
		System.out.println(ChronoUnit.MILLIS.between(time1, time2));
		
		Set<String> zones = ZoneId.getAvailableZoneIds();
		
		zones.forEach(System.out::println);

	}
}
