class floyds{
    public static void main(String[] args) {
        int count=1;
        // outer loop
        for(int i=1;i<=5;i++){
            // inner loop 
            for(int j=1;j<=i;j++){
                System.out.print("  "+count);
                count++;
            }
            System.out.println(" ");
        }
    }
}