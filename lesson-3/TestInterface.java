public class TestInterface {
	public static void main(String[] args){
		B b = new B();
		b.m1();
	}

}

interface A{
	void m1();
}

class B implements A{
	void m1(){
		System.out.println("b m1");
	}
}

