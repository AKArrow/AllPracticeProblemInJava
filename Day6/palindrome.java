import java.io.*;
class calculate
{
	void opration(int n)
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
}
class palindrome
{
	public static void main(String s[])
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			calculate c = new calculate();
			System.out.println("Enter Your Value");
			int v1 = Integer.parseInt(br.readLine());
			int v2 = Integer.parseInt(br.readLine());
			c.opration(v1);
			c.opration(v2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}