package lab1;
import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year and hit return to determine if it is a leap year: ");
		
		int year = input.nextInt();
		
		if (year % 400 == 0) {
			System.out.println("True");
		}
		else if (year % 4 == 0 && year % 100 == 0) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

}
