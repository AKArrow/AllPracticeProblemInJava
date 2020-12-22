class repeattwice
{
	public static void main(String s[])
	{
		int a[] = new int[100];
		for(int i=0;i<100;i++)
		{
			a[i]=i;
		}
		for(int i=0;i<100;i++)
		{
			if(i%11==0)
			{
				System.out.println(a[i]);
			}
		}
	}
}