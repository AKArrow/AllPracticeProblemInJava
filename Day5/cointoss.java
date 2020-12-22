class cointoss
{
	public static void main(String s[])
	{
		double t = Math.floor(Math.random()*10%2);
		if(t==1)
		{
			System.out.println("Heads");
		}
		else
		{
			System.out.println("Tails");
		}
	}
}