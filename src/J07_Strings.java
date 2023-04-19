import java.util.*;
public class J07_Strings {

    public static void main(String[] args) {
        // two ways to create string 
        String str1 = "Hello Anand";
        String str2 = new String("Bye Anand");
        String strn1 = null;
        String strn2 = null;


        // Methods of String
        System.out.println( "Hello".length()  ); // return the size of string objct
        System.out.println( str1.length() );

        System.out.println("Hello".equals("Hello")); // equals
        System.out.println(str1.equals(str2));
        System.out.println("HELLO".equalsIgnoreCase("hello") ); // equals ignore case

        // System.out.println("Null Equals: "+ strn1.equals(strn2)); // Error: java.lang.NullPointerException 

        System.out.println( "Null equals: " + Objects.equals(strn1,strn2));  // hendls error


        System.out.println(str2.charAt(0));
        
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(2, 8));

        String str3 = str1.concat(" "+str2 + " Hello Bye Hello Bye Hello Bye HEllo Bye   ");
        System.out.println( str3 );

        System.out.println(str3.indexOf("Bye"));
        System.out.println( str3.indexOf("Bye", 13) );
        System.out.println( str3.lastIndexOf("Bye")  );

        System.out.println(str1.compareTo(str2)); // str1 -> first -> < 0 ; str1 -> second -> >0 ; ==0
        System.out.println( str1.compareToIgnoreCase(str2) );

        System.out.println( str3.toLowerCase());
        System.out.println( str3.toUpperCase() );

        System.out.println(str3.trim()); // removing whitespaces at both ends.

        System.out.println(str3.replace("Bye", "Ok"));


    }


    
}

/*
 * * * // Question
 *  about memory ( what is String Constant Pool(SCP), Heap, Stack and how string and other java methods,class use it );
 * 
 * 
 */

/*
 *
 * // JAVA
 * 
 * String is a sequence of characters. In java, objects of String are immutable which means a constant and cannot be changed once created.
 * 
 * // Memory allotment of String in java
 * Whenever a String Object is created, two objects are created- one in the Heap Area and one in the String constant pool, and the String object reference always points to the heap area object.
 * 
 *  
 * // C++
 * 
 * C++ has in its definition a way to represent the sequence of characters as an object of a class. This class is called std::string. The String class stores the characters as a sequence of bytes with functionality of allowing access to single byte character.

 string Class vs Character array:
> A character array is simply an array of characters can terminated by a null character. A string is a class which defines objects that be represented as stream of characters.
> Size of the character array has to allocated statically, more memory cannot be allocated at run time if required. Unused allocated memory is wasted in case of character array. In case of strings, memory is allocated dynamically. More memory can be allocated at run time on demand. As no memory is preallocated, no memory is wasted.
> Implementation of character array is faster than std:: string. Strings are slower when compared to implementation than character array.
> Character array does not offer much inbuilt functions to manipulate strings. String class defines a number of functionalities which allow manifold operations on strings.



 */