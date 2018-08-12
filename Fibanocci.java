package javatpoint_problems;
import java.util.Scanner;
public class Fibanocci {
	public static void  main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many numbers you want do fibanocci: ");
	int in =  sc.nextInt();
	int n1=0,j=1,k = 0;
	System.out.println(n1+"\n"+j);
	for(int  i=2;i<in;i++)
	{
		k=n1+j;
	
		System.out.println(k);
		n1=j;
		j=k;
	}

}
}
