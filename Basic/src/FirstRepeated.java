import java.util.*;
public class FirstRepeated {
	static char isthereinhash(char str[])
	{
		HashSet<Character>  h=new HashSet<>();
		for(int i=0;i<str.length;i++)
		{
			char C=str[i];
			if(h.contains(C))
			return C;
			
			
		}return 0;
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	char[] arr=str.toCharArray();
	System.out.println(arr);
}
}
