import java.util.Scanner;
public class MaxinRow {
	public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
int[][] a=new int[m][n];
for(int i=0;i<m;i++)
{
    for(int j=0;j<n;j++)
    {
        a[i][j]=sc.nextInt();
    }
}
int max=0;
for(int i=0;i<m;i++)
{
    for(int j=0;j<n;j++)
    {
        if(max<a[i][j])
           max=a[i][j];
    }   
    System.out.println("The minimum element in "+i+" is "+max);
}
        }
}
