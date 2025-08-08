import java.util.Scanner;

public class if_else{

    public static void main(String[]  args){

   int num1;
   int num2;
   int num3;
   System.out.println("--- @junayedalam01 ---");
    System.out.print("Enter the num1 value : ");
    Scanner sc = new Scanner(System.in);
    num1=sc.nextInt();
    System.out.print("Enter the num2 value: ");
    num2=sc.nextInt();
    System.out.print("Enter the num3: ");
    num3=sc.nextInt();
   if(num1>num2){
    if(num1>num3){
        System.out.println("getter number 2:- "+num1);

    }else{
        System.out.println("getter number 1:- "+num3);
    }
   }else{
    if(num1>num3){
        if(num2>num3){
          System.out.print("getter number :- "+num2);
        }
         
    }else{
        if(num2>num3){
             System.out.println("getter number 3:- "+num2);
        }else{
             System.out.println("getter number 3:- "+num3);
        }
       
   }
        
                
        }
    
 }
     

   


    
   } 

