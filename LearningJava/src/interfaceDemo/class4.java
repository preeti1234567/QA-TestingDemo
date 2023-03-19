package interfaceDemo;

public class class4 extends class3 {

int num1=2;

	
	public void doNothing() {
		
		System.out.println (num1);
		System.out.println("I am implementing the abstract class function in class3 by extending in class4");
		
	}
public static void main(String[] args) {
	class4 c4=new class4();
	c4.doNothing();
	
}
@Override
public void doAnything() {
	// TODO Auto-generated method stub
	
}
@Override
public void doSomething() {
	// TODO Auto-generated method stub
	
}
}
