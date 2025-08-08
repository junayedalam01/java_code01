import java.util.Scanner;
public class for_loop{
	public static void main(String[]args){

    int num;
    System.out.print("Enter number: ");
    Scanner loop=new Scanner(System.in);
    num=loop.nextInt();
   for(int i=1;i<=10;i++){
   	System.out.println(num*i);

   }


	}
}