abstract class animal{

  public abstract void sound();

}
class Dog extends animal
{
public void sound(){
	System.out.println("Dog is Barking ");
}

}
class Lion extends animal
{

public void sound(){
	System.out.println("Lion is Barking ");

}
}
class text 
{
	public static void main(String[]args){
		Dog obj=new Dog();
		Lion obj1=new Lion();
		obj.sound();
		obj1.sound();
	}
}