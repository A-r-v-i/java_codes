package collections;
import java.util.*;

public class BasicCommands {
	public static void main(String args[])
	{
		ArrayList<String> one = new  ArrayList<String>();
		one.add("Prakkash");
		one.add("Allwin");
		one.add("Shanmugaprian");
		one.add("Surya");
		one.add("Aravind");
		one.add("Stanley");
		one.add("Praveen");
		one.add("Goddy");
		one.add("Sampath");
		one.add("Jayprathap");
		
		System.out.println("Enter your input:");
		Scanner get=new Scanner(System.in);
		String D=get.nextLine();
		
		one.add(D);
		
		one.remove(4);
		one.add(4,"Arvi");
		one.set(4, "Kishore");
		int A=one.size();
		int C=one.indexOf("Stanley");
		String B=one.get(12);
		
		
		System.out.println(one);
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(one.contains("Stanley"));
	}

}
