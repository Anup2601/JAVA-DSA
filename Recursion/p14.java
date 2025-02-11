class p14{
    public static void printBinString(int n,int lastplace,String  sb){
        if(n==0){
            System.out.println(sb);
            return;
        }
        printBinString(n-1, 0, sb+"0");
        if(lastplace==0){
            printBinString(n-1, 1, sb+"1");
        }
    }
    public static void main(String[] args) {
        printBinString(10, 0, "");
    }
}