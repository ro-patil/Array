package HomeWork;

public class Q25 {

	public static void main(String[] args)
	{
		Student s1=new Student(1, "aaaa", 88);
		Student s2=new Student(2, "bbbb", 62);
		Student s3=new Student(3, "cccc", 98);
		Student s4=new Student(4, "dddd", 52);
		Student s5=new Student(5, "eeee", 78);
		Student[] s= {s1,s2,s3,s4,s5};
		for (int i = 0; i < s.length; i++)
		{
			for (int j = i+1; j < s.length; j++) 
			{
				if(s[i].marks>s[j].marks)
				{
					Student temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for (int i = 0; i < s.length; i++)
		{
			System.out.println(s[i].rollno+" "+s[i].name+" "+s[i].marks);
		}
	}

}
