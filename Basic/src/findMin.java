import java.util.Scanner;
public class findMin {
public static void main(String[] args) {
	
	
	Scanner input=new Scanner(System.in);
	
	System.out.println("Enter a: ");
	int in1=input.nextInt();
	System.out.println("Enter b: ");
	int in2=input.nextInt();
	int result=minFunction(in1,in2);
	System.out.println("Minimum value: "+result);
	

}
private static int minFunction(int in1, int in2) {
	int min;
	if(in1<in2)
		min=in1;
	else
		min=in2;
	
	// TODO Auto-generated method stub
	return min;
}
    
}
