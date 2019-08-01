/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avinashkumarprajapati.datastructure.challenges;

/**
 *
 * @author AVINASH KUMAR
 */
/*
You cannot create an array of generic type, instead, you should do:

ArrayList<ArrayList<Individual>> group = new ArrayList<ArrayList<Individual>>(4);
As suggested by Tom Hawting - tackline, it is even better to do:

List<List<Individual>> group = new ArrayList<List<Individual>>(4);*/



/*

2
down vote
favorite
I am creating an array but cannot add values to it.

ArrayList<SMS>[] lists = (ArrayList<SMS>[])new ArrayList[count];

        for(int i=0;i<temp.size();i++)
        {
            String number="",id="";
            number = temp.get(i).addr;
            id = temp.get(i).thread_id;
            lists[i].add(temp.get(i));            // Problem here
        }
I am unable to add value to it


Answer accepted
You're creating an array of null references, so you need to initialize each of them to a new ArrayList<SMS>():

for (int i = 0; i < count; i++) {
    lists[i] = new ArrayList<SMS>();
}
shareimprove this answer

*/

/*REAL ANSWER

     public static void main(String [] args)
    {
        int count=1;
    ArrayList [] lists=new ArrayList[count];
    for (int i = 0; i < count; i++) {
    lists[i] = new ArrayList<>();
 lists[i].add("1");
}
           
          
            System.out.println(lists[0].get(0));
    }

*/
public class Important {
    
}
