
import java.util.ArrayList;

public class reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(30);
        list.add(5);
        list.add(6);

        
        int max=Integer.MIN_VALUE;
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)>max){
                max=list.get(i);
                System.out.println("Max value is :-"+max);
            }
            System.out.println(list.get(i)+ " ");
        }

    }
}
