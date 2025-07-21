class substring{
    public static void sub(String str,int start,int end){
        String sum="";
        for (int i = start; i < end-1; i++) {
            sum+=str.charAt(i);
            }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        String str="ewfgaergvjek";
        int start=2;
        int end=7;
        sub(str, start, end);
    }
}