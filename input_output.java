import java.util.Scanner;

public class input_output{

	public static void main(String[] args){

      int a,b,c;
      System.out.println("Enter any tow  value number: ");
     
      Scanner s=new Scanner(System.in);

      a=s.nextInt();
      b=s.nextInt();

      c=a+b;

      System.out.println("your tatle value sum : "+c);
      

	}
}