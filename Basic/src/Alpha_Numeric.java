import java.util.Scanner;
public class Alpha_Numeric {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
	    String in=sc.next();
	    String num=in.replaceAll("[^0-9]","");
	   
	    String number[]=num.split("\\s+");
	    int  sum=0;
	    for(String temp:number)
	    {
	    	Integer n=Integer.parseInt(temp);
	    	if(n!=0)
	    	{
	    		int a=n%10;
	    		n=n/10;
	    		sum=sum+a;
	    	}
	    }
	}

}
