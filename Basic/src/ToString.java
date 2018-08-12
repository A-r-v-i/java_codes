class First
{
	private int id;
	private String name;
	public First(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return String.format("%2d : %2s", id,name);
	}
}
public class ToString {
	public static void main(String args[])
{
	

	First first = new First(15,"Kaatuchiruki");
	First first1 = new First(16,"Kaatuchiruki");
	First first2= new First(17,"Kaatuchiruki");
	First first3 = new First(18,"Kaatuchiruki");
	
	System.out.println(first);
	System.out.println(first1);
	System.out.println(first2);
	System.out.println(first3);
	
	
	
}	

}
