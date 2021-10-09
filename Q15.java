package HomeWork;

public class Q15 {

	public static void main(String[] args) 
	{
		int[] a= {5,9,3,8,6,4,7,1,2};
		for (int i = 0; i < a.length; i++)
		{
			int c=0;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]<a[j])
				{
					c++;break;
				}
			}
			if(c==0)
				System.out.println("leader"+a[i]);
		}
	}

}
