package inter;

public class ChildClass implements Inter1,Inter2 {

	@Override
	public void Mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Mul "+(a*b));
	}

	@Override
	public void Div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Div "+(a/b));
	}

	@Override
	public void Add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Add "+(a+b));
	}

	@Override
	public void Sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Sub "+(a-b));
	}

	
	
}
