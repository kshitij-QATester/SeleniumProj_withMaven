package doubtssolve;

public class Throwblockexample {

	public static void checkAge(int age)
	{
		if(age < 18)
		{
			throw new ArithmeticException("Age is less than 18");
		}
		else
		{
			System.out.println("Age is correct..");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
checkAge(10);
	}

}
