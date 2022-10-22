import java.util.Scanner;
public class date_time {

	public static void main(String[] args) {
		
		System.out.println("Month: ");
		Scanner scanner = new Scanner(System.in);
		String month = scanner.nextLine();
		
		System.out.println("Date: ");
		int date  = scanner.nextInt();
		
		System.out.println("Year: ");
		int year = scanner.nextInt();
		
		System.out.println("\n"+ month + " " + date + "," + year);
	}
}


