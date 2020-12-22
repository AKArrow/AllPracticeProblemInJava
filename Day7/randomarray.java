class randomarray
{
	public static void main(String s[])
	{
		int a[] = new int[10];
		for(int i=0;i<10;i++)
		{
			double v = Math.floor(Math.random()*999%999+100);
			a[i]=(int)v;
		}
		for(int k=0;k<10;k++)
		{
			System.out.println(a[k]);
		}
		int max=0;
		for(int i=0;i<10;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		int max2=0;
		for(int i=0;i<10;i++)
		{
			if(a[i]>max2&&a[i]!=max)
			{
				max2=a[i];
			}
		}
		System.out.println("Second Largest Element:"+max2);
		int min=a[0];
		for(int i=0;i<10;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		int min2=a[0];
		for(int i=0;i<10;i++)
		{
			if(a[i]<min2&&a[i]!=min)
			{
				min2=a[i];
			}
		}
		System.out.println("Second Smallest Element:"+min2);
	}
}