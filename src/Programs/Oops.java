package Programs;

public class Oops {
	class Demo{
		public void m1() {
			int x=10;
			int y=20;
			System.out.println(x+y);	
		}
	   public void m2() {
		   int m=1;
		   int n=2;
		   System.out.println(m+n);
	   }
	
	
	}
	class Demo2 extends Demo{
		public void m3() {
		String s="nandini";
		System.out.println("s");
		}
	}
   public static void main(String[] args) {
		// TODO Auto-generated method stub
               Demo test=new Demo();
               test.m1();
               test.m2();
               Demo2 obj1=new Demo2();
               obj1.m3();
               
	}

}