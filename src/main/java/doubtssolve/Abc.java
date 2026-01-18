package doubtssolve;

import java.util.Arrays;

public class Abc {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
     
      
		 try {
			 int[] arr = new int[3];
	            arr[5] = 10;  // ArrayIndexOutOfBoundsException
	            
	            
	        } catch (ArithmeticException e) {
	            System.out.println("Arithmetic Exception occurred: " + e.getMessage());
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array Index Exception occurred: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("General Exception: " + e.getMessage());
	        }
	}

}
