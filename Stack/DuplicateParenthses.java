
import java.util.Stack;

public class DuplicateParenthses {
    public static boolean isDuplacate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1="(a+b)";
        String s2="((a+b))";
        System.out.println(isDuplacate(s1));
        System.out.println(isDuplacate(s2));
    }
}
