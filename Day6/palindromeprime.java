import java.io.*;
class palindromeprime
{
	void palindrome(int n)
	{
		int temp=0,a=0,b=0;
		temp=n;
		while(n!=0)
		{
			a=n%10;
			b=b*10+a;
			n=n/10;
		}
		if(temp==b)
		{
			System.out.println(temp+" Is Palindrome!");
		}
		else
		{
			System.out.println(temp+" Is Not Palindrome!");
		}
	}
	void prime(int n)
	{
		int flag = 0;
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
			palindrome(n);
		}
	}
	public static void main(String s[])
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			palindromeprime p = new palindromeprime();
			System.out.println("Enter Your Value");
			int v1 = Integer.parseInt(br.readLine());
			p.prime(v1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}