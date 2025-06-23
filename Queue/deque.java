
import java.util.Deque;
import java.util.LinkedList;

class deque{
    public static void main(String[] args) {
        Deque<Integer> de=new LinkedList<>();
        de.addFirst(12);
        de.addFirst(13);
        System.out.println(de);
        de.removeFirst();
        System.out.println(de);
        de.addLast(1);
        de.addLast(2);
        System.out.println(de);
        de.removeLast();
        System.out.println(de);
        System.out.println(de.getFirst());
        System.out.println(de.getLast());
    }
}