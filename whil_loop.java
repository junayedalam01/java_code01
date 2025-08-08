import java.util.Scanner;
public class whil_loop{
	public static void main(String[]args){

		int num;
        System.out.print("enter value : ");
        Scanner loop = new Scanner(System.in);
        num=loop.nextInt();
        while(num >=0){
        	if(num%2==0){
        		System.out.println("even number");
        		break;


        	}else{

             System.out.println("odd number!");
             break;
        	}

        }

        System.out.println("while loops...");
	}

}