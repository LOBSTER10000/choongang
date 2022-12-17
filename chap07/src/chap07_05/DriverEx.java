package chap07_05;

import java.util.Scanner;
public class DriverEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		String is = scan.nextLine();
		if(is.equals("택시")) {
			driver.drive(taxi);
		} else if(is.equals("버스")) {
			driver.drive(bus);
		}
	}
}
