
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Comparator;


// public class ActivitySelection {
//     public static void main(String[] args) {
//         int[] start={1,3,0,5,8,5};
//         int[] end={2,4,6,7,9,9};
//         // shorting 
//         int Activities[][]= new int[start.length][3];
//         for(int i=0;i<start.length;i++){
//             Activities[i][0]=i;
//             Activities[i][1]=start[i];
//             Activities[i][2]=end[i];
//         }

//         // lamda function
//         Arrays.sort(Activities, Comparator.comparingDouble(o->o[2]));
//         // End Time basis sort
//         int maxActivity=0;
//         ArrayList<Integer> ans =new ArrayList<>();
//         // 1st activity
//         maxActivity=1;
//         ans.add(Activities[0][0]);
//         int lastEnd=Activities[0][2];
//         for(int i=0;i<end.length;i++){
//             if(start[i]>=lastEnd){
//                 maxActivity++;
//                 ans.add(Activities[i][0]);
//                 lastEnd=Activities[i][2];
//             }
//         }
//         System.out.println("MaxActivity is :- "+ maxActivity);
//         for(int i=0;i<ans.size();i++){
//             System.out.print("A"+ans.get(i)+ " ");
//         }
//         System.out.println();
//     }
// }

public class ActivitySelection{
    public static void main(String[] args) {
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};
        int maxAct=0;
        int[][] Activities=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            Activities[i][0]=i;
            Activities[i][1]=start[i];
            Activities[i][2]=end[i];
        }
        Arrays.sort(Activities, Comparator.comparingDouble(o->o[2]));
        ArrayList<Integer> ans=new ArrayList<>();
        maxAct=1;
        ans.add(Activities[0][0]);
        int lastEnd=Activities[0][2];
        for(int i=0;i<end.length;i++){
            if(start[i]>=lastEnd){
                maxAct++;
                ans.add(Activities[i][0]);
                lastEnd=Activities[i][2];
            }
        }
        System.out.println("Total Activity="+ maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ ans.get(i)+" ");
        }
        System.out.println();
    }
}