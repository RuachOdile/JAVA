package Homework;

class Records{
	int rollNUmber,age,fees;
	String name;
	
	void description(int rollNUmber,int age,String name,int fees) {
		this.name=name;
		this.rollNUmber=rollNUmber;
		this.fees=fees;
		this.age=age;
		
		System.out.println("Student "+name+" is "+age+" years old and has a roll number "+rollNUmber+" and his fees is "+fees);
	}
	
}

public class studentRecord {
	
	public String name;
	
	
	public void inName(String name) {
		this.name =name;
		
	}
	
	public String retName() {
		return name;
	}

	public static void main(String[] args) {
		
		Records obj=new Records();
		obj.description(4,14,"Binod",8500);
		

	}

}
