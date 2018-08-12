package javatpoint_problems;
import java.util.Scanner;
public class PrimeNumber {
public static void main(String args[])
	{
	Scanner sc =new Scanner(System.in);
	int num = sc.nextInt();
	System.out.println("Enter any number:  ");

for(int i=2;i<=num/2;i++)
{
	if(num%i==0)
	{
		System.out.println("prime");
	}
	else {
		System.out.println("nop");
	}
}

	
}
}
