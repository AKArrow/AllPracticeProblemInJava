import java.util.Scanner;
class magicnumber 
{
	public static boolean isMagic(int n) 
	{
		int sum = 0; 
		while (n > 0 || sum > 9) 
		{
			if (n == 0) 
			{ 
				n = sum; 
				sum = 0; 
			} 
			sum += n % 10; 
			n /= 10; 
		} 
		return (sum == 1); 
	} 
	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number Between 1 To 100:");
		int n = sc.nextInt();
		if(isMagic(n)){System.out.println("Magic Number");} 
		else{System.out.println("Not A Magic Number");} 
	} 
}