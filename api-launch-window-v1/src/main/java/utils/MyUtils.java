package utils;


public class MyUtils {

	public static double calculateScore(double temp, double ws, double wd) {
		return Math.abs(20 - temp) + ws + Math.abs(220 - wd) * 0.1;
	}

}
