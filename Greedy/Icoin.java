
import java.util.Arrays;
import java.util.Comparator;

public class Icoin {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,200,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());
        int amount=590;
        int note=0;
        for(int i=0;i<coins.length;i++){
            if(amount>=coins[i]){
                while(amount>=coins[i]){
                    amount-=coins[i];
                    note++;
                }
            }
        }
        System.out.println("Number of note required= "+note);
    }
}
