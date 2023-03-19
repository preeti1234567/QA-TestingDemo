package javaDay2;

public class NumbersOperation {
	
	int num1 = 1000;
	int num2 = 4000;
	String s1 = "Preeti";
	boolean ans = true;
	int add = num1 + num2;
	int sub = num1 - num2;
	int mult = num1 * num2;
	double div = num1 / num2;
	String add1 = s1 + num1;
	
	//method in which we are getting the value
	void doSubstractionOfNumber(int firstNum, int secondNum) {
		System.out.println("Difference of two number is: "+ (firstNum - secondNum));
	}
	//method which is returning the value
	//use of public specifier
	public int doDifference(int firstNum, int secondNum) {
		int result = firstNum - secondNum;
		return result;
	}
	//method in which we are getting the value	
	//
	private void doMultiplication(int firstNum,int secondNum) {
		System.out.println ("Multiplication of two number is: "+ firstNum*secondNum);
	}
	//method which is returning the value
	int doProductOfTwoNumber (int firstNum,int secondNum) {
		int result= firstNum*secondNum;
		return result;
	}
	//method in which we are getting the value
	void doDivision (double firstNum, double secondNum) {
		System.out.println("the division of two number using '/' is: "+ firstNum/secondNum);
		System.out.println("the division of two number using '%'is: "+ firstNum%secondNum);
	}
	double doDivisionOfTwoNumber (int firstNum, int secondNum) {
		double result = firstNum % secondNum;
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumbersOperation ns = new NumbersOperation();

		System.out.println("Addition of two numbers is: " + ns.add);
		System.out.println("Substraction of two numbers is: " + ns.sub);
		System.out.println("Multiplication of two numbers is: " + ns.mult);
		System.out.println("Division of two numbers is: " + ns.div);
		System.out.println("he concatenation of string and integer is: " + ns.add1);
		System.out.println("The boolean variable stores the value:" + ns.ans);
		System.out.println("------------------------------------");		
		ns.doSubstractionOfNumber(25, 10);
		int differenceResult =ns.doDifference(7, 3);
		System.out.println("The substraction value returned from the method :" +  ns.doDifference(7, 3));
		System.out.println("------------------------------------");
		
		ns.doMultiplication(differenceResult, 7);
		ns.doMultiplication(6, 7);

		System.out.println("The multiplication value returned from the method: " + ns.doProductOfTwoNumber(9, 10));
		System.out.println("------------------------------------");
		ns.doDivision(196, 2);
		System.out.println("The division value returned from the method using '%': " + ns.doDivisionOfTwoNumber(196,2));
	}

}
