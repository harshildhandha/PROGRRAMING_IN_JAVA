
class ThrowsDemo 
	{
    static void show() throws InterruptedException
	 {
        Thread.sleep(1000);
        System.out.println("Hello Java");
    }

    public static void main(String[] args)
	 {
        try 
	{
            show();
        }
        catch (InterruptedException e)
	 {
            System.out.println("Error occurred");
        }
    }
}
