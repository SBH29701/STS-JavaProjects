package Inheritance;

public class Phone {
void call()
{
	System.out.println("Call Executed");
}
{
	class CameraPhone extends Phone
	{
		void takepic()
		{
			System.out.println("Picture Clicked");
		}
	}
	class smartphone extends Cameraphone
	{
		void Installapp()
	}
	{
		System.out.println("Installation Executed");
	}
}
public class T2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SmartPhone sp= new SmartPhone();
sp.call();
sp.takepic();
sp.installapp();
	}
}

