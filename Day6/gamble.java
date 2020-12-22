class gamble
{
	public static void main(String s[])
	{
		int gmb=100;
		while(gmb>=0&&gmb<=200)
		{
			double t = Math.floor(Math.random()*10%2);
			if(t==1){gmb++;}
			else{gmb--;}
		}
		if(gmb>=200){System.out.println("Win: "+gmb);}
		else{System.out.println("Lose: "+gmb);}
	}
}