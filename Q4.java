package ClassWork;

public class Q4 {

	public static void main(String[] args)
	{
		int a[] = {3,5,2,1,6,9,7,4,8};
		for (int i = 0; i < a.length; i++)
		{
			int temp=a[i];
			int j=i-1;
			while(j>=0)
			{
				if(temp<a[j])
					a[j+1]=a[j];
				else
				{
					a[j+1]=temp;
					break;
				}
				j--;
			}
			if(j==-1)
				a[0]=temp;
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}

}
