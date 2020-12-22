import java.io.*;
class calculate
{
	void celsius(int n)
	{
		System.out.println("Fahrenheit To Celsius:"+((n * 9/5) + 32));
	}
	void fahrenheit(int n)
	{
		System.out.println("Celsius To Fahrenheit:"+((n-32) * 5/9));
	}
}
class temp
{
	public static void main(String s[])
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			calculate c = new calculate();
			System.out.println("Enter Your Value");
			int v = Integer.parseInt(br.readLine());
			System.out.println("Enter Conversion Type:\n1.Fahrenheit To Celsius\n2.Celsius To Fahrenheit");
			int t = Integer.parseInt(br.readLine());
			switch(t)
			{
				case 1:c.celsius(v);break;
				case 2:c.fahrenheit(v);break;
				default:System.out.println("Out Of Choice!");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}