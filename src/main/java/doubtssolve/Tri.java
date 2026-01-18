package doubtssolve;

public class Tri extends Shape {

	 double base, height, depth;

	    Tri(double base, double height, double depth) {
	        this.base = base;
	        this.height = height;
	        this.depth = depth;
	    }
	
	
	@Override
	void area() {
		// TODO Auto-generated method stub
		  double e= 0.5 * base * height;
		  System.out.println("Area of Triangle:- "+e);
	}

	@Override
	void volume() {
		// TODO Auto-generated method stub
		double f= (0.5 * base * height) * depth;
		System.out.println("Volume of Triangle:- "+f);
	}

}
