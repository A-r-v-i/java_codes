class Antenna
{
	void pass()
	{
		System.out.println("All clear!!");
	}
}
class Total extends Antenna{
	void pass()
	{
		System.out.println("No Arrears!!");
	}
	void finals()
	{
		System.out.println("Everyone is happie!!!");
	}
}
public class Upcasting {
	public static void main(String args[])
	{
		Antenna ant = new Antenna();
		Total tot = new Total();
		ant.pass();
		tot.pass();
		tot.finals();
		
		//upcasting
		Antenna ant1=tot;
		ant1.pass();
	
	    //downcasting
		Antenna ant2=new Antenna();
		Total tot1=(Total)ant2;
		ant2.pass();//exception is  occuring
		
	}
	

}
