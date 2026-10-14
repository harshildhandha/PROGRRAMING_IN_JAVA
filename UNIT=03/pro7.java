
class MyException extends Exception
	 {
    MyException(String msg)
	 {
        super(msg);
    }
}

class CustomExceptionDemo 
	{
    public static void main(String[] args)
	 {
        try 
	{
            throw new MyException("My own exception");
        }
        catch (MyException e)
	 {
            System.out.println(e.getMessage());
        }
    }
}
