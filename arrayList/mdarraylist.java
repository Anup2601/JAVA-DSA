
import java.util.ArrayList;

class mdarraylist{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();
        ArrayList<Integer>list4=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list3.add(9);
        list3.add(10);
        list3.add(11);
        list3.add(12);
        list4.add(13);
        list4.add(14);
        list4.add(15);
        list4.add(16);
        mainList.add(list4);
        mainList.add(list2);
        mainList.add(list3);
        mainList.add(list1);
        System.out.println(mainList);
    }
}