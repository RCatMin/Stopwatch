package timeControl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOControl implements Runnable{
	public static StringBuilder buffer;
	public static BufferedWriter writer;
	private BufferedReader reader;
	
	private IOControl() {
		IOControl.buffer = new StringBuilder();
		IOControl.writer = new BufferedWriter(new OutputStreamWriter(System.out));
		this.reader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public static IOControl instance = new IOControl();
	public static IOControl getInstance() {
		return instance;
	}
	
	public void printMenu() throws IOException {
		writer.append(" 스탑워치 ");
		writer.append("[S] STOP");
		writer.append("[H] HOLD");
		writer.append("[R] RERUN");
		
		writer.append(buffer);
		writer.flush(); // 남아 있는 스트림 모두 출력하면서 비우기
	}
	
	public void input() {
		try {
			String input = reader.readLine();
			buffer.append(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public void run() {
		
		
	}

}
