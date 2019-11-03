package com.java.objectCreation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;

public class ObjectCreationWays {
	public static void main(String[] args) {
		// Q. In how many ways we can create an object in java or in how many ways we can get object in java?

		/** 1. By using new operator **/

		ObjectCreationWays o1 = new ObjectCreationWays();

		/** 2. By using newInstance() method **/

		try {
			ObjectCreationWays o2 = (ObjectCreationWays) Class.forName("ObjectCreationWays").newInstance();
			// Note: Return type of newInstance() method is Object. Hence, we need to cast it to class type.
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		/** 3. By using factory method **/

		Runtime r = Runtime.getRuntime();
		DateFormat df = DateFormat.getInstance();

		/** 4. By using clone() method **/

		ObjectCreationWays ob1 = new ObjectCreationWays();

		try {
			ObjectCreationWays ob2 = (ObjectCreationWays) ob1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		/** 5. By using Deserialization **/

		try {
			FileInputStream fis = new FileInputStream("");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ObjectCreationWays o3 = (ObjectCreationWays) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
