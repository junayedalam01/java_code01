class A4{
	public static void main (String []args){
     A4 obj=new A4();
     int a=obj.sum(10);
     System.out.print("sum fo = "+a);
	}
  int sum(int b){
  if (b>0){
  	return b+sum(b-1);
  }
  else{
  	return 0;
  }
  }
}