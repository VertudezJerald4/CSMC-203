import java.util.Scanner;
import java.io.IOException;

public class Activity3
{
	public static void main(String[] args) throws IOException
	{
		Scanner scanner = new Scanner(System.in);
		boolean done = false;
	do 
	{
		System.out.print("number of Test Cases");
		int tc = scanner.nextInt();
		System.out.println("Uber & Grab");
		
		if(1<= tc && tc <=10)
		{
			String inputs[] = new String[tc];
			for(int i = 0; i < tc; i++)
				
			{
				scanner = new Scanner(System.in);
				inputs[i] = scanner.nextLine();
			}
				System.out.println();
				System.out.println("\nResult: ");
				System.lineSeparator();
				
				for(String input : inputs)
					System.out.println(processInput(input));
				done = true;
		}
		else
			System.out.println("\nInputs must be 1-10 only");
	}
	while(!done);
	scanner.close();
	}
	private static String processInput(String input)
	{		
		String[] inputs = input.split("\\s");
		
		if(inputs.length !=2)
			return "Invalid Input";
		
		try
		{
			int UBER = Integer.parseInt(inputs[0]);
			int GRAB = Integer.parseInt(inputs[0]);
			
			if (UBER < GRAB)
				return "First";
			else if (UBER > GRAB)
				return"Second";
			else
				return "Any";
		}
		catch (Exception e)
		{
			return "Invalid Input";
			
			}
		}
	}

