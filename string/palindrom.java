class palindrom{
    public static void main(String[] args) {
        String str="aabbaa";
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)==str.charAt(str.length()-i-1)){
                System.out.println(str+ "is palindrom");
            }
            else
            System.out.println(str+ "is not palidrom");
        }
    }
}