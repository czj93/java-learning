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
	// interface 中的方法都是 public abstract, 所以 java 可以忽略这些修饰词
	// 子类继承 实现接口的时候 方法需要加上， 否则编译报错
	public void m1(){
		System.out.println("b m1");
	}
}

