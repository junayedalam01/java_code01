import java.util.Scanner;
public class if_else_condition{
	public static void main (String[]args){


    int pwd;
    System.out.println("Enter the password:-  ");
    Scanner pass=new Scanner(System.in) ;
    pwd=pass.nextInt();
    if(pwd ==123){

     System.out.println("welcome my web page junayed");

    }

   else{
    System.out.println("invled password !");

   }

	}
}