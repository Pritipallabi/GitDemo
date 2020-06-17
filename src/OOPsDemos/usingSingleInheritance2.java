package OOPsDemos;

class Company
{
	public String compName;
	public String compAdd;
	
	public Company()
	{
		compName="MindQ Systems";
		compAdd="Hyderabad, India";
	}
	
	public void Display()
	{
		System.out.println("Company Name : "+ compName);
		System.out.println("Address : " + compAdd);
	}
}

class Emp extends Company
{
	public int empId;
	public String empName;
	public int Salary;
	
	@Override
	public void Display()
	{
		System.out.println("ID : " + empId);
		System.out.println("Name : "+ empName);
		System.out.println("Salary : "+ Salary);
		super.Display();
	}
}
public class usingSingleInheritance2 {

	public static void main(String[] args)
	{
		Emp obj=new Emp();
		obj.empId=100;
		obj.empName="Venkat";
		obj.Salary=50000;
		obj.Display();
	}

}














