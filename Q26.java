package HomeWork;

public class Q26 {

	public static void main(String[] args) 
	{
		int [] a={3,7,90,20,5,50,40};
		int k=3;
		int minAvg=Integer.MAX_VALUE;
		int minindex=0;
		for (int i = 0; i < a.length-k; i++) 
		{
			int s=0;
			for (int j = i; j < i+k; j++)
			{
				s=s+a[j];
			}
			if(s/k<minAvg)
			{
				minAvg=s/k;
				minindex=i;
			}
		}
		System.out.println(minAvg);
		System.out.println(minindex);
		
	}

}
