import java.io.*;
class arithmatic
{
	public static void main(String s[])
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Three Numbers:");
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			int c = Integer.parseInt(br.readLine());
			int op1=a+b*c;
			System.out.println("Opration 1:"+op1);
			int op2=c+a/b;
			System.out.println("Opration 2:"+op2);
			int op3=a%b+c;
			System.out.println("Opration 3:"+op3);
			int op4=a*b+c;
			System.out.println("Opration 4:"+op4);
			int ar[] = new int[4];
			ar[0]=op1;
			ar[1]=op2;
			ar[2]=op3;
			ar[3]=op4;
			int max=0;
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]>max)
				{
					max=ar[i];
				}
			}
			int min=max;
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]<min)
				{
					min=ar[i];
				}
			}
			System.out.println("Minimum Value:"+min);
			System.out.println("Maximum Value:"+max);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}