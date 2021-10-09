package HomeWork;

public class Q3 {

	public static void main(String[] args)
	{
		int [] a= {1,2,3,4,5};
		int c=0,num=3;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]==num)
				c++;
		}
		int b[]= new int[a.length-c];
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=num)
				b[index++]=a[i];
		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(b[i]+" ");
		}
	}

}
