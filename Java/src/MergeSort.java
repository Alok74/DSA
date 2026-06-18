import java.util.Arrays;
class MergeSort {
    public void merge(int[] arr,int st,int mid,int end){
        int[] ans = new int[end-st+1];
        if(st>=end)return;
        int i=st,j=mid+1;
        int k=0;
        while(i<=mid&&j<=end){
            if(arr[i]<arr[j]){
                ans[k++]=arr[i];
                i++;
            }else{
                ans[k++]=arr[j];
                j++;
            }
        }
        while(i<=mid){
            ans[k++]=arr[i++];
        }
        while(j<=end){
            ans[k++]=arr[j++];
        }
        for(int p=0;p<ans.length;p++){
            arr[st+p]=ans[p];
        }

    }
    public void mergeHelper(int[] arr,int st,int end){
        if(st>=end)return;
        int mid=(st+end)/2;
        mergeHelper(arr,st,mid);
        mergeHelper(arr,mid+1,end);
        merge(arr,st,mid,end);
    }
    public static void main(String[] args) {
        int[] arr= {7, 4, 1, 5, 3,4,1};
        int n=arr.length;
        MergeSort s=new MergeSort();
        s.mergeHelper(arr,0,n-1);
//        System.out.println(Arrays.toString(arr));
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
