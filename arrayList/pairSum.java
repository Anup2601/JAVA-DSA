
import java.util.ArrayList;

class pairSum{

    public static boolean sol(ArrayList<Integer> list,int Target){
        int l=0,r=list.size()-1;
        while(l!=r){
            if(list.get(l)+list.get(r)==Target){
                return true;
            }
            if(list.get(l)+list.get(r)<Target){
                l++;
            }
            if(list.get(l)+list.get(r)>Target){
                r--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        int Target=50;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(sol(list,Target));
    }
}