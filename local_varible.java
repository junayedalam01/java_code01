class local_varible{

     int a=12; // instance varibals
     static double b=2.2; // ststic varabiles


	public static void main(String[] args){

        boolean c=true; //local varibals

        local_varible s =new local_varible(); // objat in instance varibals

        // System.out.println(s.a+""+b+""+c);  // one line print 
        System.out.println(s.a);
        System.out.println(b);
        System.out.println(c);
	}
}