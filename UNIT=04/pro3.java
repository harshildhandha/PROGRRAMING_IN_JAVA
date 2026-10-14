
public class ThreadPriority 
{
    public static void main(String[] args) 
	{
        Thread t1 = new Thread();
        Thread t2 = new Thread();

        t1.setName("First Thread");
        t2.setName("Second Thread");

        t1.setPriority(3);
        t2.setPriority(8);

        System.out.println("Name: " + t1.getName());
        System.out.println("Priority: " + t1.getPriority());

        System.out.println("Name: " + t2.getName());
        System.out.println("Priority: " + t2.getPriority());
        }
}
