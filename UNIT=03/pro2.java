
class ArithmeticDemo
 {
    public static void main(String[] args)
	 {
        try
		 {
            int a = 10;
            int b = 0;
            int c = a / b;

            System.out.println("Answer = " + c);
        }
        catch (ArithmeticException e)
		 {
            System.out.println("Arithmetic Exception");
        }
    }
}
