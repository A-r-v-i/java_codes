import java.util.*;
public class TypeCasting {
public static void main(String argsp[])
{
	Scanner sc=new Scanner(System.in);
	String in=sc.next();
	int ans;
	int temp=0;
	for(int i=0;i<in.length();i++)
	{
	char intp=in.charAt(i);
	 ans=(int) intp;
	 temp+=ans;
	}System.out.println(temp/7);
	
}
}
