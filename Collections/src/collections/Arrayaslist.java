package collections;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Arrayaslist {
public static void main(String args[])
{
	ArrayList<String> obj=new ArrayList<String>();
	obj.add("Katta");
	obj.add("Kattap");
	obj.add("Kattapp");
	obj.add("Kattappa");
	obj.add("Kattappa!");
	/*for( int c=0;c<obj.size();c++)
	{
		System.out.println(obj.get(c));
	}
	
	for(String Enhanced:obj)
	{
		System.out.println(Enhanced);
	}
	
	int count=0;
	while(obj.size()>count)
	{
		System.out.println(obj.get(count));
		count++;
	}
	
	Iterator itr=obj.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
    */
	
	ArrayList<String> obj1=(ArrayList<String>)obj.clone();
	obj.set(1, "Karuvaya");
	System.out.println(obj1);
	System.out.println(obj);
	ArrayList<String> obj2=(ArrayList<String>)obj.clone();
	System.out.println(obj2);
}
}
