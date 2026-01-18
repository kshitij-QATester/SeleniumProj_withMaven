package doubtssolve;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Checked Exceptions
		
	try
	{
	
		try
		{
			int a=12/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero..");
		}
		
		
		
		int a[]=new int[2];
		
		a[5]=567;
		
		
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Cannot store value in array as Indexing is given wrong");
	}
		
	

}

}