
import java.util.ArrayList;

class maxwater{

    public static int storewater(ArrayList<Integer> height){
        int left=0;
        int maxArea=0;
        int rigth=height.size()-1;
        while(left<rigth){
            int width=rigth-left;
            int maxheight=Math.min(height.get(left), height.get(rigth));
            int area=width*maxheight;
            maxArea=Math.max(area, maxArea);
            if(left<rigth){
                left++;
            }
            if(rigth<left){
                rigth++;
            }


        }
        return maxArea;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height =new ArrayList<>();
        // 186254837
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        // storewater(height);
        System.out.println(storewater(height));
    }
}