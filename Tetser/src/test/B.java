package test;

public class B implements A {
	Runnable t= new Thread(){
		public void run(){
			System.out.println("d");
		}
	};


	public void run() {
		
		System.out.println("runned");

	}
	

	public void stop() {
		System.out.println("stupped");

	}
	
	public static void main(String[] args) {
       B b= new B();
       b.t.run();
       
	}
}
