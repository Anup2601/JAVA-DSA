public class inverted_halfPyramid{
    public static void main(String[] args) {
        // outer loop 
        for(int i=1;i<=5;i++){
            // space loop 
            for (int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            // star loop 
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}