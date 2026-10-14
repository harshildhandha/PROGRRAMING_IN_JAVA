
class Outer {
    class Inner {
        void display() {
            System.out.println("Inner class");
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.display();
    }
}
