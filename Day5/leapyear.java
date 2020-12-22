import java.util.Scanner;
class leapyear
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Year:");
		int y = sc.nextInt();
		if(y%4==0)
		{
			if(y%100==0)
			{
				if(y%400==0)
				{
					System.out.println(y+" Is Leap Year!");
				}
				else
				{
					System.out.println(y+" Is Not Leap Year!");
				}
			}
			else
			{
				System.out.println(y+" Is Leap Year!");
			}
		}
		else
		{
			System.out.println(y+" Is Not Leap Year!");
		}
	}
}