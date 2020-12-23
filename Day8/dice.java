import java.util.*;
class dice
{
	public static void main(String s[])
	{
		int one=0,two=0,three=0,four=0,five=0,six=0;
		while(one<=10&&two<=10&&three<=10&&four<=10&&five<=10&&six<=10)
		{
			double d = Math.floor(Math.random()*10%6+1);
			switch((int)d)
			{
				case 1:one++;break;
				case 2:two++;break;
				case 3:three++;break;
				case 4:four++;break;
				case 5:five++;break;
				case 6:six++;break;
			}
		}
		ArrayList<Integer> dic = new ArrayList<Integer>();
		dic.add(one);
		dic.add(two);
		dic.add(three);
		dic.add(four);
		dic.add(five);
		dic.add(six);
		System.out.println(dic);
		int max=0;
		for(int i=0;i<dic.size();i++)
		{
			if(dic.get(i)>max)
			{
				max=dic.get(i);
			}
		}
		System.out.println("Maximum Value:"+max);
		int min=max;
		for(int i=0;i<dic.size();i++)
		{
			if(dic.get(i)<min)
			{
				min=dic.get(i);
			}
		}
		System.out.println("Minimum Value:"+min);
	}
}