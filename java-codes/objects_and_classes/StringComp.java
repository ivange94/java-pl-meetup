public class StringComp 
{
    public static void main(String[] args)
    {
        String string1 = new String("Hello World");
        String string2 = new String("Hello World");

        if (string1 == string2)
	{
            System.out.println("This cannot be. They are different objects");  
        }
        else 
	{
            System.out.println("It returned false since the two objects are not the same instances");
        }

        if (string1.equals(string2))
	{
            System.out.println("Both strings have the same content");
        }
	else
	{
            System.out.println("Well, some how the strings are not equal");
        } 
     }
}