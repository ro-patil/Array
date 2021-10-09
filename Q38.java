package HomeWork;

public class Q38 {

	public static void main(String[] args) 
	{
		int a [] = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
		int c=0,sum=7;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]==a[j])
				{
					c++;break;
				}
			}
		}
		int [] b=new int[a.length-c];
		int index=0;
		for (int i = 0; i < a.length; i++)
		{
			int r=0;
			for (int j = 0; j < i; j++)
			{
				if(a[i]==a[j])
					r++;
			}
			if(r==0)
				 b[index++]=a[i];
		}
		for (int i = 0; i < b.length; i++)
		{
			for (int j = i+1; j < b.length; j++)
			{
				if(b[i]+b[j]==sum)
					System.out.println(b[i]+" "+b[j]);
			}
		}
	}

}
