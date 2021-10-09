package ClassWork;

public class Stack 
{
	int a[]=new int[3];
	int index=0;
	void push(int num)
	{
		if(index<a.length)
			a[index++]=num;
		else
			System.out.println("stack is full");
	}
	int pop()
	{
		if(index>0)
		{
			index--;
			int p=a[index];
			return p;
		}
		else
		{
			System.out.println("stack is empty");
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
