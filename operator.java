import java.util.Scanner;
public class operator{
    public static void main(String[] args) {
        
// int a=10;
// int b=20;
//r
// System.out.println(a==b); // false
// System.out.println(a!=b); // true
// System.out.println(a<b);  // true
// System.out.println(a>b);  // false
// System.out.println(a<=b); // true
// System.out.println(a>=b); // false


//a
// System.out.println(a+b);  // 30
// System.out.println(a-b);  // -10
// System.out.println(a*b);  // 200
// System.out.println(a/b);  // 0
// System.out.println(a%b);  // 10
// System.out.println(a++);  // 10 (post-increment)

//lo

// System.out.println(a==b && a!=b); 
// System.out.println(a==b || a!=b);  
// System.out.println(!(a==b)); 
// System.out.println(a<b && a>b); 
// System.out.println(a<b || a>b);  


//=========================

// int a=10;
//a+=10 //a=a+10 add 
// System.out.println(a--);
// System.out.println(--a);//9
// System.out.println(a++);//10
// System.out.println(++a); //11
//===========

// int a=10;
// int b=20;
// int c=30;
// int x=(a>b)?(a>c?a:c):(b>c?b:c);
// System.out.println(x); // 30

//Relational operator Example...........
// int a,b;
// System.out.print("Enter value 1: ");
// Scanner sc=new Scanner(System.in);
// a=sc.nextInt();
// System.out.print("Enter value 2: ");
// b=sc.nextInt();
// System.out.println("true/false :"+(a<b));
// System.out.println("true/false :"+(a>b));
// System.out.println("true/false :"+(a<=b));
// System.out.println("true/false :"+(a>=b));
// System.out.println("true/false :"+(a==b));
// System.out.println("true/false :"+(a!=b));

//Logical Operators Example....................

System.out.println("logical And");
System.out.println((10>5)&&(2>1));    //true
System.out.println((10>5)&&(2>1));    //false
System.out.println((10>5)&&(2<1));   //false
System.out.println((10<5)&&(2>1));   //false

System.out.println("logical or ");

   System.out.println((10>5) || (2>1));    
   System.out.println((10>5) || (2>1));   
   System.out.println((10>5) || (2<1));   
   System.out.println((10<5) || (2<1));
   
   System.out.println("logical not ");

   System.out.println(!(10>5));    
   System.out.println(!(10>5));   
   System.out.println(!(10>5));   
   System.out.println(!(10<5));   
System.out.println("*********");
//Increment and Decrement Operators.......................


int a=10;
System.out.println(a);  //10
System.out.println("prepost incr...");
System.out.println(a++);  //10 (11)
System.out.println(++a);  //12

System.out.println(a);
System.out.println("prepost decr...");
System.out.println(a--); //12 (11)
System.out.println(--a);  //10

System.out.println("***");



//Assignment Operators Example ...............................

int x;
x=10; //Simple
System.out.println(x);
x+=10; //compound (a=a+10)
System.out.println(x);
x-=10; //compound (a=a+10)
System.out.println(x);

System.out.println("***");

//Ternary Operator Example in Java.............................
int ww=10,zz=2,cc=3,Max;
Max=(ww>zz) ? (ww>cc ? ww:cc) :(zz>cc?zz:cc);
System.out.println(Max);  

System.out.println("***");

//Bitwise Operators Example...................................................




}
}