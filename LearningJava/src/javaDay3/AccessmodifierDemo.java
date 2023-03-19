package javaDay3;

import javaDay2.NumbersOperation;

public class AccessmodifierDemo {

	public static void main(String[] args) {
		NumbersOperation op = new NumbersOperation();
		System.out.println("This value is called from the method which is declared public in different class:" + op.doDifference(100, 50));
		
	}

}
