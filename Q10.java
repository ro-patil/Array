package HomeWork;

public class Q10 {

	public static void main(String[] args) 
	{
		int [][] a= {{1,2,3},
					 {4,5,6},
					 {7,8,9}};
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(max<a[i][j])
					max=a[i][j];
			}
		}
		System.out.println(max);
	}

}
