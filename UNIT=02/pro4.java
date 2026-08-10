class A
{
    void show()
    {
        System.out.println("A");
    }
}
class B extends A
{
    void display()
    {
        System.out.println("B");
    }
}
class C extends B
{
    public static void main(String a[])
    {
        C c = new C();
        c.show();
        c.display();
    }
}
