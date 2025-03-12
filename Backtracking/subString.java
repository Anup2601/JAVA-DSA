public class subString {
    public static void findsubString(String s, int n,String ans){
         if(n==s.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
         }
        // yes
        findsubString(s, n+1, ans+s.charAt(n));
        // no
        findsubString(s, n+1, ans);
    }
    public static void main(String[] args) {
        String s="abc";
        findsubString(s,0,"");
    }
}
