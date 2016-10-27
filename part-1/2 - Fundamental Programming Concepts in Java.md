## 2.6 Conditional and Looping constructs

Normally, statements in a program are executed one after the other in the order in which they’re written. This process is 
called sequential execution. There may be a situation when you need to execute a block of code several number of times or you may
 want to execute a block just if a particular condition is met. There are java statements that make it possible to alter the normal
 sequential execution. In this section, we'll look at two of them, the `if`, `if else` and `while` statements. We'll see the remaining looping
 statements as we progress through the course.
 
### 2.6.1 The if statement
 
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
