class Student1
{
int sid;
String sname;
int age;
Student1(int x, String n)
{
sid=x;
sname=n;
}
Student1(int x, String n, int z)
{
sid=x;
sname=n;
age=z;
}
void display()
{
System.out.println(sid+""+sname+""+age);
}
}
class Student2
{
public static void main(String args[])
{
Student1 s1=new Student1(45,"thanmayee",20);
Student1 s2=new Student1(42,"meghana",19);
         s1.display();
         s2.display();
}
}
