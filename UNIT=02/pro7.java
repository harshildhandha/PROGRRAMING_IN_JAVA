interface A
{
    void show();
}
class B implements A
{
    public void show()
    {
        System.out.println("Hello");
    }
    public static void main(String a[])
    {
        new B().show();
    }
}
