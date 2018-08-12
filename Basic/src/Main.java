import java.util.Scanner;
public class Main
{
void checkIndex()
{
	int p=9;
	int q=100;
	for(int i=p;i<=q;i++)
       {
			int n=i;
            
            int sq=n*n;
            int count=0;
            while(sq!=0)
           {
             count+=1;
           }
     
     for(int j=0;j<count;j++)
     {
         int num=(int) Math.pow(10,j);
         
         if(num==n)
         continue;
         
         int sum=sq%num+sq/num;
         if(sum==n)
         {
         System.out.println(n);;
         }
     }
	 }
    
	     
	}
	public static void main(String args[])
	{
		Main mainobj=new Main();
		mainobj.checkIndex();
	}
}
