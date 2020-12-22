import java.util.Scanner;
class primerange
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		int flag=0;
		System.out.println("Enter A Number:");
		int n = sc.nextInt();
		for(int j=1;j<=n;j++)
		{
			int no=j;
			for(int i=2;i<no;i++)
			{
				if(no%i==0)
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
				System.out.println(no+" Is Not Prime!");
			}
			else
			{
				System.out.println(no+" Is Prime!");
			}
		}
	}
}