package HomeWork;

public class Q36 {

	public static void main(String[] args)
	{
		int [] a= {1,2,5,4,1,6,1,5,9,6,1,8,9,5};
		int m=1,n=5;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]==m)
			{
				for (int j = 0; j < a.length; j++) 
				{
					if(a[j]==n)
					{
						int dist=0;
						if(i>j)
							dist=i-j;
						else
							dist=j-i;
						if(min>dist)
							min=dist;
					}
				}
			}
		}
		System.out.println(min);	
	}
}
