package overriding;

public class classParent {
	public static void call()
	{
		System.out.println("9999999999");
	}
}
class Child extends Parent
{
	public void call()
	{
		System.out.println("8888888888");
	}
public class AskingNotes{

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child child=new Child();
child.call();
	}

}
