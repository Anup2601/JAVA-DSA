
import java.util.Stack;

public class ReversStack {
    public static void revers(Stack<Integer> s){
        if(s.isEmpty()){
           return;
        }
        int Top=s.pop();
        revers(s);
        pushAtBottom(s,Top);
    }

    public static void pushAtBottom(Stack<Integer> s, int top){
        if(s.isEmpty()){
            s.push(top);
            return;
        }
        int Top=s.pop();
        pushAtBottom(s, top);
        s.push(Top);
    }
    public static void print(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.print(s.pop()+"");
        }
        
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(21);
        s.push(22);
        s.push(23);
        s.push(24);
        // print(s);
        System.out.println("------------");
        revers(s);
        print(s);
    }
}
