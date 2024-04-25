package Queues;
import java.util.*;
public class Job_Sequencing {
    static class job{
        char jobID;
        int profit;
        int deadline;
        job(char jobID,int deadline,int profit){
            this.deadline=deadline;
            this.jobID=jobID;
            this.profit=profit;
        }
    }
    public static int CalculteProfit(job arr[]){
        int profit=0;
        int max_deadline=0;
        for(int i=0;i<arr.length;i++){
            max_deadline=Math.max(max_deadline, arr[i].deadline);
        }

        char timeline[]= new char[max_deadline];
        for(int i=0;i<timeline.length;i++){
            timeline[i]='*';
        }

        Arrays.sort(arr, (job_a, job_b) -> (job_b.profit - job_a.profit));

        for (int i = 0; i < arr.length; i++) {
            // Iterate over the timeline from the job's deadline - 1 to 0
            for (int j = arr[i].deadline - 1; j >= 0; j--) {
                // If a free slot is found in the timeline
                if (timeline[j] == '*') {
                    // Update profit
                    profit += arr[i].profit;
                    // Mark the slot with the job's ID
                    timeline[j] = arr[i].jobID;
                    break;
                }
            }
  
        }
        
        // Print the timeline
        for (int i = 0; i < timeline.length; i++) {
            System.out.print(timeline[i] + " ");
        }
        System.out.println();
        return profit;
    }
    public static void main(String[] args) {
        job jobs[] = new job[4];
        jobs[0] = new job('a', 4, 20);
        jobs[1] = new job('b', 1, 10);
        jobs[2] = new job('c', 1, 40);
        jobs[3] = new job('d', 1, 30);
        int ans = CalculteProfit(jobs);
        System.out.println(ans);
    }

}
