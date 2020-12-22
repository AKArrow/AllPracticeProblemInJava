class whpowertable
{
	public static void main(String s[])
	{
		int i=0;
		while(i<=256)
		{
			System.out.println("2^"+i+":"+(Math.pow(2,i)));
			i++;
		}
	}
}