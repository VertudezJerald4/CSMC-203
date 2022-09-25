import java.util.Scanner;
public class OneFunctionCalculator {

	public static void main(String[] args) {
		
		int x;
		
		int y;
		
		try (Scanner scan = new Scanner(System.in)){
			System.out.print("Num 1:");
			
			x = scan.nextInt();
			
			System.out.print("Num 2:");
			
			y = scan.nextInt();
		}
		int sum = x + y;
		
		System.out.print("Result:" + sum);

	}

}
