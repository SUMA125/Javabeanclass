public class Employee 
{
	private String name;
	private double salary;
	public Employee(String name, double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public String getname()
	{
		return name;
	}
	public double getsalary()
	{
		return salary;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setsalary(double salary)
	{
		this.salary=salary;
	}
}

class Javabean1
{
	public static void main(String[] args) 
	{
		Employee e=new Employee("Trishool",35000);
		System.out.println(e.getname());
		System.out.println(e.getsalary());
		e.setname("Shivani");
		e.setsalary(50000);
		System.out.println(e.getname());
		System.out.println(e.getsalary());
	}
}
