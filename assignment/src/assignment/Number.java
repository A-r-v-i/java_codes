
package assignment;

public class Number {
public static void last(int n)
{
	int a,b,count;
    
	for(a=5;a>=n;a--) {
		count=5;
		for (b=5;b>=a;b--) {
			System.out.println(count+" ");
			count-=1;
		}
	}System.out.println( );
}
	public static void main(String args[])
	{
		int n=1;
		last(n);
	}
}
