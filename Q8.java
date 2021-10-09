package HomeWork;

public class Q8 {

	public static void main(String[] args) 
	{
		int [] a= {1,2,3,4,5,6,7,9};
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++)
		{
			if(max<a[i])
				max=a[i];
		}
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]!=max && max2<a[i])
				max2=a[i];
		}
		System.out.println(max2);
	}

}
