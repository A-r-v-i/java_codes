package assignment;
import java.util.Scanner;

public class OddorEven {
void checkInput()
{
	Scanner sc = new Scanner(System.in);
int input = sc.nextInt();
System.out.println("Enter any number: ");

if(input%2==0)
{
System.out.println("Input is even");
}
else {
	System.out.println("Input is odd");
}
}
public static void main(String args[])
{
OddorEven obj = new OddorEven();
obj.checkInput();
}
}