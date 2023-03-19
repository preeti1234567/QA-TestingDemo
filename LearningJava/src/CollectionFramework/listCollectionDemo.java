package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class listCollectionDemo {

	public static void main(String[] args) {
		//1)	Write a program to create a list and add 5 strings in that List.
		ArrayList<String> list = new ArrayList<String>();
		list.add("Grapes");
		list.add("Apple");
		list.add("Orange");
		list.add("Pears");
		list.add("Banana");
		//Write a program to iterate and print 5 strings of List using Iterator and for loop.
		System.out.println("Printing of list item using for loop: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Printing the item using iterator:");
		Iterator<String> iterator = list.iterator();
		int i = 0;
		while (iterator.hasNext() && i < 5) {
			System.out.println(iterator.next());
			i++;
		}
		//	Write a program to add 5 student objects in the list.
ArrayList<String> student = new ArrayList<String>();
student.add("Student1");
student.add("Student2");
student.add("Student3");
student.add("Student4");
student.add("Student5");
//Write a program to iterate and print names of the 5 students added to the above List. Use for loop and Iterator.
Iterator<String> it = student.iterator();
while (it.hasNext()) {
	System.out.println("Name of the students are: "+it.next());
}

	}
}



