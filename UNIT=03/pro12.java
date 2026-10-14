
class LocalDemo
 {
    void display() 
{
        class Inner 
{
            void show()
 {
                System.out.println("Local inner class");
            }
        }

        Inner i = new Inner();
        i.show();
    }

    public static void main(String[] args)
 {
        LocalDemo d = new LocalDemo();
        d.display();
    }
}
