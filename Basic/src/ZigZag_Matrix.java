import java.util.*;
public class ZigZag_Matrix {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[][] arr=toFormMatrix(n);
	showArray(arr,n);
	
}

private static void showArray(int[][] arr, int n) {
	int[][] array=new int[n][n];
	for(int i=0;i<n;i++)
	{
		if(i%2==0)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
		else {
			for(int j=n-1;j>=0;j--)
			{
				System.out.print(arr[i][j]+" ");
			}
		}System.out.println();
	}
}

private static int[][] toFormMatrix(int n) {
	int[][] arr=new int[n][n];
	int flag=1;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			arr[i][j]=flag++;
		}
	}
	return arr;
}
}
