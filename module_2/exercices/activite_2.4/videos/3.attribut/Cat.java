public class Cat 
{
	public Cat(String name, int age)
	{
		this.mName = name;
		this.mAge = age;
		System.out.println(this.mName + " - " + this.mAge);
	}

	// attribut private par defaut
	// m pour member
	private String mName;
	private int mAge;

}
