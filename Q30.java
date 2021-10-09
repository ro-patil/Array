package HomeWork;

public class Q30 {

	public static void main(String[] args) 
	{
		int[] a= {1,1,1,1,1,2,2,3,4};
		int[] n= {1,2,4};
		int lenght=0;
		for (int i = 0; i < a.length; i++) 
		{
			int c=0;
			for (int j = 0; j < n.length; j++) 
			{
				if(a[i]==n[j])
				{
					c++;break;
				}
			}
			int r=1;
			for (int j = 0; j < i; j++) 
			{
				if(a[i]==a[j])
					r++;
			}
			if(c==0)
				lenght++;
			if(r>2)
				lenght++;
		}
		int b[] =new int[lenght];
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{
			int c=0;
			for (int j = 0; j < n.length; j++) 
			{
				if(a[i]==n[j])
				{
					c++;break;
				}
			}
			int r=1;
			for (int j = 0; j < i; j++) 
			{
				if(a[i]==a[j])
					r++;
			}
			if(c==0)
				b[index++]=a[i];
			if(r>2)
				b[index++]=a[i];
		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println(b[i]);
		}
	}

}
