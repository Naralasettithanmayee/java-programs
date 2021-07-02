interface A
{
void method1();
void method2();
}
interface B
{
void method3();
}
interface C extends A,B
{
void method4();
}
class D implements C
{
public void method1()
{
System.out.println("method1 of A");
}
public void method2()
{
System.out.println("method2 of B");
}
public void method3()
{
System.out.println("method3 of C");
}
public void method4()
{
System.out.println("method4 of  D");
}
}
class Inter
{
public  static void main(String args[])
{
D d1=new D();
    d1.method1();
   d1.method2(); 
   d1.method3();
  d1.method4();
}
}