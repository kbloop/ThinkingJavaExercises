package atu.sw.ie;

public class Date {
	
	public static void main(String[] args) {
		String day, month;
		int date, year;
		day = "Wednesday";
		date = 12;
		month = "February";
		year = 2025;
		
		// American Date Format
		System.out.println("American format: ");
		System.out.print(day);
		System.out.print(", ");
		System.out.print(month);
		System.out.print(" ");
		System.out.print(date);
		System.out.print(" ");
		System.out.print(year);
		System.out.println(".");
		
		System.out.println("European format: ");
		System.out.print(day);
		System.out.print(" ");
		System.out.print(date);
		System.out.print(" ");
		System.out.print(month);
		System.out.print(", ");
		System.out.print(year);
		System.out.println(".");
	}
}
