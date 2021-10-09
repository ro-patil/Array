package HomeWork;

public class Q39 {

	public static void main(String[] args)
	{
		int [] a= {5, 1, 3, 6, 8, 2, 9, 0, 10};
		int inel=0,deel=0;
		if(a[0]>a[1])
		{
			deel=a[0];
			inel=a[1];
		}
		else
		{
			deel=a[1];
			inel=a[0];
		}
		int inec=1;
		for (int i = 2; i < a.length; i++) 
		{
			if(inel<a[i])
			{
				inel=a[i];
				inec++;
			}
			else if(deel>a[i])
				deel=a[i];
			else
			{
				System.out.println("no such possible sequence");
				break;
			}
		}
		int [] in=new int[inec];
		int [] de=new int[a.length-inec];
		int inindex=1,deindex=1;
		if(a[0]>a[1])
		{
			deel=a[0];
			de[0]=a[0];
			inel=a[1];
			in[0]=a[1];
		}
		else
		{
			deel=a[1];
			de[0]=a[1];
			inel=a[0];
			in[0]=a[0];
		}
		for (int i = 2; i < a.length; i++) 
		{
			if(inel<a[i])
			{
				inel=a[i];
				in[inindex++]=a[i];
			}
			else if(deel>a[i])
			{
				deel=a[i];
				de[deindex++]=a[i];
			}	
		}
		System.out.print("dec=");	
		for (int i = 0; i < de.length; i++)
		{
			System.out.print(+de[i]+" ");
		}
		System.out.println();
		System.out.print("in=");
		for (int i = 0; i < in.length; i++)
		{
			System.out.print(+in[i]+" ");
		}
	}

}
