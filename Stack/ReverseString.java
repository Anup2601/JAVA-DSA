
import java.util.Stack;

public class ReverseString {
    public static String task(String s){
        Stack<Character> c=new Stack<>();
        int idx=0;
        while(idx<s.length()){
            c.push(s.charAt(idx));
            idx++;
        }

        StringBuilder sb=new StringBuilder("");
        while(!c.isEmpty()){
            char curr=c.pop();
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.print(task("asdfg"));
    }
}
