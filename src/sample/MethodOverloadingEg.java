package sample;

public class MethodOverloadingEg {
	String name;
	int stud_Id;
	double average;
	public void StudentDatabase()
	{
		System.out.println("Default value:\n Name:"+name+"\nStudent id:"+stud_Id+"\nAverage"+average);
	}
	public void StudentDatabase(int stud_Id,String name,double average)
	{
		System.out.println("\n Name:"+name+"\nStudent id:"+stud_Id+"\nAverage"+average);
	}
	public int StudentDatabase(int Stud_Id)
	{
		System.out.println("Having return type");
		return stud_Id=500;
	}

	public static void main(String[] args) {
		MethodOverloadingEg obj=new MethodOverloadingEg();
		obj.StudentDatabase();
		obj.StudentDatabase(2047, "Priya", 7.5);
		obj.StudentDatabase(2047);
		

	}

}
