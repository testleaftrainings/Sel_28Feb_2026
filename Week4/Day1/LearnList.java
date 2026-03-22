package org.testleaf.week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

public static void main(String args[]){

    //Declare a List
    List<String> learners =new ArrayList<String>();

    //Printing the List
    System.out.println("The List is : "+learners);

    //add the element
    learners.add("Bharath");
    System.out.println("The List is: "+learners);

    learners.add("Venkatesh");
    learners.add("Maha");
    System.out.println("The List is : "+learners);

    //List will allow duplicates
    learners.add("Venkatesh");
    System.out.println("The List is : "+learners);
 
    //add by using index
    learners.add(1, "Siva");
    System.out.println("The List is : "+learners);

    //Remove a data
    //learners.remove(2);
    learners.remove("Venkatesh");
    System.out.println("The List is : "+learners);

 //Retrieve a Value - get
String valueAtIndex2 = learners.get(3);
System.out.println("valueAtIndex2 is : "+valueAtIndex2);

//Sort the Collection
Collections.sort(learners);
System.out.println("The List is : "+learners);

//size()
int size = learners.size();
System.out.println("The size is : "+size);

//Clear all the element
//learners.clear();
//System.out.println("The List is: "+learners);
               }
}
