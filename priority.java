class A extends Thread
{
public void run()
{
System.out.println("A Thread started");
}
}
class B extends Thread
{
public void run()
{
System.out.println("B Thread started");
}
}
class C extends Thread
{
public void run()
{
System.out.println("C Thread started");
}
}
class Threadmulti
{
public static void main(String args[])
{
A a1=new A();
B b1=new B();
C c1=new C();
a1.setPriority(7);
b1.setPriority(3);
c1.setPriority(5);
a1.start();
b1.start();
c1.start();
System.out.println("A Threadpriority="+a1.getPriority());
System.out.println("B Threadpriority="+b1.getPriority());
System.out.println("C Threadpriority="+c1.getPriority());
}
}
