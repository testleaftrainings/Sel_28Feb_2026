package org.testleaf.week1.day2;

public class LearnJavaOperators {

public static void main(String[] args) {

//Assignment operator
//Mathematical/Arithmetic
//Comparison Operator
//Logical Operator
//Increment/Operator

//Assignment operator - assigning a value to a variable (=)
int number=7;
System.out.println(number);

//Mathematical/Arithmetic  //add, sub, mul, div, mod
int a=7;
int b=3;

//add (+)
System.out.println(a+b);
//sub  (-)
System.out.println(a-b);
//mul (*) 
System.out.println(a*b);

 //Div -remainder, quotient  
 //Quotient /
 System.out.println(a/b);
 //remainder % 
 System.out.println(a%b);

//Comparison - boolean
//Compare 2 values
//The comparison is correct, it will returm is true
//The comparison is wrong, it will returm is false
int c=5;
int d=7;

//equalTo   (==)
System.out.println(c==d);

//notEqualsTo   (!=)
System.out.println(c!=d);

//lessThan   (<)
System.out.println(c<d);

//greaterThan    (>)
System.out.println(c>d);

//lessThanOrEqualTo   (<=)       
System.out.println(c<=d);

//greaterThanOrEqualsTo    (>=) 
System.out.println(c>=d);  

//Logical Operator - boolean value
//Compare 2 Conditions

//AND Operator    - 2 Conditions   &&
//OR Operator     - 2 Conditions   ||
System.out.println(c<d&&c==d);

//OR Operator     - 2 Conditions   ||
System.out.println(c<d||c==d); 

//Increment/Decrement Operator
//Increment ++  the value will be increased by 1

int s=7;
//postIncrement    (s++)
System.out.println(s++);   //7
System.out.println(s);     //8    

//preIncrement     (++s)    
System.out.println(++s);   //9

//Decrement value will be decreased by 1
//postDecrement   s--
System.out.println(s--); //9
System.out.println(s);  // 8

//preDecrement   --s
System.out.println(--s);   //7
        }
    }
