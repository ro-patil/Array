package ClassWork;

public class Q2 {

	public static void main(String[] args) 
	{
		int [] a= {1,2,3,4,5,6,7,8,9};
		int s=0,e=a.length-1,num=7;
		while(true)
		{
			int mid=(s+e)/2;
			if(a[mid]==num)
			{
				System.out.println("found");
				break;
			}
			else if(a[mid]<num)
				s=mid+1;
			else
				e=mid-1;
			if(s>e)
			{
				System.out.println("not found");
				break;
			}
		}
	}

}
