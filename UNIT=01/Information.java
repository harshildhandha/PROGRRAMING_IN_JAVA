import java.util.*;

class Infomation {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Name: ");
        String n = s.next();

        System.out.print("Age: ");
        int a = s.nextInt();

        System.out.print("City: ");
        String c = s.next();

        System.out.println(n);
        System.out.println(a);
        System.out.println(c);
    }
}
