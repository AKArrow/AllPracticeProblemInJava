import java.io.*;
class unitconversioncase
{
	public static void main(String s[])
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter A Value:");
			int a = Integer.parseInt(br.readLine());
			System.out.println("Enter A Conversion Type:\n1.Feet To Inch\n2.Inch To Feet\n3.Feet To Meter\n4.Meter To Feet");
			int n = Integer.parseInt(br.readLine());
			switch(n)
			{
				case 1:System.out.println("Conversion:"+((float)a*12));break;
				case 2:System.out.println("Conversion:"+((float)a/12));break;
				case 3:System.out.println("Conversion"+((float)a/3.281));break;
				case 4:System.out.println("Conversion"+((float)a*3.281));break;
				default:System.out.println("OUT OF BOUNDS");break;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}