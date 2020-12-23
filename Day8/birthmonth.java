import java.util.*;
class birthmonth
{
	public static void main(String s[])
	{
		HashMap<Integer, Integer> a92 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> a93 = new HashMap<Integer, Integer>();
		for(int i=0;i<50;i++)
		{
			double y = Math.floor(Math.random()*10%2);
			double m = Math.floor(Math.random()*99%12+1);
			if(y==1)
			{
				a92.put((i+1), (int)m);
			}
			else
			{
				a93.put((i+1), (int)m);
			}
		}
		System.out.println("Year 1992 Birthdays:"+a92);
		System.out.println("\nYear 1993 Birthdays:"+a93);
		int jan1=0,feb1=0,mar1=0,apr1=0,may1=0,jun1=0,jul1=0,aug1=0,sep1=0,oct1=0,nov1=0,dec1=0;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(Map.Entry<Integer, Integer> et:a92.entrySet())
		{
			int key=et.getKey();
			int value=et.getValue();
			for(Map.Entry<Integer, Integer> et1:a93.entrySet())
			{
				int key1=et1.getKey();
				int value1=et1.getValue();
				if(value==value1)
				{
					switch(value)
					{
						case 1:jan1++;break;
						case 2:feb1++;break;
						case 3:mar1++;break;
						case 4:apr1++;break;
						case 5:may1++;break;
						case 6:jun1++;break;
						case 7:jul1++;break;
						case 8:aug1++;break;
						case 9:sep1++;break;
						case 10:oct1++;break;
						case 11:nov1++;break;
						case 12:dec1++;break;
					}
				}
			}
		}
		hm.put("JAN",jan1);
		hm.put("FEB",feb1);
		hm.put("MAR",mar1);
		hm.put("APR",apr1);
		hm.put("MAY",may1);
		hm.put("JUN",jun1);
		hm.put("JUL",jul1);
		hm.put("AUG",aug1);
		hm.put("SEP",sep1);
		hm.put("OCT",oct1);
		hm.put("NOV",nov1);
		hm.put("DEC",dec1);
		System.out.println("Birthday In Same Month Of All:\n"+hm);
	}
}