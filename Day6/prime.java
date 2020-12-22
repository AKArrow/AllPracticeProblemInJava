import java.util.Scanner;
class prime
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		int flag=0;
		System.out.println("Enter A Number:");
		int n = sc.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println(n+" Is Not Prime!");
		}
		else
		{
			System.out.println(n+" Is Prime!");
		}
	}
}