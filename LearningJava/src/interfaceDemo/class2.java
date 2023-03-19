package interfaceDemo;

public class class2 implements class1, class5
{

	@Override
	public  void doSomething() {
		System.out.println("I am an interface in class1 and body is implemented in class2");
		
	}
	public void doAnything() {
		System.out.println("I am an interface in class5 and body is implemented in class2");
		
	}
public static void main(String[] args) {
	class2 c2 =new class2();
	c2.doSomething();
	c2.doAnything();
	//variable declared in interface is static and final or constant
	String p=class1.name;
	System.out.print(p);
}


}
