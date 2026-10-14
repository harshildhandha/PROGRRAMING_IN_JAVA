
class Outer 
{
    static class Inner 
	{
        void display() 
	{
            System.out.println("Static inner class");
        }
    }

    public static void main(String[] args)
	 {
        Outer.Inner i = new Outer.Inner();
        i.display();
    }
}
