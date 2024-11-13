package stopwatch;

import timeControl.IOControl;
import timeControl.TimeControl;

public class Stopwatch {
	
	private IOControl ioControl;
	private TimeControl timeControl;
	
	private Thread ioControlThread;
	private Thread timeControlThread;
	
	private Stopwatch() {

	}

	private static Stopwatch instance = new Stopwatch();

	public static Stopwatch getInstance() {
		return instance;
	}

	public void run() {
		ioControlThread.start();
	}

	public void start() {

	}

	
}
