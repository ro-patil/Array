package ClassWork;

public class Q7 {

	public static void main(String[] args) 
	{
		int a[] = {1, 1, 2};
		int c=0;
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
		int b[]=new int[a.length-c];
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
		int count=0;
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b.length; j++) 
			{
				System.out.println(b[i]+" "+b[j]);
				count++;
			}
		}
		System.out.println(count);
	}
}
