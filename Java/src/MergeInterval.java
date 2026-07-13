import java.util.ArrayList;
import java.util.Arrays;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] intervals= {{1, 3},{2, 6},{8, 10},{15, 18}};
        ArrayList<int[]>ans=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int[]interval : intervals){
            if(interval[0]<=end){
                end=Math.max(end,interval[1]);
                
            }else{
                ans.add(new int[]{start,end});
                start=interval[0];
                end=interval[1];
            }
           
        }
         ans.add(new int[]{start,end});
        for(int[] a:ans){
            System.out.println(a[0]+" "+a[1]);

        }
        
    }
   
}
