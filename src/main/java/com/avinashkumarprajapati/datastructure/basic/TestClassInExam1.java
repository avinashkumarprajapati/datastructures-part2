package com.avinashkumarprajapati.datastructure.basic;

// uncomment this if you want to read input.
import java.io.BufferedReader;
import java.util.StringTokenizer;

import java.io.InputStreamReader;
import java.util.ArrayList;

class Person1 {
	String name;
	int age;

	public Person1() {
	}

	public Person1(String name) {
		this.name = name;

	}

	public Person1(int age) {

		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

}

//ArrayList<Person> arr = new ArrayList<Person>();
//arr.add(new Person(10, "joe"));

public class TestClassInExam1 {
	static int count = 0;

	public static void main(String args[]) throws Exception {
		Person person = new Person();
		int flag = 0;

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(input.readLine());
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Scanner sc = new Scanner();
		ArrayList arr = new ArrayList();

		// Read input from stdin and provide input before running
		// System.out.println("ENTER no .of names");
		int N = Integer.parseInt(tk.nextToken());// no. of names invited
		// System.out.println("ENTER Total no .of people");
		int Q = Integer.parseInt(tk.nextToken());// total invited people
		for (int i = 0; i < Q; i++) {
			if (Q < N) {
				flag = 1;
				break;

			}
			int x;
			// System.out.println("want to enter name 1 or age 2 ");
			x = Integer.parseInt(input.readLine());
			switch (x) {
			// if(x=='n')
			case 1:
				// System.out.println("Enter name");
				person.name = input.readLine().toLowerCase();
				arr.add(person.name);
				break;
			// else if('a')
			case 2:
				System.out.println("Enter age");
				person.age = Integer.parseInt(input.readLine());
				arr.add(person.age);
				break;
			default: {
				// System.out.println("wrong input.......input it again");
				// i--;
				continue;

			}
			}
		}

		if (flag == 1) {
			System.out.println("Total no. of people are less than names");
		}
		System.out.println("Enter age and name");
		int agee = Integer.parseInt(input.readLine());
		System.out.println("Enter name");
		String nnaame = input.readLine().toLowerCase();
		findPerson(agee, nnaame, arr, Q);
		System.out.println(count);
	}

// System.out.println("Hello World!");

	public static void findPerson(Integer age, String name, ArrayList arr, int Q) {
		for (int i = 0; i < Q; i++) {
			if (arr.get(i) == age) {
				count++;
			}
			if (arr.get(i) == name) {
				count++;
			}
		}

	}

}
