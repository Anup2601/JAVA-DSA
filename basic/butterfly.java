class butterfly{
    public static void main(String args[]){
        // first half
        for (int i = 1; i <=10; i++) {
            // star printing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }   
            // space printing
            for (int k = 1; k <= 2*(10-i); k++) {
                System.out.print(" ");
            }
            // star printing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // second half 
        for (int i = 10; i >= 0; i--) {
            // star printing 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }   
            // space printing 
            for (int k = 1; k <= 2*(10-i); k++) {
                System.out.print(" ");
            }
            // star printing 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        
        }
    }
}