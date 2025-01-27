// friend pairing problem
class p13{
    public static int friendPairing(int n){
        if(n==1||n==2){
            return n;
        }
        return (friendPairing(n-1))+((n-1)*(friendPairing(n-2)));
    }
    public static void main(String[] args) {
        // friendPairing(2);
        System.out.println(friendPairing(3));
    }
}