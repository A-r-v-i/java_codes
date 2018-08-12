import java.util.*;
public class Contagious
{
    static void isContagious(int[] arr)
    {
        int i=0;
        while(i<arr.length-1)
        {
         int next=i+1;
         if(next==arr[i+1])
         {
        	i++;
         }
         else {
        	 System.out.println("no");
         }
        }System.out.println("isContagious");
        
    }
    
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		int[] a={1,2,3,4,5};
		Contagious s = new Contagious();
		s.isContagious(a);
	}
}
