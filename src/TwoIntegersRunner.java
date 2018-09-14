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
		twoIntegers.arithmetic();
		twoIntegers.larger();
		twoIntegers.isEven();
		twoIntegers.isMultiple();
	}
}
