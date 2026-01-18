package encapsulationdemo;

public class Encapsulation {

	public int val;
	
	//PARAMETERIZED CONSTRUCTOR is acting like a setter method
	Encapsulation(int val)
	{
	this.val=val;	
	}
	
	public int getdata()
	{
		return val*val;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation e=new Encapsulation(4);
		
		System.out.println("Sqaure:- "+e.getdata());
	}

}
