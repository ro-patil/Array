package HomeWork;

public class Q27 {

	public static void main(String[] args) 
	{
		char[] s1= {'a','b','c','d','e','f','g'};
		char[] s2= {'w','x','y','z'};
		char[] s=new char[s1.length+s2.length];
		int index=0;
		for (int i = 0; i < s1.length || i < s2.length; i++) 
		{
			if(i<s1.length)
				s[index++]=s1[i];
			if(i<s2.length)
				s[index++]=s2[i];
		}
		for (int i = 0; i < s.length; i++)
		{
			System.out.print(s[i]+" ");
		}
	}

}
