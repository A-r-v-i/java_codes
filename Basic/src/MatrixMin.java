import java.util.*;
public class MatrixMin {
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
int min=32567;
for(int i=0;i<m;i++)
{
    for(int j=0;j<n;j++)
    {
        if(min>a[i][j])
           min=a[i][j];
       }
}
    System.out.print("The minimum element is "+min);

        }
}
