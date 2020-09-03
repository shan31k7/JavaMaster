package dateTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

// immutable - cannot edit, pass by value - 
// mutable - can be edited, pass by reference - 

//Date
//Calendar
public class Learn_LocalDateTime {

	@Test
	public void demo_LocalDate() {
		LocalDate local = LocalDate.of(2020, 2, 20);
		System.out.println(local);
	}

	@Test
	public void demo_LocalTime() {
		LocalTime time = LocalTime.now();

		System.out.println(time);

	}

	@Test
	public void demo_Calendar() {

		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());

		if (calendar.before(calendar.getTime())) {

		}

		Date date = new Date();

	}
}
