
import java.util.ArrayList;
import java.util.Collections;

class sorting{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println("Before sorting:-"+list);
        Collections.sort(list);
        System.out.println("After acending sorting:-"+list);

        Collections.sort(list ,Collections.reverseOrder());
        System.out.println("After decnding sorting:-"+list);
    }
}