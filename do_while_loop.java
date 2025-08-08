import java.util.Scanner;
public class do_while_loop{
	public static void main(String[]args){

      int num;
        System.out.print("enter value : ");
        Scanner loop = new Scanner(System.in);
        num=loop.nextInt();
        do{
        	System.out.println(num);
        	++num;
        }
        while(num<=10);


	}
}