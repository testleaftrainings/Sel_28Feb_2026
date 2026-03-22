package org.testleaf.week4.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {

    public static void main(String[] args) {

    //Declare a Set
    //HashSet
    //Set<String> mentors=new HashSet<String>();
    //System.out.println("The Set is : "+mentors);

    //[Vinoth, Harrish, Anburaj]

    //TreeSet
    //Set<String> mentors=new TreeSet<String>();
   
    //[Anburaj, Harrish, Vinoth]


    //LinkedHashSet
    Set<String> mentors=new LinkedHashSet<String>();
    
    //[Vinoth, Anburaj, Harrish]
    

    //add an element -add()
    mentors.add("Vinoth");

    mentors.add("Anburaj");

    mentors.add("Harrish");

    System.out.println("The Set is: "+mentors);

    //add the duplicate

    mentors.add("Vinoth");

    System.out.println("The Set after adding duplicate is: "+mentors);

    //remove method
    mentors.remove("Anburaj");
    System.out.println("The set after removing: "+mentors);

    //addALL - add all the data from one Set to Another Set
    Set<String> trainers =new LinkedHashSet<String>();
    trainers.addAll(mentors);
    System.out.println("The Trainers set is: "+trainers);



    //retrieve a particular value
    //Step1: Create a empty List and Convert Set to List
    List<String> employee =new ArrayList<String>(trainers); 
    System.out.println("The List is : "+employee);

    String elementAtIndex0 = employee.get(0);
    System.out.println("elementAtIndex0 is: "+elementAtIndex0);


    }

}
