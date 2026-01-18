package doubtssolve;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sphere s1 = new Sphere(5);
        Rect s2 = new Rect(4, 5, 6);
        Tri s3 = new Tri(3, 4, 10);

      s1.area();
      s1.volume();
      
      s2.area();
      s2.volume();
      
      s3.area();
      s3.volume();
	}

}
