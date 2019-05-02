package com.java.lambdaExpressions.collectionExample;

import java.util.ArrayList;
import java.util.Collections;

public class BoWithLambdaExpression
{
	public static void main(String[] args)
	{
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("ABC", 111));
		list.add(new Employee("DEF", 333));
		list.add(new Employee("PQR", 555));
		list.add(new Employee("XYZ", 444));
		list.add(new Employee("LMN", 222));
		System.out.println(list);

		// Output without toString() method in Employee will be like:
		// [com.java.lambdaExpressions.collectionExample.Employee@7852e922]

		// Output with toString() method will look like:
		// [111:ABC, 333:DEF, 555:PQR, 444:XYZ, 222:LMN]

		// to sort employee object w.r.t emp number
		Collections.sort(list, (e1, e2) -> (e1.num < e2.num) ? -1 : (e1.num > e2.num) ? 1 : 0);
		System.out.println(list);
		
		// Output after numerical sorting will look like:
		// [111:ABC, 222:LMN, 333:DEF, 444:XYZ, 555:PQR]
		
		// to sort via employee name
		Collections.sort(list, (e1,e2)-> e1.name.compareTo(e2.name));
		System.out.println(list);
		
		// Output after alphabetical sorting will look like:
		// [111:ABC, 333:DEF, 222:LMN, 555:PQR, 444:XYZ]
	}
}

class Employee
{
	String	name;
	int		num;

	public Employee(String name, int num)
	{
		this.name = name;
		this.num = num;
	}

	public String toString()
	{
		return num + ":" + name;
	}
}
