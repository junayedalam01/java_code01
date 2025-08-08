import java.util.Scanner;
public class cla{

	public static void main(String[]args){

   int a,b,c;

   System.out.print("Enter fast number: ");
   Scanner sc=new Scanner(System.in);
   a=sc.nextInt();
   System.out.print("Enter scand number: ");
   b=sc.nextInt();
   System.out.print("Enter your ");
   c=sc.nextInt();
   switch(c){

   case 1:c=a+b;
   System.out.print("addition " +c);
       break;

   	case 2:c=a-b;
    System.out.print("substrac " +c);
        break;
   	case 3:c=a*b;
    System.out.print("multi " +c);
        break;
   	case 4:c=a/b;
    System.out.print("Division " +c);
        break;
   	case 5:c=a%b;
    System.out.print("Remander " +c);
        break;
   	default:System.out.print("error....");
   }

	}
}