package ClassWork;

public class Queue 
{
	int a[]=new int[3];
	int index=0;
	void push(int num)
	{
		if(index<a.length)
			a[index++]=num;
		else
			System.out.println("Queue is full");
	}
	int pop()
	{
		if(index>0)
		{
			int p=a[0];
			for (int i = 0; i < index-1; i++)
			{
				a[i]=a[i+1];
			}
			index--;
			return p;
		}
		else
		{
			System.out.println("Queue is empty");
			return 0;
		}
	}
	void print()
	{
		for (int i = 0; i < index; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
