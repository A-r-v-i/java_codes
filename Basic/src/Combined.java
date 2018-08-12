import java.util.*;
public class Combined{
	/*static void isMedian(int arr[])
	{int l=arr.length;
		 if(l%2==1)
	        {
	        	System.out.println(arr[l+1]/2);
	        }
	        else
	        {
	        int median=arr[l]/2 + arr[l+1]/2;
	        System.out.println(median);
	        }
	       
	}*/
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int i=0,temp=0;
        while(i<N)
        {
            temp=temp+arr[i];
            i++;
        }
        System.out.println(temp/N);
      }
}