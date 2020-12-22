class cointosswh
{
	public static void main(String s[])
	{
		int head=0,tail=0;
		while(head<=11&&tail<=11)
		{
			double t = Math.floor(Math.random()*10%2);
			if(t==1){head++;}
			else{tail++;}
		}
		System.out.println("Head Wins "+head+" Times!");
		System.out.println("Tail Wins "+tail+" Times!");
	}
}