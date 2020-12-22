import java.util.Scanner;
class facto
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number:");
		int n = sc.nextInt();
		int a[] = new int[100];
		for(int i=2;i<=n;i++)
		{
			while(n%i==0)
			{
				if(a[i]!=i)
				{
					a[i]=i;
				}
				else
				{
					a[i+1]=i;
				}
				n=n/i;
			}
		}
		for(int i=0;i<100;i++)
		{
			if(a[i]!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}