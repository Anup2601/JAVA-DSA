
import java.util.Arrays;
import java.util.Collections;

public class chocola {
    public static void main(String[] args) {
        int n=4,m=6;
        Integer constVer[]={2,1,3,1,4};//m-1
        Integer constHor[]={4,1,2};//n-1
        Arrays.sort(constVer,Collections.reverseOrder());
        Arrays.sort(constHor,Collections.reverseOrder());
        int h=0,v=0;
        int hp=0,vp=0;
        int cost=0;
        while(h<constHor.length && v<constVer.length){
            if(constVer[v]<=constHor[h]){
                cost+=(constHor[h]*vp);
                hp++;
                h++;
            }else{
                cost+=(constVer[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<constHor.length){
            cost+=(constHor[h]*vp);
            hp++;
            h++;
        }
        while(v<constVer.length){
            cost+=(constVer[v]*hp);
            vp++;
            v++;
        }
        System.out.println("min cost of cut "+cost);
    }
}
