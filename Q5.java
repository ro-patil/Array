package HomeWork;

public class Q5 {

	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,6,7,8,9};
		int i=0,j=a.length-1;
		while(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;j--;
		}
		for (int j2 = 0; j2 < a.length; j2++)
		{
			System.out.print(a[j2]+" ");
		}
	}

}
