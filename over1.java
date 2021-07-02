class Over
{
void add(int x)
{
int sum=x+x;
System.out.println("sum is:"+sum);
}
void add(int x,int y)
{
int sum=x+y;
System.out.println("sum is:"+sum);
}
void add(int x,int y,int z)
{
int sum=x+y+z;
System.out.println("sum is:"+sum);
}
}
class Over1
{
public static void main(String args[])
{
Over oa1=new Over();
          oa1.add(10);
          oa1.add(10,20);
          oa1.add(10,20,30);
}
}