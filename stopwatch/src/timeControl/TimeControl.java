package timeControl;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TimeControl implements Runnable {
	private final SimpleDateFormat SIMPLE_DATE;

	private Calendar calendar;
	private long startTime;

	private boolean isRun = true;

	private TimeControl() {
		this.SIMPLE_DATE = new SimpleDateFormat("[hh시 mm분 ss초]", Locale.KOREA);
	}

	public static TimeControl instance = new TimeControl();

	public static TimeControl getInstance() {
		return instance;
	}

	public void checkStartTime() {
		this.startTime = getCurrentTime();
	}

	private long getCurrentTime() {
		return System.currentTimeMillis();
	}

	@Override
	public void run() {
		checkStartTime();
		while (isRun) {
			IOControl.buffer.append(getCurrentTime());

			try {
				IOControl.writer.append(IOControl.buffer);
				IOControl.writer.flush();

				Thread.sleep(1000);
			} catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
