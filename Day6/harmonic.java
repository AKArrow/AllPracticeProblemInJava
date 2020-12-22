import java.util.Scanner;
class harmonic
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number:");
		int n = sc.nextInt();
		System.out.println("Hn=");
		for(int i=1;i<=n;i++)
		{
			System.out.print("1/"+i+"+");
		}
	}
}