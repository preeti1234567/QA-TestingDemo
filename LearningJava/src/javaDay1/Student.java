package javaDay1;
////1)	Write a program to create Student class with name,age, marks and address attributes.
public class Student {
String name = "Preeti";
int age = 10;
double marks = 95.5 ;
// Write a program to create Student object using parametrized constructor by passing all the attribute values in the constructor.
Student (String name,int age, double marks){
System.out.println ("Name of the student is: " + name);
System.out.println ("Age of the student is: " + age);
System.out.println ("Marks of the student is: " + marks);
}

//constructor without any parameter
	Student() {
		System.out.println ("This is the constructor without any parameter");
}


	public static void main(String[] args) {
		
//Write a program to create object of Student class.
		Student sd = new Student();
		System.out.println (sd.name);		
		//Student cd = new Student("Preeti",10,60);
		
//Write a program to keep Student objects in an array.
//create an array of Student object   
		Student[] obj = new Student[5] ;
		//create & initialize actual product objects using constructor  
		obj[0] = new Student("Rashmi",15, 99);
		obj[1] = new Student("Shruti",15, 70);
	 
		 
		
		
		
	}

}
