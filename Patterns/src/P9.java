
public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=5;
for (int i=1; i<=num; i++)
{
	for(int j=1; j<=num-i;j++)
		System.out.print(" ");
	for(int j=1; j<=(2*i)-1;j++)
	{
		if (j==1||j==2*i-1||i==num)
			System.out.print("*");
		else System.out.print(" ");
			
	}
	System.out.println();
}
	}

}
