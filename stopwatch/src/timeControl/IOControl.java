package timeControl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import stopwatch.Stopwatch;

public class IOControl implements Runnable {
	public static StringBuilder buffer;
	public static BufferedWriter writer;
	private BufferedReader reader;
	private Stopwatch stopwatch;

	private final String START = "S";
	private final String HOLD = "H";
	private final String RERUN = "r";

	private String select;
	private boolean isRun = true;

	private IOControl() {
		IOControl.buffer = new StringBuilder();
		IOControl.writer = new BufferedWriter(new OutputStreamWriter(System.out));
		this.reader = new BufferedReader(new InputStreamReader(System.in));
	}

	public static IOControl instance = new IOControl();

	public static IOControl getInstance() {
		return instance;
	}

	public void printMenu() {
		try {
			writer.append(" 스탑워치 ");
			writer.append("[S] START");
			writer.append("[H] HOLD");
			writer.append("[R] RERUN");
			writer.append(buffer);
			IOControl.buffer.setLength(0);
			writer.flush(); // 남아 있는 스트림 모두 출력하면서 비우기
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectMenu() {
		try {
			String input = reader.readLine();

			if (input.equals("S") || input.equals("H") || input.equals("R")) {
				select = input;
			}
		} catch (Exception e) {

		}
	}

	public static void print(String timeFormat) {
		try {
			buffer.append(timeFormat);
			writer.append(buffer);
			buffer.setLength(0);
			writer.flush();
		} catch (IOException e) {
		}
	}

	@Override
	public void run() {
		printMenu();
		while (isRun) {
			selectMenu();
			stopwatch = Stopwatch.getInstance();
			switch (select) {
			case START:
			case HOLD:
			case RERUN:
			}
		}
	}

}
