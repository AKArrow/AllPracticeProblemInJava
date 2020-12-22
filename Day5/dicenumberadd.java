class dicenumberadd
{
	public static void main(String s[])
	{
		double a = Math.floor(Math.random()*10%6+1);
		double b = Math.floor(Math.random()*10%6+1);
		System.out.println("First Dice Number:"+(int)a);
		System.out.println("Second Dice Number:"+(int)b);
		System.out.println("Addition Of Dice Number:"+((int)a+(int)b));
	}
}