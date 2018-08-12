import java.util.*;
public class Series1 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int temp=0,res=0;
	while(n>9)
	{
		temp=n%10;
		n=n/10;
		res=temp*n;
		} System.out.println(res+" ");
    
  }
}