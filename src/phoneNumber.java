/**
 * 
 * @author Philip Wellener
 * Comp Sci
 * Period 7
 *
 */
import java.util.Scanner;
public class phoneNumber 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is your name: ");
		String name = in.nextLine();
		System.out.print("What is your phone number: ");
		String number = in.next();
		in.nextLine();
		in.close();
		
		String areaCode = number.substring(0, 3);
		String middleThree = number.substring(3, 6);
		String finalFour = number.substring(6, 10);
		
		String phoneNum = "(" + areaCode + ")-" + middleThree + "-" + finalFour;
		System.out.printf("%-20s %s", name, phoneNum);
		
	}
	

}
