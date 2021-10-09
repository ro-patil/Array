package ClassWork;

public class Q5 {

	public static void main(String[] args) 
	{
		int [] a= {1,-2,3,-4,5,-8,-7,6,9};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]<0 && a[j]>0)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
