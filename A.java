// import java.util.Scanner;
class A{
	public static void Add(){     //method
	int a=10,b=20;
	System.out.println("sun= "+a+b);
	}


	public static void main (String[]args){
 
		A r=new A();
		r.input();   //Object
		r.Disp();   //Object
		A.Add();  //Object
        r.Disp();
        A.Add();
	}
	void Disp(){  //method

		System.out.println("hello world");
	}	
	void input(){    //method
		
	}
}