package org.testleaf.week3.day2;

public class LearnStrings {

   public static void main(String args[]){
     //Declare a String
     //By Literal
     String name1="Testleaf";

     String name3="Testleaf";

    //By Instantiation
    String name2=new String("Testleaf"); 

    String name4=new String("Testleaf");

//   == will compare the reference address of 2 Strings
//   .equals compares the value of 2 Strings

//==
System.out.println(name1==name3);
System.out.println(name1==name2);
System.out.println(name2==name4);

//.equals
System.out.println(name1.equals(name2));

System.out.println("---------------------------");

String batch="Selenium";
//length
int lengthOfString = batch.length();
System.out.println("lengthOfString is "+lengthOfString);

//toUpperCase
//Selenium   --->SELENIUM
String upperCase = batch.toUpperCase();
System.out.println("upperCase is "+upperCase);

//toLowerCase - convert the String to lowercase
//Selenium   --->selenium

//.equals and contains
//.equals - compares the exact value
//contains - compare the partial

//contains
boolean contains = batch.contains("Sele");
System.out.println("contains is "+contains);

//equalsIgnoreCase
//Selenium   --->   sEleNium
boolean equalsIgnoreCase = batch.equalsIgnoreCase("sEleNium");
System.out.println("equalsIgnoreCase is "+equalsIgnoreCase);

String batchName="Sel Feb 2025";
int length=batchName.length();
System.out.println(length);

//chartAt
char charAtIndex2 = batchName.charAt(2);
System.out.println("charAtIndex2 is : "+charAtIndex2);

//toConvert a String into CharacterArray
String companyName="TestLeaf";

char[] charArray = companyName.toCharArray();
System.out.println(charArray[5]);

String team="Indian Team";

//split
String[] split = team.split("a");
System.out.println(split[1]);

//subString
String substring = team.substring(5);
System.out.println("substring is "+substring);

String substring2 = team.substring(2, 5);
System.out.println("substring2 is : "+substring2);

System.out.println("-----------------------");

String amount="$1000";

//replaceAll
String replaceAll = amount.replaceAll("[$]", "");
System.out.println("replaceAll is: "+replaceAll);

int rupee=100;

System.out.println(amount+rupee);  //1000100
//Convert String into int - Integer -parseInt
int int1 = Integer.parseInt(replaceAll);
System.out.println(int1+rupee);

        }

}



