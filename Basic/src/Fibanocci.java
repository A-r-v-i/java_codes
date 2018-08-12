import java.util.Scanner;
public class Fibanocci {
	
	

	public static void main(String[] args) {

		int n1=0,n2=2,n3=5,count;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of count you need the fibano: ");
		int i1 = input.nextInt();
		
		
		for(count=0;count<=i1;count++) {
	    n1=n2;
	    n2=n3;
	    n3=n1+n2;
		System.out.println(n1);
		
		}

	}
}
