package HomeWork;

public class Q32 {

	public static void main(String[] args)
	{
		int [][] a= {{1,2,3},{1,2,3},{1,2,3}};
		int sum=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if(j-i==0)
					sum=sum+a[i][j];
			}
		}
		System.out.println(sum);
	}

}
