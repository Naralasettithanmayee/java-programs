class Animal
{
void eat()
{
System.out.println("eating");
}
}
class Dog extends Animal
{
void bark()
{
System.out.println("barking");
}
}
class Animal1
{
public static void main(String args[])
{
Dog d1=new Dog();
         d1.bark();
         d1.eat();
}
}

