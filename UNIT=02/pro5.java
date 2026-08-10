class A
{
    void show()
    {
        System.out.println("Hello");
    }
}
class B extends A { }
class C extends A
{
    public static void main(String a[])
    {
        new B().show();
        new C().show();
    }
}
