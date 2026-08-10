abstract class A
{
    abstract void show();
}
class B extends A
{
    void show()
    {
        System.out.println("Hello");
    }
    public static void main(String a[])
    {
        new B().show();
    }
}
