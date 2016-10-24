## 3.1 Introduction to Object Oriented Programming
* **Object-oriented programming(OOP)** is a programming paradigm based on the concept of "objects", which may contain data in the 
form of 'fields', often known as attributes and behaviours in the form of methods. 
* In OOP, computer programs are designed by
making them out of objects that interact with one another. 
* In java an object is an instance of a `class`. Which means to create
an object in java you need to have a class. The class defines the type of the object.
* When building java applications you'll usually create your own classes and sometimes use some already created classes by others.

## 3.2 Using Predefined Classes
We'll start by exploring some already existing classes. The syntax for creating objects from classes in java is as follows
```java
ClassName objectName = new ClassName();
```
'ClassName' is the name of the class from which you want to create an object from. 'objectName' is the variable name for your object. It can be any valid java literal. Objects are created when you use the `new` keyword followed by a constructor. As its name implies, a constructor builds(initializes) and object with some properties. More about constructors in a later chapter.

### 3.2.1 The String Class
Strings are a sequence of characters. Strings in java are treated as objects. You have already used string objects when you displayed text with java print statements in chapter 2. Strings in java are enclosed in double quotes. For example *"Hello World"* is a string object. The Java platform provides the String class to create and manipulate strings.

#### Creating Strings
To create a string in java you will usually write
```java
String greeting = "Hello World!";
```
Whenever it encounters a string literal in your code, the compiler creates a String object with its value in this case, "Hello world!". A string like other objects can also be created using the **new** keywoard and a **constructor**. 
**Examples**
```java
public class CreatingStrings {

  public static void main(String[] args) {
    String string1 = "Created this using a string literal";
    String string2 = new String("Using a string constructor that expects a string literal");
    char[] chars = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
    String string3 = new String(chars);
    
    System.out.println(string1);
    System.out.println(string2);
    System.out.println(string3);
  }
}
```
**Output**
```
Created this using a string literal
Using a string constructor that expects a string literal
Hello World!
```
In the above code, we created 3 string objects. string1 is initiazed with a string literal. string2 is initialized using the String constructor that takes a string literal to create a string object. And the third object string3 creates a string object from an array. The we display the contents of the three string objects using the println method.

**Note** - String class is immutable. Once a string object has been created, it cannot be modified. If you need modifiable string objects, take a look at the [StringBuffer](https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html) and [StringBuilder](https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html) classes.

#### String Length
To get the length of a string, we use the `lenth()` method of the String class. We call such methods accessor method since they are used to access properties of objects. When called the length method returns the number of characters in a string.
**Example**

```java
public class StringLength {

  public static void main(String[] args) {
    String palindrome = "Dot saw I was Tod";
    int len = palindrome.length();
    System.out.printf( "String Length is: %d\n",len);  
  }
}
```
**Output**

```
String Length is: 17
```
#### Concatinating Strings
String concatination is the joining of two string objects to form one string object. The String class includes a method for concatenating two strings

`string.concat(string2);`

This returns a new string that is string1 with string2 added to it at the end. 

You can also use the concat() method with string literals, as in 

`"I can code ".concat("Hello World");`

Strings are more commonly concatenated with the + operator, as in

`"Hello" + "World" + "!"`

which results in 

`Hello World!`

**Example**
```java
public class StringConcat {

  public static void main(String[] args) {
    String greeting = "Hello World!";
    System.out.println("I am saying " + greeting);
  }
}
```
**Output**

`I am saying Hello World!`

#### Comparing Two Strings in Java
You compare strings in java using the `equals()` method of the String class. Unlike other like languages you don't use `==` to compare strings. The `==` operator when used on objects checks if the objects are the same instances not if they have the same values.

**Example**
```java
public class StringComp {

    public static void main(String[] args) {
        String string1 = new String("Hello World");
        String string2 = new String("Hello World");

        if (string1 == string2) {
            System.out.println("This cannot be. They are different objects");
        }
        else {
            System.out.println("It returned false since the two objects are not the same instances");
        }

        if (string1.equals(string2)) {
            System.out.println("Both strings have the same content");
        }
        else {
            System.out.println("Well, some how the strings are not equal");
        }
     }
}
```
**Output**

```
It returned false since the two objects are not the same instances
Both strings have the same content
```
To know more about the String class and its method, checkout the java api documentation for the [String](http://docs.oracle.com/javase/7/docs/api/java/lang/String.html) class

### 3.2.2 The Date Class
Java provides the Date class available in java.util package, this class encapsulates the current date and time. 

#### Getting the Current Date and Time
The default no-argument date constructor returns the current date and time.

**Example**
```java
import java.util.Date;

public class CurrentDateAndTime {

   public static void main(String args[]) {
      // Instantiate a Date object
      Date date = new Date();

      // display time and date using toString()
      System.out.println(date.toString());
   }
}
```

**Output**

`Mon Oct 24 23:48:09 WAT 2016`

#### Date Formatting using SimpleDateFormat class
SimpleDateFormat is a concrete class for formatting and parsing dates in a locale-sensitive manner. SimpleDateFormat allows you to start by choosing any user-defined patterns for date-time formatting.

**Example**
```java
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateFormatting {

   public static void main(String args[]) {
      Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

      System.out.println("Current Date: " + ft.format(dNow));
   }
}
```

**Output**
```
Current Date: Tue 2016.10.25 at 12:16:18 AM WAT
```
#### Date Comparison
You can compare dates in one of the three following ways
- You can use getTime( ) to obtain the number of milliseconds that have elapsed since midnight, January 1, 1970, for both objects and then compare these two values.
- You can use the methods before( ), after( ), and equals( ). Because the 12th of the month comes before the 18th, for example, new Date(99, 2, 12).before(new Date (99, 2, 18)) returns true.
- You can use the compareTo( ) method, which is defined by the Comparable interface and implemented by Date

**Example**
```java
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateComp {
  
  public static void main(String[] args) throws ParseException {
    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
    Date johnsDateOfBirth = sf.parse("1995-02-01");
    Date marysDateOfBirth = sf.parse("1992-04-5");
    
    if (johnsDateOfBirth.before(marysDateOfBirth)) {
      System.out.println("John is older than Mary.");
    }
    else {
      System.out.println("Mary is older than John");
    }
  }
}
```

**Output**
```
Mary is older than John
```

### 3.2.3 The Math Class
The Math class has a lot of static methods that you will use when writing code that does some mathematical calculations. More on the keyword in a later section.

**Example**
```java
public class MathExamples {

  public static void main(String[] args) {
    int x = 64;
    double sqrtOfX = Math.sqrt(x);
    System.out.printf("Square root of %d is %f\n", x, sqrtOfX);
    double xCube = Math.pow(x, 3);
    System.out.printf("%d^3 = %f\n", x, xCube);
    System.out.println("The absolute value of -2 = " + Math.abs(-2));
  }
}
```

## 3.3 Defining your own classes
