public class SubarrayOne {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n=arr.length;
        int[] pre=new int[n];
        int[] suff=new int[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=Math.max(arr[i],pre[i-1]+arr[i]);
        }
        suff[n-1]=arr[n-1];
        for (int i=n-2;i>=0;i--){
            suff[i]=Math.max(arr[i],suff[i+1]+arr[i]);
        }
        int ans=pre[0];
        for (int i=0;i<n;i++){
            ans=Math.max(ans,pre[i]);
        }

        for (int i = 1; i < n - 1; i++) {
            ans = Math.max(ans, pre[i - 1] + suff[i + 1]);
        }
        System.out.println(ans);
    }

}
