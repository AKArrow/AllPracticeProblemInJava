import java.util.Scanner;
class powertable
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number:");
		int n = sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			System.out.println("2^"+i+":"+(Math.pow(2,i)));
		}
	}
}