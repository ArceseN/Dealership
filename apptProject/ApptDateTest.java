package apptProject;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class ApptDateTest {

	@Test
	public void testClientAppt() {
		
		ClientAppt testing = new ClientAppt();
		LocalDate myObj = LocalDate.now();

		String result = testing.ClientAppt();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss"); 
		String formattedDate = myObj.format(myFormatObj);
		assertEquals(formattedDate, result);
		
		fail("Not yet implemented");
	}

}
