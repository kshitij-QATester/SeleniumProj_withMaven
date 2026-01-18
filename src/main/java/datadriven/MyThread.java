package datadriven;

public class MyThread extends Thread {
	
	
	public void run() {
        for (int i = 1; i <= 3; i++) {
        //    System.out.println("Thread running: " + i);
            System.out.println("Thread: " + Thread.currentThread().getName());
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread m1=new MyThread();
//MyThread m2=new MyThread();
//MyThread m3=new MyThread();
m1.start();
//m2.start();
//m3.start();
	}

}
