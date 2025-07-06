package atu.sw.ie;

public class Time {
	
	public static void main(String[] args) {
		int hour, minute, second;

//		Current Time		
		second = 51;
		minute = 40;
		hour = 02;
		
//		Number of seconds since midnight
		int secondsElapsed = hour*60*60 + minute*60 + second;
		System.out.print(secondsElapsed);
		System.out.println(" seconds elapsed since midnight.");
		
//		Number of seconds remaining in the day
		int secondsInDay = 24*60*60;
		System.out.print(secondsInDay - secondsElapsed);
		System.out.println(" seconds remaining today.");
		
//		Percentage of the day that has passed
		System.out.print(secondsElapsed *100 / secondsInDay);
		System.out.println(" percent of the day passed.");
	}
}
