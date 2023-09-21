package Object;
class AC
{
	int temp;
	boolean on=false;
	void switchOn() {
		on= true;
		temp=23;
		System.out.println("as is on, Current temp" +temp);
	}
	void IncreaseTemp() {
		if(on==false) {
			System.out.println("First Switch On the Ac");
			return;
		}
		temp++;
		System.out.println("Temp Increased");
	}
}
class Test4
{
	public static void main(String[] args)
	{
		AC ac1=new AC();
		ac1.switchOn();
		ac1.IncreaseTemp();
	}
}