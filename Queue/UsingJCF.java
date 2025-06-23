
import java.util.LinkedList;
import java.util.Queue;

public class UsingJCF{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(12);
        q.add(18);
        q.add(16);
        q.add(17);
        q.add(14);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}