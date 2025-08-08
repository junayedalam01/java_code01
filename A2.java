 class A2{
 int a=10;
 static int b=20;
 public static void main(String[] args){
     A2 r=new A2();
      A2.show();
       r.Disp();

 } static void show(){   //Static Method ...
       System.out.println(b);  //only static value acas

 }
 void Disp(){  //Non Method ...... 
    System.out.println(a+""+b);

 }

 }