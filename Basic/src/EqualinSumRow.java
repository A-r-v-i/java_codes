import java.util.Scanner;
public class EqualinSumRow {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	int[][] arr=makearray(m);
	finalArray(arr,m);
	//transpose(arr,m);
}
static int[][] makearray(int m) {
	int[][] arr=new int[m][m];
	int c=1;
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<m;j++)
		{
			arr[i][j]=c++;
		}
	}
	return arr;
}
static int[][] resultArray(int[][] arr,int m)
{
	int[][] res=new int[m][m];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<m;j++)
		{
			res[i][j]=arr[j][(i+j)%m];
		}
	}
	return res;
}
static void finalArray(int[][] res,int m)
{
	int[][] array=resultArray(res,m);
	for(int i=0;i<m;i++)
	{
		if(i%2==0)
		{
		for(int j=0;j<m;j++)
		{
			System.out.print(array[i][j]+" ");
		}
		}
		else{
		for(int j=m-1;j>=0;j--)
		{
			System.out.print(array[i][j]+" ");
		}
		}System.out.println();
	}
}
/*static void transpose(int[][] res,int m)
{
	int[][] transpose=new int[m][m];
	for(int  i=0;i<m;i++)
	{
		for(int  j=0;j<m;j++)
		{
			transpose[i][j]=array[j][i];
		}
	}
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<m;j++)
		{
			System.out.print(transpose[i][j]+"  "); 		
		}System.out.println();
	}
	}*/
}
