import java.util.Scanner;
class primefactor
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number:");
		int n = sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			while(n%i==0)
			{
				System.out.print(i+" ");
				n=n/i;
			}
		}
	}
}