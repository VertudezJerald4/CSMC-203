import java.util.Scanner;
public class date_time {

	public static void main(String[] args) {
		
		System.out.println("Month: ");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		System.out.println("Date: ");
		int date  = scanner.nextInt();
		
		System.out.println("Year: ");
		int year = scanner.nextInt();
		
		if(month<=12) {
			
			System.out.println("\n"+ month + " " + date + "," + year);
			
		}else {
			System.out.println("Invalid Input!");
			
			class Date{
				
			}if(date>31) {
					
				System.out.println("\n"+ month + " " + date + "," + year);
				
			}else {
				
				System.out.println("Invalid Input!");	
				}
			}
		}
	
	}
	




