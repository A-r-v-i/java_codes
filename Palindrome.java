package javatpoint_problems;
import java.util.Scanner;
public class Palindrome {

	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	String in = sc.next();
	char[] name = in.toCharArray();
	System.out.println("Enter your name: ");
	int i,j;
	int len=name.length;
	for(i=0;i<len;i++)
	{
     for(j=len-1;j>0;j--)
     {
    	 if(name[i]==name[j])
    	 {
    		 }
     }
	} System.out.println("it is palindrome");
	
	}
	

}
