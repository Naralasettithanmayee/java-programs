class Emp
{
int eid;
String ename;
double sal;
void sal(double s)
{
sal=s;
sal=sal*1000;
System.out.println("sal="+sal);
}
void display(int x,String y)
{
eid=x;
ename=y;
System.out.println(eid+" "+ename);
}
}
class programmer extends Emp
{
void sal(double s)
{
sal=s;
s=sal*5;
System.out.println("sal="+s);
}
}
class Inherit
{
public static void main(String args[])
{
programmer p1=new programmer();
                       p1.sal(2500);
}
}






