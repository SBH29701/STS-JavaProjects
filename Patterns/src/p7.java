
public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
int Spaces=n-1;
int stars=1;
for(int i=1; i<=n; i++)
{
	for(int j=1;j<=Spaces; j++)
	{
		System.out.print("");
	}
	for(int j=1; j<=stars; j++)
	{
		if(j==1|| j==stars||i==n)
			System.out.print("*");
		else System.out.print("");
	}
	Spaces--;
	stars+=2;
	System.out.println();
}

	}

}
