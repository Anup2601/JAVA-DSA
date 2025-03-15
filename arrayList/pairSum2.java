
import java.util.ArrayList;

class pairSum2{
    public static boolean sol(ArrayList<Integer> list,int Target){
        int p=-1;
        int n=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                p=i;
                break;
            }
        }
        int left=p+1;
        int right=p;
        while(left!=right){
            if(list.get(right)+list.get(left)==Target){
                return true;
            }
            if(list.get(right)+list.get(left)<Target){
                left=(left+1)%n;
            }
            if(list.get(right)+list.get(left)>Target){
                right=(right+n-1)%n;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int target=160;
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(sol(list,target));

    }
}