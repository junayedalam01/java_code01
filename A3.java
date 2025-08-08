import java.util.Scanner; 
class A3{
    int n,m; int add,sub,multi,dev,rem;
	
	public static void main (String[] args){
		A3 obj=new A3();
		obj.input();
		obj.Process();
		obj.output(); 

}
void input(){ //method 
	Scanner r=new Scanner(System.in);
	System.out.print("enter number");
    n=r.nextInt();
    m=r.nextInt();
 }
 void Process()  //method
 {                                     // use Methods in java 

   add=n+m;
   sub=n-m;
   multi=n*m;
   dev=n/m;
   rem=n%m;
 }
void output(){  //method


System.out.println("sum os to number: "+add);
System.out.println("sub os to number: "+sub);
System.out.println("multi os to number: "+multi);
System.out.println("dev os to number: "+dev);
System.out.println("rem os to number: "+rem);


     }

}   