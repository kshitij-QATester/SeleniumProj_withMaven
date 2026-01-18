package basics;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int g=6, h=8;
		
		System.out.println("Addition of "+g+" and "+h+" is "+(g+h));
		System.out.println("Subtraction of "+g+" and "+h+" is "+(g-h));
		
		
		
		
		// % is called modulus 
		/*
		 
		 2)3
		 - 2
		 -----------
		 1  - Result
		 
		 */
		// 1==0
		int a=3;
		if(a%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		
		
		
		int c=67, d=67;
		
		if(c < d) // 67 < 67
		{
		  System.out.println(d+" is greater than "+c);	
		}
		else if(c > d) // 67 > 67
		{
			System.out.println(c+" is greater than "+d);
		}
		else if(c==d) //67===67
		{
			System.out.println("Both are equals..");
		}
		
		
		
		
		
		
	}

}
