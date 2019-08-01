/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avinashkumarprajapati.datastructure.basic;
/* IMPORTANT: Multiple classes and nested static classes are supported */

// uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;



// uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


class Person
{
	   String name;
   int age;
  public Person(){}
   
            public Person(String name) {
     this.name = name;
  
  }
  public Person(int age) {
     
     this.age = age;
  }
  public String getName() {
     return this.name;
  }
    public int  getAge() {
     return this.age;
  }

}

//ArrayList<Person> arr = new ArrayList<Person>();
//arr.add(new Person(10, "joe"));
	
	

public class TestClass 
{static int count=0;
   public static void main(String args[] ) throws Exception
   { Person1 person = new Person1();
   int flag=0;
   
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList arr = new ArrayList();

     //Read input from stdin and provide input before running
 	//System.out.println("ENTER  no .of names");
        int N = Integer.parseInt(br.readLine());//no. of names invited
      //  System.out.println("ENTER Total no .of people");
 	int Q =Integer.parseInt(br.readLine());// total invited people
        for (int i = 0; i < Q; i++)
        { 
        	if(Q<N)
        	{ flag=1;
        		break;
        		
        	}
                int  x;
        //	 System.out.println("want to enter name 1 or age 2 ");
                 x= Integer.parseInt(br.readLine());
                 switch(x)
                 {
        	 //if(x=='n')
                     case 1:
          //    System.out.println("Enter name");
                         person.name= br.readLine().toLowerCase();
                         arr.add(person.name);
                     break;
        	 //else if('a')
                     case 2:
            //             System.out.println("Enter age");
                     person.age=Integer.parseInt(br.readLine());
                      arr.add(person.age);
                     break;
                     default:
        	 {
         //   System.out.println("wrong input.......input it again");
        	// i--;
        	 continue;
        	 	
        	 }
        }
   }
        
        
 if(flag==1)
   {   System.out.println("Total no. of people are less than names");
   }
  // System.out.println("Enter age and name");
   int agee=Integer.parseInt(br.readLine());
   //System.out.println("Enter name");
   String nnaame=br.readLine().toLowerCase();
 findPerson(agee,nnaame,arr,Q);
System.out.println(count);
   }
    
 
 
// System.out.println("Hello World!");
    
 
   public static void findPerson(Integer age,String name,ArrayList arr,int Q)
   {for (int i=0;i<Q;i++) {
               if(arr.get(i)==age)
               {
                   count++;
               }
                 if(arr.get(i)==name)
                 {count++;}
               }
       
       
   }
   
   
}
