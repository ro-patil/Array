package HomeWork;

public class Q28 {

	public static void main(String[] args)
	{
		int [][] a= {{6,3,1},{9,7,8},{2,4,5}};
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				int c=0,b=0;
				for (int k = 0; k < a[i].length; k++) 
				{
					if(a[i][j]>a[i][k])
					{
						c++;break;
					}
				}
				for (int k = 0; k < a.length; k++) 
				{
					if(a[i][j]<a[k][j])
					{
						b++;break;
					}
				}
				if(c==0 && b==0)
					System.out.println(a[i][j]);
			}
		}
	}

}
