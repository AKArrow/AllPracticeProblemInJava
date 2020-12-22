import java.util.Scanner;
class unittoword
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Unit:");
		int n = sc.nextInt();
		if(n==1){System.out.println("ONE");}
		else if(n==10){System.out.println("TEN");}
		else if(n==100){System.out.println("ONE HUNDRED");}
		else if(n==1000){System.out.println("ONE THOUSAND");}
		else if(n==10000){System.out.println("TEN THOUSAND");}
		else if(n==100000){System.out.println("ONE LAKH");}
		else{System.out.println("OUT OF BOUNDS");}
	}
}