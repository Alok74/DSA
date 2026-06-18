
public class Sort012 {
//    public void swap(int[] arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
    public static void main(String[] args) {
        int[] arr={1,2,0,2,0,2,1,2,1,0};

        //==========================Using three variables =====================================
//        int zerocnt=0;
//        int onecnt=0;
//        int twocnt=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==0){
//                zerocnt++;
//            }else if(arr[i]==1){
//                onecnt++;
//            }else{
//                twocnt++;
//            }
//        }
//        int[] ans=new int[arr.length];
//        int k=0;
//        for(int i=0;i<zerocnt;i++){
//            ans[k++]=0;
//        }
//        for(int i=zerocnt;i<zerocnt+onecnt;i++){
//            ans[k++]=1;
//        }
//        for(int i=zerocnt+onecnt;i<zerocnt+onecnt+twocnt;i++){
//            ans[k++]=2;
//        }
//        for(int val:ans){
//            System.out.print(val+" ");
//        }


        int low=0;
        int mid =0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
               int temp=arr[mid];
               arr[mid]=arr[low];
               arr[low]=temp;
               low++;
               mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }else{
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
