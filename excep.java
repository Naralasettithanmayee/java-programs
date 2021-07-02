import java.util.*;
class Excep
{
public static void main(String args[])
{
Scanner Sc = new Scanner(System.in);
int a,b,c,size;
System.out.println("enter a value");
  a=Sc.nextInt();
System.out.println("enter b value");
  b=Sc.nextInt();
System.out.println("enter size");
  size=Sc.nextInt();
try 
{
c=a/b;
System.out.println(" c="+c);
int d[]=new int[size];
System.out.println(d.length);
System.out.println(d[5]);
}
catch(ArithmeticException ae1)
{
System.out.println("don't enter zero");
}
catch(NegativeArraySizeException ae2)
{
System.out.println("don't enter negative");
}
catch(ArrayIndexOutOfBoundsException ae3)
{
System.out.println("out of range");
}
}
}


