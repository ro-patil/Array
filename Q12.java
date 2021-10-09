package HomeWork;

public class Q12 {

	public static void main(String[] args) 
	{
		int [] a= {1,2,3,4,5,6,7,8,9};
		int ec=0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]%2==0)
				ec++;
		}
		int e[]=new int[ec];
		int o[]=new int[a.length-ec];
		int ei=0,oi=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
				e[ei++]=a[i];
			else
				o[oi++]=a[i];
		}
		for (int i = 0; i < o.length; i++)
		{
			System.out.print(o[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < e.length; i++) 
		{
			System.out.print(e[i]+" ");
		}
	}
}
