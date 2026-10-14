
class Outer
 {
    interface Inner 
{
        void show();
    }
}

class NestedDemo implements Outer.Inner 
{
    public void show()
 {
        System.out.println("Nested interface");
    }

    public static void main(String[] args)
 {
        NestedDemo d = new NestedDemo();
        d.show();
    }
}
