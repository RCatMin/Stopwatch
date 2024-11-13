package timeControl;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class TimeControl implements Runnable {
	private final SimpleDateFormat SIMPLE_DATE;

	private Calendar calendar;
	private long startTime;
	private long elapsedTime;

	private boolean isRun = true;

	private TimeControl() {
		this.SIMPLE_DATE = new SimpleDateFormat("[hh시 mm분 ss초]", Locale.KOREA);
	}

	public static TimeControl instance = new TimeControl();

	public static TimeControl getInstance() {
		return instance;
	}

	// 시작 시간 초기화
	public void initStartTime() {
		this.startTime = getCurrentTime();
	}

	public void reset() {
		this.startTime = 0;
		this.elapsedTime = 0;
	}

	public long getCurrentTime() {
		return System.currentTimeMillis();
	}

	public long getElapsedTime() {
		return this.elapsedTime;
	}

	private void recordElapsedTime() {
		elapsedTime += getCurrentTime() - startTime;
	}

	public void start() {
		initStartTime();
		this.isRun = true;
	}

	public void stop() {
		recordElapsedTime();
		this.isRun = false;
	}

	@Override
	public void run() {
		while (isRun) {
			try {
				
			}
		}
	}

}
