## 2.6 Conditional and Looping constructs

Normally, statements in a program are executed one after the other in the order in which they’re written. This process is 
called sequential execution. There may be a situation when you need to execute a block of code several number of times or you may
 want to execute a block just if a particular condition is met. There are java statements that make it possible to alter the normal
 sequential execution. In this section, we'll look at two of them, the `if`, `if else` and `while` statements. We'll see the remaining looping statements as we progress through the course.
 
### 2.6.1 The if statement
 
 There are two things you need to know about if statements; they make use of comparison operators and the boolean datatype.
 Comparison operators include > (greater than), < (less than), >= (greater than or equal to), <= (less than or equal to), == (equal to), != (not equal to).
 
 A boolean type in java is a logical type. It can only take two values, a true or a false. Unlike other languages like C, where boolean types are syntactic sugars for 0s and 1s, in java a boolean cannot take a 0 or a 1. It can only take a true or a false. Comparison operations in java return booleans. 
 
 **Example**
 
 ```java
 public class BooleanTypes {
 
     public static void main(String[] args) {
     
         boolean a = true;
         System.out.println(a);
         
         boolean result = 23 < 1;
         System.out.println(result);
     }
 }
 ```
 
 **Output**
 ```
 true
 false
 ```
 
 The `if` statement executes some code when a condition is true and skips that line of code if the condition is false.
 
 **Examples**
 We'll calculate the largest of two numbers
 
 ```java
 public class Largest {
 
     public static void main(String[] args) {
     
         int a = 23;
         int b = 19;
         
         if (a > b) {
             System.out.println("a is greater than b");
         }
     }
 }
 ```
 
 **Output**
 
`a is greater than b`

Lines 21 and 22 initializes two variables a and b to 23 and 19 respectively. On line 24, we have an if statement that checks if
a is greater than b. If true, which in that case it is, the code inside the curly braces is executed.
If we change the values of a and b such that the condition is false, the code in line 25 will not be executed.

### 2.6.1 if else statement

The if...else statement performs an action if a condition is true and performs a different action if the condition is false.

**Example**

```java
public class Largest2 {
 
    public static void main(String[] args) {
    
        int a = 23;
        int b = 19;
        
        if (a > b) {
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("a is not greater than b");
        }
    }
}
```

**Output**

`a is not greater than b`
