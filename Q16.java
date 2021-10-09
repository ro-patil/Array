package HomeWork;

public class Q16 {

	public static void main(String[] args) 
	{
		int [] a= {1,2,3,4,5,6,7,8,9};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++)
		{
			if(min>a[i])
				min=a[i];
			if(max<a[i])
				max=a[i];
		}
		System.out.println(max-min);
	}

}
