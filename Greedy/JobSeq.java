
import java.util.ArrayList;
import java.util.Collections;

public class JobSeq {
    static class Job{
        int deadline;
        int profit;
        int id;
        public Job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String[] args) {
        int[][] jobInfo={{4,20},{1,10},{1,30},{1,20}};
        ArrayList<Job> jobs=new ArrayList<>();
        for(int i=0;i<jobInfo.length;i++){
            jobs.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
        }
         Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);
         ArrayList<Integer> seq=new ArrayList<>();
         int time=0;
         for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
         }
         System.out.println("max job is "+seq.size());
         for(int i=0;i<seq.size();i++){
            System.out.println(seq.get(i)+" ");
         }
         System.out.println();
    }
}
