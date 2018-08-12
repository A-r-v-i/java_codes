package stringP;
import java.util.*;
public class Anagram {
	static void isAnagram(String str1,String str2)
	{
		String S1=str1.replaceAll("\\s","");
		String S2=str2.replaceAll("\\s","");
		boolean  status=true;
		
		if(S1.length()!=S2.length())
			status=false;
		
		else {
			char[] ArrayS1=S1.toLowerCase().toCharArray();
			char[] ArrayS2=S2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
		    
			status=Arrays.equals(ArrayS1,ArrayS2);
		}
		if(status)
		{
			System.out.println("yeah");
		}
		else
			System.out.println("naah");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		isAnagram(s1,s2);
	}

}
