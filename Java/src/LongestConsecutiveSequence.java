import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static boolean solve(int x,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={0,3,7,2,5,8,4,6,0,1};
        int ans=1;


        //************* Brute Force **************//

        //        for(int i=0;i<arr.length;i++){
//            int x=arr[i];
//            int cnt=1;
//            while (solve(x+1, arr)==true){
//                x=x+1;
//                cnt++;
//            }
//            ans=Math.max(ans,cnt);
//        }


        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            int cnt=1;
            int x=arr[i];
            if(!set.contains(x-1)){
                cnt=1;
            }
            while (set.contains(x+1)){
                x=x+1;
                cnt=cnt+1;
            }
            ans=Math.max(ans,cnt);
        }

        System.out.println(ans);
    }
}
