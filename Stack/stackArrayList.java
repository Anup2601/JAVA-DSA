
import java.util.ArrayList;

public class stackArrayList {
    static ArrayList<Integer> list= new ArrayList<>(); 
    public static boolean  isEmpty(){
        return list.isEmpty();
        }

    public static void push(int data){
        list.add(data);
    }
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        int top=list.get(list.size()-1);
        return top;
    }
    public static void main(String[] args) {
        stackArrayList s=new stackArrayList();
        s.push(10);
        s.push(11);
        s.push(12);
        s.push(14);
        s.push(15);
        s.push(16);
        s.push(17);

        while(!s.isEmpty()){
            System.out.print(s.peek()+">");
            s.pop();
        }
    }
}
