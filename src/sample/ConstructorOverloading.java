package sample;

public class ConstructorOverloading {
	Integer id,experience;
	String name,designation;
	ConstructorOverloading(){	}
	ConstructorOverloading(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	ConstructorOverloading(int id,String name,int experience)
	{
		this.id=id;
		this.name=name;
		this.experience=experience;
	}
	ConstructorOverloading(int id,String name,int experience,String designation)
	{
		this.id=id;
		this.name=name;
		this.experience=experience;
		this.designation=designation;
	}
	public void display()
	{
		System.out.println("ID          :"+id);
		System.out.println("NAME        :"+name);
		System.out.println("EXPERIENCE  :"+experience+"years");
		System.out.println("DESIGNATION :"+designation);
	}

	public static void main(String[] args) {
		ConstructorOverloading cons1=new ConstructorOverloading();
		ConstructorOverloading cons2=new ConstructorOverloading(2047,"priya");
		ConstructorOverloading cons3=new ConstructorOverloading(2047,"priya",5);
		ConstructorOverloading cons4=new ConstructorOverloading(2047,"priya",5,"Engineer");
		cons1.display();
		cons2.display();
		cons3.display();
		cons4.display();
	}
}
