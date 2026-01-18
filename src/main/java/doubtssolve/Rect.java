package doubtssolve;

public class Rect extends Shape {
//           4,     5,      6
	double length, width, height;
//               4              5              6
    Rect(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
	
	@Override
	void area() {
		// TODO Auto-generated method stub
		double c= 2 * (length * width + width * height + height * length);
		System.out.println("Area of Rectangle:- "+c);
	}

	@Override
	void volume() {
		// TODO Auto-generated method stub
		double d= length * width * height;
		System.out.println("Volume of Rectangle:- "+d);
	}

}
