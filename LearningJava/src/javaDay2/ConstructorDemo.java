package javaDay2;

public class ConstructorDemo {

	String[] name = new String[5];

	// constructor without any parameter is called automatically as the object is created
	ConstructorDemo() {
		System.out.println("This is constructor 1 without any parameter");
	}

	// constructor with parameters
	ConstructorDemo(int rollno, int id) {
		System.out.println("This is constructor 2 with parameter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo dc = new ConstructorDemo(4, 8);

		cd.name[0] = "Preeti";
		cd.name[1] = "Rashmi";
		cd.name[2] = "Sangeeta";
		cd.name[3] = "Neha";
		cd.name[4] = "Shruti";
		for (int i = 0; i < 5; i++) {
			System.out.println("The value at index " + i + " is " + cd.name[i]);
		}
NumbersOperation np = new NumbersOperation();
System.out.println("This value is called from the method in different class:" + np.doDifference(100, 50));



	}

}
