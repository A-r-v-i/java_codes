import java.util.*;
public class MatrixSumofEle {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
int[][] a=new int[m][n];
for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++)
	{
		a[i][j]=sc.nextInt();
	}
}
int temp=0;
for(int i=0;i<m;i++)
{
	for(int j=0;j<n;j++)
	{
		temp+=a[i][j];
	}
}System.out.println(temp);
}
}