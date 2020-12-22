import java.io.*;
class month
{
	public static void main(String s[])
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter A Day:");
			int day = Integer.parseInt(br.readLine());
			System.out.println("Enter A Month:");
			String month = br.readLine();
			if(month.equals("march"))
			{
				if(day>20 && day<31){System.out.println("True");}
				else{System.out.println("False");}
			}
			else if(month.equals("april"))
			{
				if(day>0 && day<30){System.out.println("True");}
				else{System.out.println("False");}
			}
			else if(month.equals("may"))
			{
				if(day>0 && day<31){System.out.println("True");}
				else{System.out.println("False");}
			}
			else if(month.equals("june"))
			{
				if(day>0 && day<20){System.out.println("True");}
				else{System.out.println("False");}
			}
			else
			{
				System.out.println("False");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
}