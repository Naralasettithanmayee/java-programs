import java.util.Scanner;
import java.util.Arrays;
class str5
{
public static void main(String args[])
{
String s;
Scanner sc=new Scanner(System.in);
System.out.println("enter the string value:");
s=sc.nextLine();
char Char[]=s.toCharArray();
Arrays.sort(Char);
System.out.println(Char);
}
}

