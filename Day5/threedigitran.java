class threedigitran
{
	public static void main(String s[])
	{
		int a[] = new int[5];
		int tot=0;
		for(int i=0;i<5;i++)
		{
			double v = Math.floor(Math.random()*999%999+100);
			System.out.println(i+" Value Is: "+(int)v);
			a[i]=(int)v;
		}
		for(int i=0;i<5;i++)
		{
			tot=tot+a[i];
		}
		System.out.println("Sum Of Five Random Numbers:"+tot);
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum Value:"+max);
		int min=max;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum Value:"+min);
	}
}