package javatpoint_problems;
import java.util.Scanner;
public class AmstrongNumber
{
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int in = sc.nextInt();
	System.out.println("Enter the number: ");
	int num = 0,rem,out=0;
	while(in>=0)
	{
		rem=in%10;
		num=rem*rem*rem;
	    in=in/10;
	    out=out+num;
	}
	if(out==in) {
		System.out.println("HEre amstrong!");
	}
	else {
		System.out.println("Naah bruh!!!");
	}
	}
}
