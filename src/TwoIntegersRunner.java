import java.util.Scanner;
public class TwoIntegersRunner 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = input.nextInt();
		System.out.print("Enter a number: ");
		int num2 = input.nextInt();
		System.out.println();
		
		TwoIntegers twoIntegers = new TwoIntegers(num1, num2);
		String arithmetic = twoIntegers.arithmetic();
			System.out.println(arithmetic);
		String larger = twoIntegers.larger();
			System.out.println(larger + " is larger.");
		boolean isEven = twoIntegers.isEven();
			System.out.println("Sum is even = " + isEven + ".");
		boolean isMultiple = twoIntegers.isMultiple();
			System.out.println(num1 + " is a multiple of " + num2 + " = " + isMultiple + ".");
	}
}
