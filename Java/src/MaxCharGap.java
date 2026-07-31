public class MaxCharGap {
    public static void main(String[] args) {
        String str="socks";
        int[] arr=new int[26];
        for(int i=0;i<26;i++){
            arr[i]=-1;
        }
        int ans=-1;
        for(int i=0;i<str.length();i++){
            int ch=str.charAt(i)-'a';
            if(arr[ch]==-1){
                arr[ch]=i;
            }
            else{
                ans=Math.max(ans,i-arr[ch]-1);
            }
        }
        System.out.println(ans);
    }
}
