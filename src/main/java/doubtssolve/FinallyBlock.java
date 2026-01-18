package doubtssolve;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try
		{
			
		
			System.out.println("Enter input");
		String a=sc.next();
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
		sc.close();
		
		
			System.out.println("Always execute at the end ");
		}
		
		
	}

}
