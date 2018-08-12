package javatpoint_problems;
import java.util.Scanner;
public class Factorial {
	
public static void main(String args[])
{
	{
		Scanner sc = new Scanner(System.in);
		int in= sc.nextInt();
		System.out.println("Enter the number: ");
		int i,num=1;
		for(i=0;i<=in;i++)
		{
			num=num*i;
		}System.out.println("output= "+num);
	}

	
}

}