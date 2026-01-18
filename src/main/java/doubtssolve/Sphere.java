package doubtssolve;

public class Sphere extends Shape {

	double radius;

    Sphere(double radius) {
        this.radius = radius;
    }
	
	
	
	@Override
	void area() {
		// TODO Auto-generated method stub
		double a= 4 * Math.PI * radius * radius;
		System.out.println("Area of Spehere:- "+a);
	}

	@Override
	void volume() {
		// TODO Auto-generated method stub
		double b= (4.0 / 3.0) * Math.PI * radius * radius * radius;
		System.out.println("Volume of Spehere:- "+b);
	}

}
