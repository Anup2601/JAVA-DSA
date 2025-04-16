
import java.util.LinkedList;

public class coll {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addFirst(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addLast(0);
        ll.addLast(01);
        ll.addLast(02);
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
    }
}
