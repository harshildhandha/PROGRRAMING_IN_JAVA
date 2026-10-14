
class ChainingDemo
 {
    public static void main(String[] args) 
	{
        try 
	{
            Exception e = new Exception("Main exception");
            e.initCause(new ArithmeticException("Cause"));
            throw e;
        }
        catch (Exception e) 
	{
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
}
