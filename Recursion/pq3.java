class pq3{
    public static int lenOfStr(String s){
        if(s.length()==0){
            return 0;
        }

         return lenOfStr(s.substring(1)) +1;
    }
    public static void main(String[] args) {
        String s="apple";
        System.out.println(lenOfStr(s));
    }
}