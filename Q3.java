package ClassWork;

public class Q3 {

	public static void main(String[] args)
	{
		int a[] = {3,5,2,1,6,9,7,4,8};
		for (int i = 0; i < a.length; i++)
		{
			int min=i;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[min]>a[j])
					min=j;
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
