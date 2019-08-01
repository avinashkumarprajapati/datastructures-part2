package com.avinashkumarprajapati.datastructure.basicexamples;

/**
 *
 * @author AVINASH KUMAR
 */

public class DataStructure1 {
	public static DataStructure1 i = new DataStructure1();
	public int a = 2;
	static int ii = 90;

	public void happy() {
		int ii = 89;
// int a=23;
//a=90;
		System.out.println(a);
	}

	static { // super();
		int ii = 8;
		int a = 2;

		float aa = 2;
		long i = 90;
		double aaa = 2;
		System.out.println(~10);
		System.out.println(a >>> 3);
		System.out.println(a << 3);
		System.out.println(a);
		System.out.println(aa);
		System.out.println(aaa);
		new DataStructure1().ii = 19;
		System.out.println("i am local ii= " + ii);
		System.out.println("ii = " + new DataStructure1().ii + "FastLane");
//int  x =(int)((10<6)?"lk":("asdf"));  

	}

	public static void main(String[] args) {

		// DataStructure1 w= new DataStructure1();
		i.a = 123;
		i.happy();
		System.out.println("" + i.a);
		// TODO code application logic here
		// System.out.println(~10);
	}

}

class P extends DataStructure1 {
	public static void main(String[] args) {
		// TODO code application logic here
		// System.out.println(~10);
	}
}
