
import java.util.Stack;

public class ValidParenthess {
    public static boolean  isValid(String str){
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<str.length();i++ ){
            int ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }

                if((s.peek()=='(' && ch==')')||
                (s.peek()=='[' && ch==']') ||
                (s.peek()=='{' && ch=='}')
                ){
                    s.pop();
                }else{
                    return false;
                }
            }
            
        }
        if(s.isEmpty()){
                return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        String str="{[(({[][}))]}";
        System.out.println(isValid(str));
    }
}
