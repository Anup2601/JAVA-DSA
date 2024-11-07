class pattern{
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println((int)Math.pow(11, i));
        }
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}