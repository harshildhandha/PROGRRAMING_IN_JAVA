class A
{
    void show()
    {
        System.out.println("Hello");
    }
}
class B extends A
{
    public static void main(String a[])
    {
        new B().show();
    }
}
