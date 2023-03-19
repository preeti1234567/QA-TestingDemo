package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



public class collectionDemo1 {
	String name;
	int marks;

	public collectionDemo1(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<collectionDemo1> studentList = new ArrayList<collectionDemo1>();
		studentList.add(new collectionDemo1("Preeti", 90));
		studentList.add(new collectionDemo1("Rashmi", 75));
		studentList.add(new collectionDemo1("Sweta", 45));
		studentList.add(new collectionDemo1("Neeta", 40));

		// add the iterator in the studentList
		Iterator<collectionDemo1> it = studentList.iterator();

		while (it.hasNext()) {

			collectionDemo1 student = it.next();
			if (student.getMarks() < 50) {
				it.remove();
			}
		}

		for (collectionDemo1 st : studentList) {
			System.out.println(st.getName() + ": " + st.getMarks());
		}
		ArrayList<Object> storeNames = new ArrayList<>();
		storeNames.add("Anand1");
		storeNames.add("Anand2");
		storeNames.add("Anand3");
		storeNames.add("Anand4");
		storeNames.add(10.52);
		storeNames.add(1000);

		for (Object name : storeNames) {

			System.out.println("Name is: " + name);
		}

		HashMap<String, String> storePersons = new HashMap<>();
		storePersons.put("Hyd1", "Anand1");
		storePersons.put("Hyd2", "Anand2");
		storePersons.put("Hyd3", "Anand3");
		storePersons.put("Hyd4", "Anand4");

		Set <String> allKeys = storePersons.keySet();

		for (String eachKey : allKeys) {
			System.out.println("Value stored at: "+eachKey +" is "+ storePersons.get(eachKey));

		}

	}
}
