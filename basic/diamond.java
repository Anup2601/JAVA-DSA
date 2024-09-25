class diamond{
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // for space 
            for (int j = 1; j <=10-i; j++) {
                System.out.print(" ");
            }
            // for stars  
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            // for space 
            for (int j = 1; j <= 10-i; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        for (int i = 10; i >= 0; i--) {
            // for space 
            for (int j = 1; j <=10-i; j++) {
                System.out.print(" ");
            }
            // for stars  
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            // for space 
            for (int j = 1; j <= 10-i; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}