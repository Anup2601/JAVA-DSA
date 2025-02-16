 

class Permutation{
    public static void sub(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            String ns=s.substring(0,i)+s.substring(i+1);
            sub(ns, ans+c);
        }
    }
    public static void main(String[] args) {
        String s="abc";
        sub(s, "");
    }
}