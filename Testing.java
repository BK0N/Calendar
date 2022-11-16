package calendar_pkg;
import java.util.ArrayList;
import java.util.Scanner;
public class Testing {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input day: ");
		int inputday = input.nextInt();
		input.close();
		
		String[] Monthnames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		int[] Monthdates =    { 31  ,  28  ,  31  ,  30  ,  31  ,  30  ,  31  ,  31  ,  30  ,  31  ,  30  ,  31};
		for(int i = 0; i < 12; i++) 
		{
			System.out.println("");
			System.out.println(Monthnames[i]);
			inputday = month(inputday, Monthdates[i]);
		}
		

	}

	private static int month(int inputday, int amountofdays) {
		
		String[] weekdays = new String[7];
		
		weekdays[0] = "Su ";
		weekdays[1] = "Mo ";
		weekdays[2] = "Tu ";
		weekdays[3] = "We ";
		weekdays[4] = "Th ";
		weekdays[5] = "Fr ";
		weekdays[6] = "Sa ";
		
		for (int index = 0; index < 7; index++) 
		{ System.out.print(weekdays[index]); }
		
		System.out.println("");
		
		int weekday = 0;
		for(int i = 0; i < inputday; i++) 
		{
			System.out.print("   ");
			weekday++;
		}
		
		int cday = 1;
		
		for ( int i = 0; i <= 5; i++ )
		{
					
			for (int f = weekday;f < 7; f++, cday++)// This how weeks are counted
			{
				if (cday > amountofdays) 
				{
					
					inputday = f;
					f = 8;
					i = 6;
					break;
				}
				else 
				{
					System.out.print(String.format("%02d ",cday));
				}
			}
			
			System.out.println("");
			weekday = 0;
		}
	return inputday;
	}

}
