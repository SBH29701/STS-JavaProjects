
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
int Spaces=n-1;
int Stars=1;
for(int i=1;i<=n;i++)
{
	for (int j=1;j<=Spaces;j++)
		System.out.print(" ");
	for(int j=1;j<=Stars;j++)
		System.out.print(" * ");
	System.out.println();
	Stars+=2;
	Spaces--;
}
	}

}
