package HomeWork;

public class Q13 {

	public static void main(String[] args) 
	{
		int [][] a= {{1,2,3},
				 	 {1,2,3},
				 	 {1,2,3}};
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				if(j+i==a.length-1)
					System.out.print(a[i][j]+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
