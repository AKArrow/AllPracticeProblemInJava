class arraysort
{
	public static void main(String s[])
	{
		int a[] = new int[10];
		for(int i=0;i<10;i++)
		{
			double v = Math.floor(Math.random()*999%999+100);
			a[i]=(int)v;
		}
		int temp=0;
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array:");
		for(int k=0;k<10;k++)
		{
			System.out.println(a[k]);
		}
		System.out.println("Socond Largest Element:"+a[8]);
		System.out.println("Socond Smallest Element:"+a[1]);
	}
}