
public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=7;
int Spaces=n/2;
int Stars=1;
for (int i=1;i<=n;i++)
{
	for(int j=1; j<=Spaces; j++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=Stars;j++)
		System.out.print("*");
	if(i<n/2 +1)
	{
		Stars+=2;
		Spaces--;
	}
	else {
		Stars-=2;
		Spaces++;
	}
	System.out.println();
}
	}

}
