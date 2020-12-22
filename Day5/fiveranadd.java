class fiveranadd
{
	public static void main(String s[])
	{
		int a[] = new int[5];
		int tot=0;
		for(int i=0;i<5;i++)
		{
			double v = Math.floor(Math.random()*99%99+10);
			a[i]=(int)v;
		}
		for(int i=0;i<5;i++)
		{
			tot=tot+a[i];
		}
		System.out.println("Sum Of Five Random Numbers:"+tot);
		System.out.println("Average Of Five Random Numbers:"+(tot/5));
	}
}