import java.io.*;
class addtozero
{
	public static void main(String s[])
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int ar[] = new int[5];
			System.out.println("Enter 3 Numbers:");
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			int c = Integer.parseInt(br.readLine());
			ar[0]=(a+b+c);
			System.out.println("Sum: "+ar[0]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}