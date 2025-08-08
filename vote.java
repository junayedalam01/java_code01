import java.util.Scanner;
public class vote{
	public static void main(String[]args){

		int age;
		System.out.println("Enter your age:- ");

		Scanner vote=new Scanner(System.in);

		age=vote.nextInt();
		if(age >= 18){
			System.out.print("your voting");
		}

		else{

			System.out.print("your not voting ?");
		}
	}
}