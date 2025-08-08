import java.util.Scanner;
public class else_if_condition{
	public static void main(String[]args){

	int marks;
	System.out.print("Enter your marks:- ");
    Scanner pa=new Scanner(System.in);
    marks=pa.nextInt();

    if(marks >=95){
    	System.out.print("your A+ marks");


    }
    else if(marks>=89){
    	System.out.print("your A marks");

    }
     else if(marks>=80){
     	System.out.print("your a B+ marks");


     }else if(marks>=70){
     	System.out.print("your a B marks");
     }else if(marks>=60){
     	System.out.print("your a C+ marks");
     }else if(marks>=50){
     	System.out.print("your a C marks");
	}else{
		System.out.print("try agine.........?");
	}
	}
}