public class CreatingStrings 
{
  public static void main(String[] args) 
  {
    String string1 = "Created this using a string literal";
    String string2 = new String("Using a string constructor that expects a string literal");
    char[] chars = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
    String string3 = new String(chars);

    System.out.println(string1);
    System.out.println(string2);
    System.out.println(string3);
  }
}