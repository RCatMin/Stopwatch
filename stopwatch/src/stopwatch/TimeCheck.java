package stopwatch;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TimeCheck {
	private Calendar time = Calendar.getInstance(Locale.KOREA);
	private SimpleDateFormat nowTime = new SimpleDateFormat ("HH : MM : ss", Locale.KOREA);
	private StringBuilder buffer = new StringBuilder();
	
	private int hour;
	private int minute;
	private int second;
	
	protected void timeStop () {
		
	}
	
	protected void timeHold () {
		
	}
	
	protected void timeRun () {
		
	}
	
	protected void currentTime() {

	}
	
	
}
