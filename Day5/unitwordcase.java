import java.util.Scanner;
class unitwordcase
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Unit:");
		int n = sc.nextInt();
		switch(n)
		{
			case 1:System.out.println("ONE");break;
			case 10:System.out.println("TEN");break;
			case 100:System.out.println("ONE HUNDRED");break;
			case 1000:System.out.println("ONE THOUSAND");break;
			case 10000:System.out.println("TEN THOUSAND");break;
			case 100000:System.out.println("ONE LAKH");break;
			default:System.out.println("OUT OF BOUNDS");break;
		}
	}
}