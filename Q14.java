package HomeWork;

public class Q14 {

	public static void main(String[] args)
	{
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,4,5};
		if(a.length==b.length)
		{
			int c=0;
			for (int i = 0; i < b.length; i++) 
			{
				if(a[i]!=b[i])
				{
					c++;
					break;
				}
			}
			if(c==0)
				System.out.println("equal");
			else
				System.out.println("not");
		}
		else
			System.out.println("not");
	}

}
