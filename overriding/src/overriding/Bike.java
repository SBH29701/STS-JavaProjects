package overriding;

public class Bike {
public void riding()
{
	System.out.println("BMW Jupiter");
}
class Bmw extends Bike
{
	public void riding()
	{
		System.out.println("BMW Racer");
	}
	public static class Wish
	{
	public static void main(String[] args) {
Bmw bmw=new Bmw();
bmw.riding();
	}

	}
}
}

