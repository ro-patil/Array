package HomeWork;

public class Q7 {

	public static void main(String[] args) 
	{
		int a[] = {3,5,2,1,6,9,7,4,8};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length-1; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
