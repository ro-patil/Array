package HomeWork;
public class Q20 {
	public static void main(String[] args)
	{
		int [][] a= {{1,2,3,4,5,6},
				 {1,2,3,4,5,6},
				 {1,2,3,4,5,6},
				 {1,2,3,4,5,6},
				 {1,2,3,4,5,6},
				 {1,2,3,4,5,6}};
		int sum=0,count=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++)
			{
				if(i!=0 && j!=0 && i!=a.length-1 && j!=a[i].length-1)
				{
					sum=sum+a[i][j];
					count++;
				}
			}
		}
		System.out.println(sum);
		System.out.println(count);
		System.out.println("avg="+sum/count);
	}
}
