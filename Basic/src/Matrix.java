import java.util.*;
public class Matrix {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	int n=sc.nextInt();
	int[][] mat=new int[m][n];
	int[][] matrans=new int[m][n];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
		mat[i][j]=sc.nextInt();	
		}
	}
	System.out.println("Matrix:");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(mat[i][j]+" ");
		}System.out.println();
	}
	System.out.println("Transpose matrix");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			matrans[i][j]=mat[j][i];
		}
	}
	
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(matrans[i][j]+" ");
		}System.out.println();
	}
	
}
}