import java.util.*;
public class FindAvg {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int n3=sc.nextInt();
	int n4=sc.nextInt();
	int n5=sc.nextInt();
	int totavg=sc.nextInt();
	int tot5=n1+n2+n3+n4+n5;
	double n6=totavg*6-tot5;
	System.out.printf("%.2f",n6);
}
}
